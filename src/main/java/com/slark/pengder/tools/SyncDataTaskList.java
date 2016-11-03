package com.slark.pengder.tools;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import io.netty.channel.Channel;

import com.slark.pengder.net.Appliance;
import com.slark.pengder.net.PengderChannelGroup;

/**
 * 数据同步任务工具类
 * @author HeHao
 *
 */
@Component("syncDataTaskList")
public class SyncDataTaskList {
	private static final Logger logger = Logger.getLogger(SyncDataTaskList.class);

	/**
	 * 添加数据同步任务,添加到所有设备
	 * @param type
	 * @return
	 */
	public boolean add(EUpdateType type){
		List<Appliance> listApp = PengderChannelGroup.defaultTerminalGroup().toApplianceList();
		for(Appliance app:listApp){
			add(type,app);
		}
		return true;
	}
	
	/**
	 * 添加数据同步任务,只添加指定设备
	 * @param type
	 * @param instId
	 * @return
	 */
	public boolean add(EUpdateType type , Integer instId){
		Appliance app = PengderChannelGroup.defaultTerminalGroup().findApplianceByAppId(instId);
/*		if(app == null)
			return false;*/
		return add(type,app);
	}
	
	/**
	 * 添加数据同步任务,只添加指定设备
	 * @param type
	 * @param app
	 * @return
	 */
	public boolean add(EUpdateType type , Appliance app){
		if(app == null)
			return false;
		if(app.getSyncState(type).setState(EState.Todo)){
			logger.debug("添加内存同步任务"+type.toString()+"to"+app.getApplianceID());
		}
		return true;
	}
	
	/**
	 * 添加数据同步任务,只添加指定设备
	 * @param type
	 * @param ch
	 * @return
	 */
	public boolean add(EUpdateType type , Channel ch){
		Appliance app = PengderChannelGroup.defaultTerminalGroup().getAppliance(ch);
/*		if(app == null)
			return false;*/
		return add(type,app);
	}
	
	/**
	 * 添加数据同步任务,根据数据类型进行处理
	 * @param type
	 * @param instId
	 * @return
	 */
	public boolean addEx(EUpdateType type , Integer instId){
		Appliance app = PengderChannelGroup.defaultTerminalGroup().findApplianceByAppId(instId);
/*		if(app == null)
			return false;*/
		return addEx(type,app);
	}
	
	/**
	 * 添加数据同步任务,根据数据类型进行处理
	 * @param type
	 * @param app
	 * @return
	 */
	public boolean addEx(EUpdateType type , Appliance app){
		switch (type) {
		case UserList:
		case AccountList:
		case CalendarList:
		case GlobalConfig: {
			// 与仪器无关消息，遍历所有在线设备群发同步
			return add(type);
		}
		case UserRightList:
		case InstrumentDetail:
		case ReservationList:
		case BookingList:
		case TempCardBindingList: {
			// 仪器相关，仅同步指定仪器
			return add(type,app);
		}
		default:
			logger.error("未知同步类型");
		}
		return false;
	}
	
	/**
	 * 添加数据同步任务,根据数据类型进行处理
	 * @param type
	 * @param ch
	 * @return
	 */
	public boolean addEx(EUpdateType type , Channel ch){
		Appliance app = PengderChannelGroup.defaultTerminalGroup().getAppliance(ch);
/*		if(app == null)
			return false;*/
		return addEx(type,app);
	}
	
	/**
	 * 取出一个待同步的事件，并且置状态为开始同步
	 * @param app
	 * @return
	 */
	public EUpdateType poll(Appliance app){
		for(int i = 0 ;i < EUpdateType.maxIndex();i++){
			EUpdateType type = EUpdateType.indexOf(i);
			if(type != null){
				SyncState state = app.getSyncState(type);
				if(state != null){
					synchronized (state) {
						if(state.getState() == EState.Todo){
							state.setState(EState.Doing);
							return type;
						}
					}
				}
			}
		}
		return null;
	}
	
/*	public EUpdateType poll(){
		List<Appliance> listApp = PengderChannelGroup.defaultTerminalGroup().toApplianceList();
		for(Appliance app : listApp){
			EUpdateType type = poll(app);
			if(type != null){
				return type;
			}
		}
		return null;
	}*/
	
}
