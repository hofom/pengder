package com.slark.pengder.mybatis.dao;

import java.util.Map;

public interface ProcMapper {
	/**
	 * 标记同步时间
	 * @param paramMap（type，tick，str）
	 * @return
	 */
	void updateReceiveSynTick(Map paramMap);
	
	/**
	 * 更新预约状态
	 * @return
	 */
	void updateRecordTo1104();
	
	/**
	 * 预约完成,更新预约状态
	 * @param paramMap(eventContent,1)
	 * @return
	 */
	void updateRecordTo1108(Map paramMap);
	
	/**
	 * 更新用户使用资格
	 * @param paramMap(userId,instrumentId,返回userRightId)
	 * @return
	 */
	void getCurUserright(Map paramMap);
	
	/**
	 * 检查账户活跃度
	 * @param paramMap(accountId,返回state)
	 * @return
	 */
	void checkActivity(Map paramMap);
	
	/**
	 * 写入用户使用记录
	 * @param paramMap(sessionId,startTime,endTime,bookingId,userId,accountId,
	 * 					groupId,userRight,cardSerial,instrumentId,0,1,0,null,null)
	 * @return
	 */
	void newRecordofuser(Map paramMap);
	
	/**
	 * 生成计费信息
	 * @param paramMap(sessionId,minutes,0,needInvoice,0,1,0,null)
	 * @return
	 */
	void newChargingofusing(Map paramMap);
	
	/**
	 * 预约过期,失约计费
	 * @param paramMap(eventContent,userId,null,null,"@p_error")
	 * @return
	 */
	void newChargingofmissappoint(Map paramMap);
	
	/**
	 * 查询刷卡记录ID（与web端显示ID对应）
	 * @param paramMap(eventContent,返回cardSwipeDispID)
	 * @return
	 */
	void terminalIDFormation(Map paramMap);

}
