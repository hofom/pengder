package com.slark.pengder.service.receiver;

import com.slark.pengder.comm.UtilCheck;
import com.slark.pengder.mybatis.dao.TinstrumentMapper;
import com.slark.pengder.mybatis.model.Tinstrument;
import com.slark.pengder.net.Appliance;
import com.slark.pengder.protocol.MessageProtos;
import com.slark.pengder.protocol.PengderMessage;
import com.slark.pengder.tools.EState;
import com.slark.pengder.tools.EUpdateType;
import com.slark.pengder.tools.SyncDataTaskList;
import com.slark.pengder.tools.SyncState;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fengwei on 16/7/12.
 */
@Service("heartbeatService")
public class HeartbeatService extends AbsReceiverService{
    private static final Logger logger = Logger.getLogger(HeartbeatService.class);
    @Autowired
    protected TinstrumentMapper  tinstrumentMapper;
    
	@Autowired
	private SyncDataTaskList syncList;
    
    /**
     * @Description
     * @param msg
     * @return
     */
    public List<PengderMessage> doService(PengderMessage  msg) {
        List  res = this.newResponeMsgList();
        MessageProtos.Heartbeat  hb = (MessageProtos.Heartbeat)msg.getMsg();
        //tinstrumentMapper.selectByPrimaryKey()
        if(!hb.hasInstrumentId()){
            logger.error("心跳包数据异常。无法获得心跳包的设备id");
            return null;
        }

        if(UtilCheck.checkTinstumentId(hb.getInstrumentId())<0){
            logger.error("心跳包的设备id不合法,设备id是: " + hb.getInstrumentId());
            return null;
        }
        /**
         * 查询设备信息,第一次心跳包
         */
        if(!msg.getAppliance().isBinded()){
	        Tinstrument  tins = tinstrumentMapper.selectByPrimaryKey(hb.getInstrumentId());
	        if(tins == null){
	            logger.error("查询设备信息失败，设备id: " + hb.getInstrumentId());
	            return null;
	        }
	
	        String macStr = tins.getTerminalmac();
	        /**
	         * 得到mac地址
	         */
	        if(macStr.equals("00:00:00:00:00:00")){
	            logger.error("设备未初始化,设备id : " + hb.getInstrumentId());
	            return null;
	        }
	        else {
	            logger.debug("收到设备发送过来的心跳包，设备id : " + hb.getInstrumentId() + ",mac地址 ：" + macStr);
	            msg.getAppliance().setApplianceID(hb.getInstrumentId());
	            msg.getAppliance().setMacAddress(macStr);
	            msg.getAppliance().setClientState(hb.getClientState());
	            msg.getAppliance().setBinded(true);
	            msg.getAppliance().setSyncInitData(true);
	            
	            /**
	             * 设备连接时同步一次
	             */
	            Appliance app = msg.getAppliance();
	            for(int i = 0 ;i < EUpdateType.maxIndex();i++){
	    			EUpdateType type = EUpdateType.indexOf(i);
	    			if(type != null){
	    				syncList.add(type, app);
	    			}
	    		}
	        }
        }
        //
        //任何时候都设置一次客户端的状态值
        //
        logger.debug("------设备状态为------: " + hb.getClientState());
        msg.getAppliance().setClientState(hb.getClientState());

        MessageProtos.Heartbeat.Builder msgBuilder = MessageProtos.Heartbeat.newBuilder();
        int timestamp = (int) (System.currentTimeMillis() / 1000);
        MessageProtos.Heartbeat  resp = msgBuilder.setClientTimestamp(hb.getClientTimestamp()).setServerTimestamp(timestamp).build();

        PengderMessage  respMsg = new PengderMessage();
        respMsg.setMsg(resp);
        respMsg.setMsgId(MessageProtos.MessageType.HEARTBEAT.getNumber());
        respMsg.setAppliance(msg.getAppliance());
        res.add(respMsg);

        /**
         * 把心跳包作为COMMENT FAILED处理
         */
        PengderMessage rqstMsg = msg.getAppliance().getCurrMsg();
        if(rqstMsg!=null){
        	msg.getAppliance().setCurrMsg(null);
        	if(rqstMsg.isNeedReply() && msg.getRepeatSendTimes()<5){
        		msg.addRepeatSendTimes();
        		res.add(rqstMsg);
        	}
        }
        
        return res;
    }
}
