package com.slark.pengder.service.receiver;

import com.slark.pengder.comm.UtilCheck;
import com.slark.pengder.net.Appliance;
import com.slark.pengder.protocol.MessageProtos;
import com.slark.pengder.protocol.PengderMessage;
import com.slark.pengder.tools.EUpdateType;
import com.slark.pengder.tools.QuerySyncDataOpr;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fengwei on 16/7/13.
 */
@Service("tinsInitService")
public class TinstrumentInitializeService extends AbsReceiverService {

    private static final Logger logger = Logger.getLogger(TinstrumentInitializeService.class);

    @Autowired
    private QuerySyncDataOpr syncDataOpr;

    /**
     * @param msg
     * @return
     * @Description 重新定义这个接口
     */
    public List<PengderMessage> doService(PengderMessage msg) {
        List<PengderMessage> resp = this.newResponeMsgList();

        Appliance app = msg.getAppliance();
        if (!app.isBinded()) {
            logger.error("当前设备还未进行绑定操作。不能进行初始化");
            return null;
        }
        if (app.isSyncInitData()) {
            logger.error("当前设备已经初始化。无法重新进行初始化数据列表同步操作");
            return null;
        }

        /**
         * 获取同步数据
         */
        for(int i = 0 ;i<EUpdateType.maxIndex();i++){
        	EUpdateType type = EUpdateType.indexOf(i);
        	if(type != null){
        		 List result = syncDataOpr.getDataList(type, app);
                 if (result != null && !result.isEmpty()) {
                     resp.addAll(result);
                 }
        	}
        }
        
        long tinstrumentId = app.getApplianceID();

        List result = syncDataOpr.selectUserEventListLast(tinstrumentId);
        if (result != null) {
            resp.addAll(result);
        }

        result = syncDataOpr.selectSystemEventListLast(tinstrumentId);
        if (result != null) {
            resp.addAll(result);
        }

        result = syncDataOpr.selectClientSessionListLast(tinstrumentId);
        if (result != null) {
            resp.addAll(result);
        }

        /**
         * 设置该消息发送过去之后。需要进行确认
         */
        for (PengderMessage message : resp) {
            if (!message.isNeedReply()) {
                message.setNeedReply(true);
            }
            message.setAppliance(msg.getAppliance());
        }
        /**
         * 加入一个初始化完成的命令,这个命令需要确认
         */
        PengderMessage initDoneMsg = UtilCheck.newCommandMessage(MessageProtos.Command.Option.SERVER_INIT_DONE.getNumber());
        initDoneMsg.setNeedReply(true);
        initDoneMsg.setAppliance(msg.getAppliance());
        resp.add(initDoneMsg);
        return resp;
    }
}
