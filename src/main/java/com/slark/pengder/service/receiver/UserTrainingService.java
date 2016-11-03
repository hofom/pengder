package com.slark.pengder.service.receiver;

import com.slark.pengder.comm.UtilCheck;
import com.slark.pengder.mybatis.dao.TuserMapper;
import com.slark.pengder.mybatis.dao.TuserintrainingsessionMapper;
import com.slark.pengder.mybatis.model.Tuser;
import com.slark.pengder.mybatis.model.Tuserintrainingsession;
import com.slark.pengder.protocol.MessageProtos;
import com.slark.pengder.protocol.PengderMessage;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by fengwei on 16/7/18.
 */
@Service("trainService")
public class UserTrainingService extends AbsReceiverService {
    private static final Logger logger = Logger.getLogger(UserTrainingService.class);

    @Autowired
    TuserintrainingsessionMapper userIntraningMapper;
    @Autowired
    TuserMapper userMapper;

    /**
     * @param msg
     * @return
     * @Description 重新定义这个接口
     */
    @Transactional
    public List<PengderMessage> doService(PengderMessage msg) {

        MessageProtos.UserInTrainingList uiList = null;
        PengderMessage resMessage = null;
        List<PengderMessage> res = new ArrayList<PengderMessage>();
        /**
         * 判断类型是否正确
         */
        if (msg.getMsg() instanceof MessageProtos.UserInTrainingList) {
            uiList = (MessageProtos.UserInTrainingList) msg.getMsg();
        } else {
            logger.error("请求的消息不是MessageProtos.UserInTrainingList类型。实际类型为+" + msg.getMsg().getClass().getName());
            resMessage = UtilCheck.newCommandMessage(MessageProtos.Command.Option.SERVER_RECV_ERR.getNumber());
            res.add(resMessage);
            return res;
        }

        int cnt = uiList.getUserInTrainingCount();
        /**
         * 循环处理这个列表
         */
        for (int i = 0; i < cnt; i++) {
            MessageProtos.UserInTraining ui = uiList.getUserInTraining(i);
            /**
             * 查询用户数据
             */
            Tuser user = getUser(ui.getUserId());
            if (user == null) {
                logger.error("用户id ： " + ui.getUserId() + " 不存在。无法同步该用户的培训数据");
                continue;
            }

            Tuserintrainingsession userSession = new Tuserintrainingsession();

            userSession.setSessionid(ui.getSessionId());
            userSession.setCardserial(ui.getCardSerial());
            userSession.setUserid(ui.getUserId());
            userSession.setCheckedintime(UtilCheck.castToDate(ui.getCheckInTime()));
            userSession.setCreatedid(2);
            userSession.setInstrumentid(msg.getAppliance().getApplianceID());

            if (user.getPosition() == null) {
                userSession.setManul(null);
            } else {
                if (user.getPosition() == 0) {
                    userSession.setManul(null);
                } else {
                    userSession.setManul(Boolean.valueOf(user.getPosition().toString()));
                }
            }
            /**
             * 增加一个字段
             */
            userSession.setCreatedtime(new Date());
            /**
             * 写数据库
             */
            userIntraningMapper.replaceSelective(userSession);
        }

        resMessage = UtilCheck.newCommandMessage(MessageProtos.Command.Option.SERVER_RECV_OK.getNumber());
        resMessage.setAppliance(msg.getAppliance());
        resMessage.setNeedReply(false);
        res.add(resMessage);
        return res;
    }


    private Tuser getUser(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
