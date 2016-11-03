package com.slark.pengder.service;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slark.pengder.mybatis.dao.TbookingrecordMapper;
import com.slark.pengder.mybatis.dao.TinstrumentMapper;
import com.slark.pengder.mybatis.dao.TinstrumentreservationMapper;
import com.slark.pengder.mybatis.dao.TneedsyndataMapper;
import com.slark.pengder.mybatis.dao.TtemporarycardbindingMapper;
import com.slark.pengder.mybatis.dao.TuserrightMapper;
import com.slark.pengder.mybatis.model.Tbookingrecord;
import com.slark.pengder.mybatis.model.TbookingrecordExample;
import com.slark.pengder.mybatis.model.Tinstrument;
import com.slark.pengder.mybatis.model.Tinstrumentreservation;
import com.slark.pengder.mybatis.model.Tneedsyndata;
import com.slark.pengder.mybatis.model.TneedsyndataExample;
import com.slark.pengder.mybatis.model.Ttemporarycardbinding;
import com.slark.pengder.mybatis.model.Tuserright;
import com.slark.pengder.tools.EUpdateType;
import com.slark.pengder.tools.SyncDataTaskList;

/**
 * 数据库资料变更 或者 tneed触发的同步任务
 * 写同步任务到内存
 * 由task定时任务调用
 * @author HeHao
 *
 */
@Service("dbSyncDataService")
public class DbSyncDateService extends AbsSimpleService {
	private static final Logger logger = Logger
			.getLogger(DbSyncDateService.class);

	@Autowired
	SyncDataTaskList syncList;

	@Transactional
	public List doService(Object param) {
		// TODO Auto-generated method stub
		// 检查用户信息
		checkNeedSyncData(EUpdateType.UserList);
		// 检查账户信息
		checkNeedSyncData(EUpdateType.AccountList);
		// 检查日历信息
		checkNeedSyncData(EUpdateType.CalendarList);
		// 检查全局配置信息
		checkNeedSyncData(EUpdateType.GlobalConfig);
		// 检查资格信息
		checkUserRight(EUpdateType.UserRightList);
		// 检查临时卡关联信息
		checkTempCardBinding(EUpdateType.TempCardBindingList);
		// 检查仪器详细信息
		checkInstrumentDetail(EUpdateType.InstrumentDetail);
		// 检查专享时间段信息
		checkReservation(EUpdateType.ReservationList);
		// 检查预约信息
		checkBooking(EUpdateType.BookingList);
		
		return null;
	}

	@Autowired
	TneedsyndataMapper tneedsyndataMapper;
	/**
	 * 检查待同步任务表，该表记录全局数据同步信息
	 * 
	 * @param type
	 */
	private void checkNeedSyncData(EUpdateType type) {
		TneedsyndataExample example = new TneedsyndataExample();
		example.createCriteria().andNeedsyndatatypeEqualTo(
				(short) type.getNumber());
		List<Tneedsyndata> list = tneedsyndataMapper
				.selectNewByExample(example);
		for (Tneedsyndata o : list) {
			syncList.add(type, o.getTargetinstrumentid());
		}
		return;
	}

	@Autowired
	TuserrightMapper tuserrightMapper;

	/**
	 * 检查未同步的授权信息
	 * 
	 * @param type
	 */
	private void checkUserRight(EUpdateType type) {
		List<Tuserright> list = tuserrightMapper.selectNewByExample(null);
		for (Tuserright o : list) {
			syncList.add(type, o.getInstrumentid());
		}
		return;
	}

	@Autowired
	TtemporarycardbindingMapper ttemporarycardbindingMapper;

	/**
	 * 检查临时卡信息，将已过期临时卡置已为同步状态 生成未过期未同步临时卡同步任务
	 * 
	 * @param type
	 */
	private void checkTempCardBinding(EUpdateType type) {
		// 更新过期临时卡状态
		ttemporarycardbindingMapper.updateByEndtime();

		List<Ttemporarycardbinding> list = ttemporarycardbindingMapper
				.selectNewByExample(null);
		for (Ttemporarycardbinding o : list) {
			syncList.add(type, o.getInstrumentid());
		}
		return;
	}

	@Autowired
	TinstrumentMapper tinstrumentMapper;

	/**
	 * 检查设备详细信息
	 * 
	 * @param type
	 */
	private void checkInstrumentDetail(EUpdateType type) {
		List<Tinstrument> list = tinstrumentMapper.selectNewByExample(null);
		for (Tinstrument o : list) {
			syncList.add(type, o.getId());
		}
		return;
	}

	@Autowired
	TinstrumentreservationMapper tinstrumentreservationMapper;

	/**
	 * 检查专享时段信息
	 * 18726910752
	 * @param type
	 */
	private void checkReservation(EUpdateType type) {
		List<Tinstrumentreservation> list = tinstrumentreservationMapper
				.selectNewByExample(null);
		for (Tinstrumentreservation o : list) {
			syncList.add(type, o.getInstrumentid());
		}
		return;
	}

	@Autowired
	TbookingrecordMapper tbookingrecordMapper;
	/**
	 * 检查未同步预约信息
	 * @param type
	 */
	private void checkBooking(EUpdateType type) {
		TbookingrecordExample example = new TbookingrecordExample();
		example.createCriteria().andBookingstatusidNotEqualTo((short) 1106)
				.andStarttimeGreaterThan(new Date());
		List<Tbookingrecord> list = tbookingrecordMapper
				.selectNewByExample(example);
		for (Tbookingrecord o : list) {
			syncList.add(type, o.getInstrumentid());
		}
		return;
	}

}
