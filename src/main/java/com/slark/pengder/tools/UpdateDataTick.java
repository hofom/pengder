package com.slark.pengder.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.slark.pengder.mybatis.dao.ProcMapper;
import com.slark.pengder.mybatis.dao.TbookingrecordMapper;
import com.slark.pengder.mybatis.dao.TuserMapper;
import com.slark.pengder.mybatis.model.Tbookingrecord;
import com.slark.pengder.mybatis.model.Tuser;
import com.slark.pengder.net.Appliance;
import com.slark.pengder.net.PengderChannelGroup;
import com.slark.pengder.protocol.PengderMessage;
import com.slark.pengder.protocol.MessageProtos.*;

/**
 * 标记各类数据同步状态和时间
 * @author HeHao
 *
 */
@Component("updateDataTick")
public class UpdateDataTick {
    private static final Logger logger = Logger.getLogger(UpdateDataTick.class);

    @Autowired
    private ProcMapper procMapper;
    
    @Autowired
    private TbookingrecordMapper tbookingrecordMapper;
    
    @Autowired
    private TuserMapper tuserMapper;
	
    @Value("${pengder.commServer.dbProc.maxIds:20}")
    private Integer maxProcIds;
    
    /**
     * 标记更新成功
     * @param msg
     * @return
     */
	public boolean setUpdateSuccess(PengderMessage msg) {
		switch (msg.getMsgId()) {
		case MessageType.INSTRUMENTDETAIL_VALUE:
			return setUpdatedForInstrumentDetail(
					msg.getAppliance().getApplianceID(), 
					(InstrumentDetail) msg.getMsg(),
					msg.getUpdateNum()
					);
		case MessageType.RESERVATIONLIST_VALUE:
			return setUpdatedForReservationList(
					msg.getAppliance().getApplianceID(), 
					(ReservationList) msg.getMsg(),
					msg.getUpdateNum()
					);
		case MessageType.USERLIST_VALUE:
			return setUpdatedForUserList(
					msg.getAppliance().getApplianceID(), 
					(UserList) msg.getMsg(),
					msg.getUpdateNum()
					);
		case MessageType.ACCOUNTLIST_VALUE:
			return setUpdatedForAccountList(
					msg.getAppliance().getApplianceID(), 
					(AccountList) msg.getMsg(),
					msg.getUpdateNum()
					);
		case MessageType.USERRIGHTLIST_VALUE:
			return setUpdatedForUserRightList(
					msg.getAppliance().getApplianceID(), 
					(UserRightList) msg.getMsg(),
					msg.getUpdateNum()
					);
		case MessageType.TEMPCARDBINDINGLIST_VALUE:
			return setUpdatedForTempCardBindingList(
					msg.getAppliance().getApplianceID(), 
					(TempCardBindingList) msg.getMsg(),
					msg.getUpdateNum()
					);
		case MessageType.BOOKINGLIST_VALUE:
			return setUpdatedForBookingList(
					msg.getAppliance().getApplianceID(), 
					(BookingList) msg.getMsg(),
					msg.getUpdateNum()
					);
		case MessageType.CALENDARLIST_VALUE:
			return setUpdatedForCalendarList(
					msg.getAppliance().getApplianceID(), 
					(CalendarList) msg.getMsg(),
					msg.getUpdateNum(),
					msg.getUpdateYears()
					);
		case MessageType.GLOBALCONFIG_VALUE:
			return setUpdatedForGlobalConfig(
					msg.getAppliance().getApplianceID(), 
					(GlobalConfig) msg.getMsg(),
					msg.getUpdateNum()
					);
		case MessageType.COMMAND_VALUE:
			return true;
		default:
			return false;
		}
	}
    
	/**
	 * 标记更新失败
	 * @param msg
	 * @return
	 */
	public boolean setUpdateFailed(PengderMessage msg) {
		
		EUpdateType type = null;
		switch (msg.getMsgId()) {
		case MessageType.INSTRUMENTDETAIL_VALUE:
			type = EUpdateType.InstrumentDetail;break;
		case MessageType.RESERVATIONLIST_VALUE:
			type = EUpdateType.ReservationList;break;
		case MessageType.USERLIST_VALUE:
			type = EUpdateType.UserList;break;
		case MessageType.ACCOUNTLIST_VALUE:
			type = EUpdateType.AccountList;break;
		case MessageType.USERRIGHTLIST_VALUE:
			type = EUpdateType.UserRightList;break;
		case MessageType.TEMPCARDBINDINGLIST_VALUE:
			type = EUpdateType.TempCardBindingList;break;
		case MessageType.BOOKINGLIST_VALUE:
			type = EUpdateType.BookingList;
			setUpdatedForBookingListFail(
					msg.getAppliance().getApplianceID(), 
					(BookingList) msg.getMsg(),
					msg.getUpdateNum()
					);
			break;
		case MessageType.CALENDARLIST_VALUE:
			type = EUpdateType.CalendarList;break;
		case MessageType.GLOBALCONFIG_VALUE:
			type = EUpdateType.GlobalConfig;break;
		default:
			return false;
		}
		/**
		 * 更新内存中数据刷新状态为failed
		 */
		msg.getAppliance().getSyncState(type).setState(EState.Failed);
		return true;
	}
	
    /**
     * 调用存储过程SynData_UpdateReceiveSynTick_Proc，标记列表已同步
     * @param updateType
     * @param updateTick
     * @param paramsList
     * @return
     */
    private boolean updateTickWithRevc(Integer appId,EUpdateType updateType,Integer updateTick,List<Vector<Object>> paramsList){
    	final int packageSize = maxProcIds;

		try {
			/**
			 * 先更新内存中状态为ok
			 */
			PengderChannelGroup.defaultTerminalGroup().findApplianceByAppId(appId).getSyncState(updateType).setState(EState.Succ);
			StringBuilder strBuilder = new StringBuilder();
			int count = 0;
			for(Vector<Object> v : paramsList){
				if(count != 0){
					strBuilder.append(",");
				}
				
				for(int i=0;i<v.size();i++,count++){
					if(i!=0){
						strBuilder.append(":");
					}
					strBuilder.append(v.get(i));
				}
				
				if(count >= packageSize){
					Map<String, Object> paramMap = new HashMap<String, Object>();
					paramMap.put("type", Integer.valueOf(updateType.getNumber()));
					paramMap.put("tick", updateTick);
					paramMap.put("str", strBuilder.toString());
					logger.debug("执行更新列表状态"+paramMap);
					procMapper.updateReceiveSynTick(paramMap);
					count = 0;
					strBuilder.setLength(0);
				}
			}
			if(count > 0){
				Map<String, Object> paramMap = new HashMap<String, Object>();
				paramMap.put("type", Integer.valueOf(updateType.getNumber()));
				paramMap.put("tick", updateTick);
				paramMap.put("str", strBuilder.toString());
				logger.debug("执行更新列表状态"+paramMap);
				procMapper.updateReceiveSynTick(paramMap);
				count = 0;
				strBuilder.setLength(0);
			}
		}catch (Exception e) {
			logger.error(e.getMessage(),e);
			return false;
		}
		return true;
    }
    
    /**
     * 标记账户列表已同步
     * @param applianceID
     * @param msgList
     * @param updateTick
     * @return
     */
 	public boolean setUpdatedForAccountList(int applianceID, AccountList msgList, Integer updateTick) {
 		// 已同步的列表在msgList中
 		logger.info("标记账户列表已同步，仪器ID：" + applianceID + " 条数：" + msgList.getAccoutCount());
 		
 		List<Vector<Object>> paramsList = new ArrayList<Vector<Object>>();
 		for(Account o : msgList.getAccoutList()){
 			logger.debug("账户ID" + o.getId());
 			Vector<Object> v = new Vector<Object>(2);
 			v.add(applianceID);
 			v.add(o.getId());
 			paramsList.add(v);
 		}
 		
 		return this.updateTickWithRevc(applianceID,EUpdateType.AccountList, updateTick, paramsList);
 	}

 	/**
 	 * 标记预约同步成功
 	 * @param applianceID
 	 * @param msgList
 	 * @param updateTick
 	 * @return
 	 */
 	boolean setUpdatedForBookingList(int applianceID, BookingList msgList, Integer updateTick) {
 		// 列表在msgList中
 		logger.info("标记预约列表已同步，仪器ID：" + applianceID + " 条数：" + msgList.getBookingCount());
 		
 		List<Vector<Object>> paramsList = new ArrayList<Vector<Object>>();
 		for(Booking o : msgList.getBookingList()){
 			logger.debug("预约ID" + o.getId());
 			Vector<Object> v = new Vector<Object>(1);
 			v.add(o.getId());
 			paramsList.add(v);
 		}
 		
 		return this.updateTickWithRevc(applianceID,EUpdateType.BookingList, updateTick, paramsList);
 	}

 	/**
 	 * 标记预约同步失败，若为status为1105置为1106并标记预约失败，否则不作为
 	 * @param applianceID
 	 * @param msgList
 	 * @param updateTick
 	 * @param aNoteListToNotify
 	 * @return
 	 */
 	boolean setUpdatedForBookingListFail(int applianceID, BookingList msgList, Integer updateTick) {
 		try {
 			logger.info("标记预约同步失败，仪器ID：" + applianceID + " 条数：" + msgList.getBookingCount());
 			for (Booking o : msgList.getBookingList()) {
 				if (1105 == o.getStatus()) {
 					/**
 					 * 通知用户预约同步失败
 					 */
 					Tuser user = tuserMapper.selectByPrimaryKey(o.getUserId());
 					if(user!=null){
 						/**
 						 * 发送一封邮件
 						 */
 					}
 					
 					// 标记数据库预约同步失败
 					//statement = iDbConnection.prepareStatement("update tbookingrecord set BookingStatusID=1106,ReceiveSynTick=? where (ID=?)");
 					//statement.setInt(1, updateTick.getValue());
 					//statement.setInt(2, msg.getId());
 					//statement.executeUpdate();
 					Tbookingrecord record = new Tbookingrecord();
 					record.setId(Long.valueOf(o.getId()));
 					record.setBookingstatusid(Integer.valueOf(1106).shortValue());
 					tbookingrecordMapper.updateByPrimaryKeySelective(record);
 				} else {
 					// 同步失败，下次刷卡机上线继续同步，不需要通知
 					continue;
 				}
 			}
 			return true;
 		} catch (Exception e) {
 			e.printStackTrace();
 			logger.info(e);
 			return false;
 		}
 	}
 	
 	/**
 	 * 标记仪器详细参数已同步
 	 * @param applianceID
 	 * @param msg
 	 * @param updateTick
 	 * @return
 	 */
 	boolean setUpdatedForInstrumentDetail(int applianceID, InstrumentDetail msg, Integer updateTick) {
 		logger.info("标记仪器详细信息已同步，仪器ID：" + applianceID);
 		
 		List<Vector<Object>> paramsList = new ArrayList<Vector<Object>>();
		Vector<Object> v = new Vector<Object>(1);
		v.add(applianceID);
		paramsList.add(v);

 		return this.updateTickWithRevc(applianceID,EUpdateType.InstrumentDetail, updateTick, paramsList);
 	}

 	/**
 	 * 标记系统日历已同步
 	 * @param applianceID
 	 * @param aMsg
 	 * @param updateTick
 	 * @param updateYears
 	 * @return
 	 */
 	boolean setUpdatedForCalendarList(int applianceID, CalendarList aMsg, Integer updateTick, UpdateYears updateYears) {
 		logger.info("标记系统日历已同步" + "仪器ID：" + applianceID);
 		
 		List<Vector<Object>> paramsList = new ArrayList<Vector<Object>>();
 		List<Integer> years = updateYears.get();
 		for (int i = 0; i < years.size(); i++) {
 			Vector<Object> v = new Vector<Object>(2);
 			v.add(applianceID);
 			v.add(years.get(i));
 			paramsList.add(v);
 		}
 		
 		return this.updateTickWithRevc(applianceID,EUpdateType.CalendarList, updateTick, paramsList);
 	}

 	/**
 	 * 标记全局配置信息已同步
 	 * @param applianceID
 	 * @param aMsg
 	 * @param updateTick
 	 * @return
 	 */
 	boolean setUpdatedForGlobalConfig(int applianceID, GlobalConfig aMsg, Integer updateTick) {
 		logger.info("标记全局配置信息已同步，仪器ID：" + applianceID);

 		List<Vector<Object>> paramsList = new ArrayList<Vector<Object>>();
		Vector<Object> v = new Vector<Object>(1);
		v.add(applianceID);
		paramsList.add(v);
 		
 		return this.updateTickWithRevc(applianceID,EUpdateType.GlobalConfig, updateTick, paramsList);
 	}

 	/**
 	 * 标记待同步仪器专享时段列表已同步
 	 * @param applianceID
 	 * @param msgList
 	 * @param updateTick
 	 * @return
 	 */
 	boolean setUpdatedForReservationList(int applianceID, ReservationList msgList, Integer updateTick) {
 		logger.info("标记专享已同步，仪器ID：" + applianceID + " 条数：" + msgList.getReservationCount());
 		
 		List<Vector<Object>> paramsList = new ArrayList<Vector<Object>>();
 		for(Reservation o : msgList.getReservationList()){
 			logger.debug("专享ID:" + o.getId());
			Vector<Object> v = new Vector<Object>(1);
			v.add(o.getId());
			paramsList.add(v);
 		}
 		
 		return this.updateTickWithRevc(applianceID,EUpdateType.ReservationList, updateTick, paramsList);
 	}

 	/**
 	 * 标记临时卡关联列表已同步,这个有问题，TempCardBinding包中没有主键，原系统单独存储了id信息
 	 * @param applianceID
 	 * @param msgList
 	 * @param updateTick
 	 * @return
 	 */
 	boolean setUpdatedForTempCardBindingList(int applianceID, TempCardBindingList msgList, Integer updateTick) {
 		logger.info("标记临时卡列表已同步，仪器ID：" + applianceID + " 条数：" + msgList.getTempCardBindingCount());
 		
 		List<Vector<Object>> paramsList = new ArrayList<Vector<Object>>();
/* 		for(TempCardBinding o : msgList.getTempCardBindingList()){
 			logger.debug("临时卡ID:" + o.getId());
			Vector<Object> v = new Vector<Object>(1);
			v.add(o.getId());
			paramsList.add(v);
 		}*/
 		return this.updateTickWithRevc(applianceID,EUpdateType.TempCardBindingList, updateTick, paramsList);

 	}

 	/**
 	 * 标记用户记录已同步
 	 * @param applianceID
 	 * @param msgList
 	 * @param updateTick
 	 * @return
 	 */
 	boolean setUpdatedForUserList(int applianceID, UserList msgList, Integer updateTick) {
 		logger.info("标记用户列表已同步，仪器ID：" + applianceID + " 条数：" + msgList.getUserCount());

 		List<Vector<Object>> paramsList = new ArrayList<Vector<Object>>();
 		for(User o : msgList.getUserList()){
 			logger.debug("用户ID:" + o.getId());
			Vector<Object> v = new Vector<Object>(2);
			v.add(applianceID);
			v.add(o.getId());
			paramsList.add(v);
 		}
 		
 		return this.updateTickWithRevc(applianceID,EUpdateType.UserList, updateTick, paramsList);
 	}

 	/**
 	 * 标记用户资格列表已同步
 	 * @param applianceID
 	 * @param msgList
 	 * @param updateTick
 	 * @return
 	 */
 	boolean setUpdatedForUserRightList(int applianceID, UserRightList msgList, Integer updateTick) {
 		logger.info("标记资格列表已同步，仪器ID：" + applianceID + " 条数：" + msgList.getUserRightCount());
 		List<Vector<Object>> paramsList = new ArrayList<Vector<Object>>();

 		try{
	 		List<UserRight> list = msgList.getUserRightList();
	 		for(UserRight o : list){
	 			logger.debug("用户ID:" + o.getUserId());
				Vector<Object> v = new Vector<Object>(2);
				v.add(o.getUserId());//这里userid和applianceID是反的，与setUpdatedForUserList等不同
				v.add(applianceID);
				paramsList.add(v);
	 		}
 		}catch(Exception e){
 			logger.error(e.getMessage(), e);
 		}
 		return this.updateTickWithRevc(applianceID,EUpdateType.UserRightList, updateTick, paramsList);
 	}
 	
 	/**
 	 * 周期性更新预约状态,主要是手动更新未审批的过期预约
 	 * 调用Book_UpdateRecordto1104_Proc
 	 * @return
 	 */
 	boolean updateBookingsState() {
 		try {
 			procMapper.updateRecordTo1104();
 			return true;
 		} catch (Exception e) {
 			e.printStackTrace();
 			logger.info(e);
 			return false;
 		}
 	}

 	/**
 	 * 周期性更新预约状态,主要是针对无刷卡机仪器的已完成预约
 	 * 此类预约没有对应读刷卡机，不需要同步，同步标志由web端生成预约时置好，通信服务每天查一下数据库里NoCardUse的仪器的预约，把到期的标记完成
 	 * @return
 	 */
 	boolean updateNoCardBookingsState() {
 		try {
 			// 更新预约状态
 			//statement = iDbConnection.prepareCall("UPDATE tbookingrecord INNER JOIN tinstrument ON tbookingrecord.InstrumentID=tinstrument.ID SET tbookingrecord.BookingStatusID=1108 WHERE (tinstrument.NoCardUse=1) AND (tbookingrecord.BookingStatusID=1105) AND (tbookingrecord.BookingModelId=181) AND (tbookingrecord.EndTime<NOW())");
 			this.tbookingrecordMapper.updateWithDev();
 			return true;
 		} catch (Exception e) {
 			e.printStackTrace();
 			logger.info(e);
 			return false;
 		}
 	}
 	
}
