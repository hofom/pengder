package com.slark.pengder.service.receiver;

import com.slark.pengder.comm.UtilCheck;
import com.slark.pengder.except.ServiceException;
import com.slark.pengder.mybatis.dao.*;
import com.slark.pengder.mybatis.model.Tbookingrecord;
import com.slark.pengder.mybatis.model.Tinstrument;
import com.slark.pengder.mybatis.model.Tsystemeventofterminal;
import com.slark.pengder.net.Appliance;
import com.slark.pengder.protocol.MessageProtos;
import com.slark.pengder.protocol.PengderMessage;
import com.slark.pengder.service.AbsSimpleService;
import com.slark.pengder.service.ISimpleService;
import com.slark.pengder.tools.EUpdateType;
import com.slark.pengder.tools.SyncDataTaskList;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fengwei on 16/7/18.
 */
@Service("sysEventService")
public class SystemEventService extends AbsReceiverService {
    private static final Logger logger = Logger.getLogger(SystemEventService.class);
    @Autowired
    TsystemeventofterminalMapper systemEventMapper;
    @Autowired
    SyncDataTaskList syncList;

    /**
     * @param msg
     * @return
     * @Description 重新定义这个接口  该接口有事务处理
     */
    @Transactional
    public List<PengderMessage> doService(PengderMessage msg)  {

        MessageProtos.SystemEventList sysevs = null;
        PengderMessage resMessage = null;
        List<PengderMessage> res = new ArrayList<PengderMessage>();
        Appliance app = msg.getAppliance();

        if (msg.getMsg() instanceof MessageProtos.SystemEventList) {
            sysevs = (MessageProtos.SystemEventList) msg.getMsg();
        } else {
            logger.error("请求的消息不是MessageProtos.SystemEventList。实际类型为+" + msg.getMsg().getClass().getName());
            resMessage = UtilCheck.newCommandMessage(MessageProtos.Command.Option.SERVER_RECV_ERR.getNumber());
            res.add(resMessage);
            throw new ServiceException(-1,
                            "请求消息的类型异常，" +
                            "SystemEventService服务无法处理" +
                            "非MessageProtos.SystemEventList" +
                            "类型的消息",res);
        }

        if(app == null){
            logger.error("请求消息异常，找不到该消息对应的终端对象....");
            resMessage = UtilCheck.newCommandMessage(MessageProtos.Command.Option.SERVER_RECV_ERR.getNumber());
            res.add(resMessage);
            throw new ServiceException(-1,
                  "当前消息请求不存在对应的设备终端，或者该设备终端已经关闭了连接",res);
        }

        int cnt = sysevs.getSystemEventCount();

        for (int i = 0; i < cnt; i++) {
            MessageProtos.SystemEvent sysev = sysevs.getSystemEvent(i);
            logger.debug("系统事件:" + "事件记录ID:" + sysev.getId()
                    + "，仪器ID:" + sysev.getInstrumentId()
                    + "，事件类型ID:" + sysev.getEventType() + "事件内容:" + sysev.getEventContent());


            /**
             * 所有的系统事件先写数据库
             */
            Tsystemeventofterminal   sys = new Tsystemeventofterminal();

            sys.setId(sysev.getId());
            sys.setTerminalmac(app.getMacAddress());//app.getMacAddress());
            sys.setInstrumentid(sysev.getInstrumentId());
            sys.setEventtypeid(sysev.getEventType());

            if(sysev.hasEventContent()){
                sys.setEventcontent(sysev.getEventContent());
            }else {
                sys.setEventcontent(null);
            }

            sys.setCreatedtime(UtilCheck.castToDate(sysev.getCreateTime()));
            systemEventMapper.replaceSelective(sys);

            /**
             * 事件处理
             */
            
            if(!processSystemEventBussi(sysev,msg)){
                logger.error("系统事件处理业务异常，无法继续处理事件:" + sysev.getId());
                resMessage = UtilCheck.newCommandMessage(MessageProtos.Command.Option.SERVER_RECV_ERR.getNumber());
                res.add(resMessage);
                throw new ServiceException(-1,
                        "当前消息请求不存在对应的设备终端，或者该设备终端已经关闭了连接",res);
            }
        }

        /**
         * 只要有系统事件，就同步账户、用户和权限资料
         */
/*        Map paramMap = new HashMap();
        paramMap.put("instId", msg.getAppliance().getApplianceID());
        paramMap.put("type", EUpdateType.AccountList);
        syncDataService.call(paramMap);
        
        paramMap.put("type", EUpdateType.UserList);
        syncDataService.call(paramMap);
        
        paramMap.put("type", EUpdateType.UserRightList);
        syncDataService.call(paramMap);*/
        /**
         * 使用taskList，把同步任务加入task列表
         */
        syncList.addEx(EUpdateType.AccountList, msg.getAppliance());
        syncList.addEx(EUpdateType.UserList, msg.getAppliance());
        syncList.addEx(EUpdateType.UserRightList, msg.getAppliance());
        
        
        resMessage = UtilCheck.newCommandMessage(MessageProtos.Command.Option.SERVER_RECV_OK.getNumber());
        res.add(resMessage);
        return res;
    }

    @Autowired
    private TinstrumentMapper tinsMapper;
    @Autowired
    private ProcMapper procMapper;
    @Autowired
    private TbookingrecordMapper bookrecordMapper;
    @Autowired
    private TuserMapper   userMapper;
    @Autowired
    @Qualifier("instrumentUsingTimeoutNotice")
    AbsSimpleService instrumentUsingTimeoutNotice;
    @Autowired
    @Qualifier("bookingProtectNotice")
    AbsSimpleService bookingProtectNotice;


    private  boolean processSystemEventBussi(MessageProtos.SystemEvent ev,PengderMessage  msg){
        switch (ev.getEventType()){
            case 1475:{
            	//刷卡机状态变更
                return updateInstState(ev.getInstrumentId(), Long.valueOf(ev.getEventContent()).shortValue());
            }
            case 1476 :{
            	// 刷卡机版本代码更新
				// // 刷卡机软件更新后产生，通信服务器收到后更新对应仪器的TerminalVersion字段。
				// // 因事件内容为int32，该字段为varchar，需要转换，转换规则：如版本代码为201，则填入字符串2.01，如版本代码为2512,则填入25.12，类推。
                final String terminalVersion = Long.toString(ev.getEventContent()/100)
                        + "." + Long.toString(ev.getEventContent()%100/10)
                        + Long.toString(ev.getEventContent()%10);
                return updateInstVersion(ev.getInstrumentId(), terminalVersion);
            }
            case 1481:{
            	// 预约完成（如约实验）
				// 增加信用分，更新预约记录（调存储过程实现）
                return finishBooking(ev.getEventContent());
            }
            case 1482:{
            	// 预约过期
            	return missBooking(ev.getEventContent());
            }
            case 1483:{
            	//预约被占用，更新预约状态
            	return updateBookingState(ev.getEventContent(), (short)1111);
            }
            case 1484:{
                // 预约终止
                return updateBookingState(ev.getEventContent(), (short)1110);
            }
            case 1485:
                // 进入预约保护时间1：空闲
            case 1486:
                // 进入预约保护时间2：有非预约用户在使用
            case 1487:{
            	// 进入预约保护时间3：预约用户本人在使用，但使用类型与预约类型不符
            	// 发送提示信息
            	bookingProtectNotice.doService(ev);
                break;
            }
            case 1491:{
            	// 使用超时,发送提示信息
            	instrumentUsingTimeoutNotice.doService(ev);
            	break;
            }
            default:
            	break;
        }

        return true;
    }

    /**
     * 更新设备状态
     * @param instId
     * @param state
     * @return
     */
    private boolean updateInstState(Integer instId,Short state){
		Tinstrument inst = new Tinstrument();
		inst.setId(instId);
		inst.setInstrumentstatusid(state);
		tinsMapper.updateByPrimaryKeySelective(inst);
    	return true;
    }
    
    /**
     * 更新设备版本
     * @param instId
     * @param version
     * @return
     */
    private boolean updateInstVersion(Integer instId,String version){
		Tinstrument inst = new Tinstrument();
		inst.setId(instId);
		inst.setTerminalversion(version);
		tinsMapper.updateByPrimaryKeySelective(inst);
    	return true;
    }
    
    /**
     * 完成预约
     * @param bookingId
     * @return
     */
    private boolean finishBooking(Long bookingId){
    	 Map  param = new HashMap();
         param.put("bookingId",bookingId);
         procMapper.updateRecordTo1108(param);
         return true;
    }

    /**
     * 更新预约状态
     * @param bookingId
     * @param state
     * @return
     */
    private boolean updateBookingState(Long bookingId,Short state){
    	Tbookingrecord booking = new Tbookingrecord();
    	booking.setId(bookingId);
    	booking.setBookingstatusid(state);
    	bookrecordMapper.updateByPrimaryKeySelective(booking);
    	return true;
    }
    
    /**
     * 预约过期，失约
     * @param bookingId
     * @return
     */
    private boolean missBooking(Long bookingId){
    	//更新数据中预约信息
    	if(updateBookingState(bookingId, (short)1104)){
    		//获取预约信息
    		Tbookingrecord booking = bookrecordMapper.selectByPrimaryKey(bookingId);
    		if(booking != null){
	    		//调用存储过程，失约计费
	            Map param = new HashMap();
	            param.put("bookingId",bookingId);
	            param.put("userId",booking.getUserid());
	            procMapper.newChargingofmissappoint(param);
    		}else{
				logger.error("**用户ID查询失败（结果为0）：select UserID from tbookingrecord where ID=" + bookingId);
    		}
    	}
    	return true;
    }
}
