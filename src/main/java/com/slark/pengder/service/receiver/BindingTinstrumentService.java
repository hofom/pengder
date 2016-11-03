package com.slark.pengder.service.receiver;

import com.slark.pengder.mybatis.dao.TinstrumentMapper;
import com.slark.pengder.mybatis.model.Tinstrument;
import com.slark.pengder.protocol.MessageProtos.Command;
import com.slark.pengder.protocol.MessageProtos.InstrumentBinding;
import com.slark.pengder.protocol.MessageProtos.InstrumentBinding.Option;
import com.slark.pengder.protocol.MessageProtos.MessageType;
import com.slark.pengder.protocol.PengderMessage;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by fengwei on 16/7/13.
 */
@Service("bindingTinstrument")
public class BindingTinstrumentService extends AbsReceiverService {
    private static final Logger logger = Logger.getLogger(BindingTinstrumentService.class);
    @Autowired
    protected TinstrumentMapper tinstrumentMapper;
    /**
     * 该服务会调用另外的一个初始化服务
     */
    @Autowired
    @Qualifier("tinsInitService")
    protected AbsReceiverService initService;

    /**
     * @param bindMsg
     * @param msg
     * @return
     * @Description 执行数据库操作
     */
    private Command bindInstrumentDB(InstrumentBinding bindMsg, PengderMessage msg) {
        Tinstrument tins = null;
        Command cmd = null;
        switch (bindMsg.getOption()) {
            case CONFIRM_BINDING: {
                tins = new Tinstrument();
                tins.setId(bindMsg.getInstrumentId());
                tins.setTerminalmac(bindMsg.getClientMacAddr());
                tins.setControltypeid((short) bindMsg.getClientModel());
                tins.setTerminalversion(bindMsg.getClientVersion());
                break;
            }
            case RELEASE_BINDING: {
                tins = new Tinstrument();
                tins.setId(bindMsg.getInstrumentId());
                tins.setTerminalmac("00:00:00:00:00:00");
                tins.setControltypeid((short) 244);
                tins.setTerminalversion("v0.00");
                break;
            }
            case REQUEST_BINDING: {
                msg.getAppliance().setApplianceID(bindMsg.getInstrumentId());
                msg.getAppliance().setMacAddress(bindMsg.getClientMacAddr());
                break;
            }
            default: {
                logger.error("设备绑定消息异常，message: " + bindMsg);
                return null;
            }
        }
        if (tins != null) {
            /**
             * 如果不为空。则操作数据库
             * 如果操作成功。则设置成绑定状态
             */

            int n = tinstrumentMapper.updateByPrimaryKeySelective(tins);
            if (bindMsg.getOption() == InstrumentBinding.Option.CONFIRM_BINDING) {
                msg.getAppliance().setBinded(true);
            } else if (bindMsg.getOption() == InstrumentBinding.Option.RELEASE_BINDING) {
                msg.getAppliance().setBinded(false);
            }
            logger.debug("执行绑定操作影响的函数为: " + n);

        } else {
            if (bindMsg.getOption() == InstrumentBinding.Option.REQUEST_BINDING) {
                msg.getAppliance().setBinded(true);
            }
        }
        cmd = Command.newBuilder().setOption(Command.Option.SERVER_RECV_OK).build();
        return cmd;
    }

    /**
     * @param msg
     * @return
     * @Description 重新定义这个接口
     */
    @Transactional
    public List<PengderMessage> doService(PengderMessage msg) {
        InstrumentBinding bindMsg = (InstrumentBinding) msg.getMsg();
        Tinstrument tins = null;
        PengderMessage resp = null;
        /**
         * 先打一个日志
         */
        logger.debug("收到绑定状态为 ： " + bindMsg.getOption().toString() + "的绑定消息");
        logger.debug("仪器id : " + bindMsg.getInstrumentId() + ",mac地址： " + bindMsg.getClientMacAddr());
        /**
         *更新数据库并生成返回的命令包
         */
        Command cmd = this.bindInstrumentDB(bindMsg, msg);

        /**
         * 这个消息不需要确认回复
         */
        List res = this.newResponeMsgList();
        if (cmd != null) {
            resp = new PengderMessage();
            resp.setMsgId(MessageType.COMMAND.getNumber());
            resp.setMsg(cmd);
            resp.setAppliance(msg.getAppliance());
            resp.setNeedReply(false);
            res.add(resp);
        }

        if (bindMsg.getOption() == Option.REQUEST_BINDING) {
            if (!selectInitData(msg, res)) {
                logger.warn("查询初始化数据失败。无法生成初始化列表数据发送给设备");
            }
        }
        return res;
    }

    /**
     * @param msg
     * @return
     * @Description 查询所有需要发送给设备的初始化数据
     * 初始化列表数据采用单独的服务来处理
     */
    private boolean selectInitData(PengderMessage msg, List resp) {
        List result = initService.doService(msg);
        if (result == null) {
            return false;
        }
        /**
         * 把所有的返回全部加入进去
         */
        resp.addAll(result);
        return true;
    }

}
