package com.slark.pengder.service.receiver;

import com.slark.pengder.comm.UtilCheck;
import com.slark.pengder.mybatis.dao.TinstrumentMapper;
import com.slark.pengder.mybatis.dao.TusereventofterminalMapper;
import com.slark.pengder.mybatis.model.Tinstrument;
import com.slark.pengder.mybatis.model.Tusereventofterminal;
import com.slark.pengder.protocol.MessageProtos;
import com.slark.pengder.protocol.PengderMessage;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by fengwei on 16/7/20.
 */
@Service("userEventService")
public class UserEventService extends AbsReceiverService {
    private static final Logger logger = Logger.getLogger(UserEventService.class);

    /**
     * @param msg
     * @return
     * @Description 重新定义这个接口
     */
    @Transactional
    public List<PengderMessage> doService(PengderMessage msg) {
        PengderMessage resp = updateEvent2Database(msg);
        if (resp != null) {
            List<PengderMessage> resList = this.newResponeMsgList();
            resList.add(resp);
            return resList;
        }
        return null;
    }


    @Autowired
    private TusereventofterminalMapper uevMapper;
    @Autowired
    private TinstrumentMapper tinsMapper;

    /**
     * @param msg
     * @return
     * @description 更新用户事件列表到数据库
     */
    protected PengderMessage updateEvent2Database(PengderMessage msg) {

        MessageProtos.UserEventList userEventList = null;
        PengderMessage resp = null;

        if (msg.getMsg() instanceof MessageProtos.UserEventList) {
            userEventList = (MessageProtos.UserEventList) msg.getMsg();
        } else {
            logger.error("参数异常，请求的类型不是UserEventList. type : " + msg.getMsg().getClass().getName());
            //resp =  UtilCheck.newCommandMessage(MessageProtos.Command.Option.SERVER_RECV_ERR.getNumber());
            return resp;
        }

        int cnt = userEventList.getUserEventCount();

        /*开始更新数据库*/
        for (int i = 0; i < cnt; i++) {
            MessageProtos.UserEvent event = userEventList.getUserEvent(i);
            Tusereventofterminal record = new Tusereventofterminal();

            record.setSyntime(new Date());
            record.setId(event.getId());
            record.setTerminalmac(msg.getAppliance().getMacAddress());
            record.setInstrumentid(event.getInstrumentId());
            record.setUserid(event.getUserId());
            record.setCardserial(event.getCardSerial());
            record.setCardtype((short) event.getCardType());
            record.setActiontypeid((short) event.getActionType());
            record.setActionresultid((short) event.getActionResult());
            record.setCreatedtime(UtilCheck.castToDate(event.getCreateTime()));
            if (event.hasGroupId()) {
                record.setGroupid(event.getGroupId());
            }
            uevMapper.replaceSelective(record);

            // 涉及系统设置的用户事件，修改仪器状态
            int num = 0;
            switch (event.getActionType()) {
                case 1450:
                    num = 231;
                    break;
                case 1451:
                    num = 232;
                    break;
                case 1452:
                    num = 233;
                    break;
                case 1453:
                    num = 234;
                    break;
                default:
                    num = 0;
                    break;
            }

            if (num > 0) {
                Tinstrument tins = new Tinstrument();
                tins.setInstrumentstatusid((short) num);
                tins.setId(event.getInstrumentId());
                tinsMapper.updateByPrimaryKey(tins);
            }
        }

        resp = UtilCheck.newCommandMessage(MessageProtos.Command.Option.SERVER_RECV_OK.getNumber());

        return resp;
    }


}
