package com.slark.pengder.service.receiver;

import com.slark.pengder.mybatis.dao.TRemoteShutdownRecordMapper;
import com.slark.pengder.mybatis.model.TRemoteShutdownRecord;
import com.slark.pengder.net.Appliance;
import com.slark.pengder.net.PengderChannelGroup;
import com.slark.pengder.protocol.MessageProtos;
import com.slark.pengder.protocol.PengderMessage;
import com.slark.pengder.service.AbsSimpleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengwei on 16/10/21.
 */
@Service("userDeplaneService")
public class UserDeplaneService extends AbsSimpleService {
    private static final Logger logger = Logger.getLogger(UserDeplaneService.class);
    private final String DBOPREXCEPT = "数据库操作异常";
    private final String RECORDNOTFIND = "根据下机记录ID无法找到对应的记录";
    private final String APPISOFFLINE = "设备已经下线无法进行下机操作";
    private final String PARAMEXCEPT = "服务调用参数异常，出现不支持的参数类型";
    private final String DEPLANECMDEXCEPT="下机操作数据异常";
    private final String FAILEDCMDEXCEPT="二代机无法支持远程下机操作";

    @Autowired
    private TRemoteShutdownRecordMapper shutdownRecordMapper;


    /**
     * @param p 在webServer那边需要生成一个PengderMessage对象
     *          暂时是不需要数据库操作的
     * @return
     * @Description 重新定义这个接口
     */
    public List doService(Object p) {
        List<String> res = null;

        Integer param = null;

        if (p instanceof Integer) {
            return doWebserviceRequest((Integer) p);
        } else if (p instanceof PengderMessage) {
            /**
             * 直接返回空
             */
            return doApplianceRespone((PengderMessage) p);
        } else {
            res = new ArrayList<String>();
            res.add(PARAMEXCEPT);
        }

        return res;
    }

    /**
     * @param msg
     * @return
     * @description 处理设备的返回
     */
    List doApplianceRespone(PengderMessage msg) {
        MessageProtos.SessionOpertaionRep opertaionRep = (MessageProtos.SessionOpertaionRep) msg.getMsg();
        TRemoteShutdownRecord record = null;
        int status = opertaionRep.getStatus();
        int isBooking = opertaionRep.getBookingId();
        byte bstatus = 0;

        switch (status) {
            case 1:
                bstatus = 1;
                break;
            case 4:
                bstatus = 3;
                break;
            case 5:
                bstatus = 5;
                break;
            case 6:
                bstatus = 6;
                break;
            default:
                bstatus = 7;
                break;
        }

        record = new TRemoteShutdownRecord();
        record.setId(opertaionRep.getId());
        record.setBookingid(isBooking);
        record.setStatus(bstatus);

        try {
            shutdownRecordMapper.updateByPrimaryKeySelective(record);
        } catch (Exception e) {
            logger.error("更新下机记录状态失败，下机记录数据为: " + record.toString());
            logger.error(e.getMessage(), e);
        }

        PengderMessage pmsg = msg.getRqstMsg();
        if (pmsg != null) {
            msg.getAppliance().setCurrMsg(null);
        }

        return null;
    }

    /**
     * @param param
     * @return
     * @description 处理webservcei请求的接口方法
     */
    List doWebserviceRequest(Integer param) {
        List<String> res = new ArrayList<String>();
        TRemoteShutdownRecord record = null;

        try {
            record = shutdownRecordMapper.selectByPrimaryKey(param);
        } catch (Exception e) {
            logger.error("根据传入的用户下机记录ID: " + param + "查询数据库失败");
            logger.error(e.getMessage(), e);
            res.add(DBOPREXCEPT);
            return res;
        }

        if (record == null) {
            logger.error("根据传入的用户下机记录ID: " + param + "查询数据库失败,数据库中不存在该下机操作记录");
            res.add(RECORDNOTFIND);
            return res;
        }

        /**
         * 得到设备ID
         */
        Appliance app = PengderChannelGroup.defaultTerminalGroup().findApplianceByAppId(record.getInstrumentid());
        if (app == null) {
            /*更新设备表数据*/
            final byte status = 2;
            logger.error(" 设备已经下线，无法进行远程下机操作");
            if (!updateShutdownRecordStatus(record, status)) {
                res.add(DBOPREXCEPT);
                return res;
            }
            res.add(APPISOFFLINE);
            return res;
        }

        if(app.getVersion() <= 2){
            logger.error("当前设备为二代机，无法支持远程下机操作!");
            res.add(FAILEDCMDEXCEPT);
            return res;
        }

        MessageProtos.SessionOpertaionReq sessionOpertaionReq = null;
        try {
            sessionOpertaionReq = MessageProtos.SessionOpertaionReq.newBuilder()
                    .setCardSerial(record.getCardserial())
                    .setId(record.getId())
                    .setUserId(record.getUserid())
                    .setUserRole(record.getUserrole())
                    .setOperationType(1).build();
        } catch (Exception e) {
            logger.error("生成用户下机命令包失败，请检查数据是否正常,下机操作ID:" + record.getId());
            logger.error(e.getMessage(),e);
            res.add(DEPLANECMDEXCEPT);
            return res;
        }

        PengderMessage msg = new PengderMessage();
        msg.setVersion(app.getVersion());
        msg.setAppliance(app);
        msg.setMsg(sessionOpertaionReq);
        msg.setMsgId(MessageProtos.MessageType.SESSION_OPERATION_REQ_CMD.getNumber());
        msg.setNeedReply(true);
        byte sbyte = 3;

        try {
            app.send(msg);
        } catch (Exception e) {
            logger.error("发下下机命令到仪器 : " + app.getApplianceID() + "失败");
            logger.error(e.getMessage(), e);
            sbyte = 7;
        }

        /**
         * 更新状态为命令下发状态
         */
        updateShutdownRecordStatus(record, sbyte);
        logger.debug("远程下机操作命令下发成功,设备ID: " + app.getApplianceID());
        res.add("Success");
        return res;
    }

    /**
     * @param record
     * @param status
     * @description 更新设备表的状态字段
     */
    boolean updateShutdownRecordStatus(TRemoteShutdownRecord record, byte status) {
        record.setStatus(status);
        try {
            shutdownRecordMapper.updateByPrimaryKey(record);
        } catch (Exception e) {
            logger.error("更新下机记录: " + record.toString() + "为的状态为:" + status + "失败");
            logger.error(e.getMessage(), e);
            return false;
        }
        return true;
    }
}
