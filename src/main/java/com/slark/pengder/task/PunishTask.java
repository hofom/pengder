package com.slark.pengder.task;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.slark.pengder.service.AbsSimpleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.slark.pengder.mybatis.dao.ProcMapper;
import com.slark.pengder.mybatis.dao.TeventofuserMapper;
import com.slark.pengder.mybatis.dao.TuserrightMapper;
import com.slark.pengder.mybatis.model.Teventofuser;
import com.slark.pengder.mybatis.model.TeventofuserExample;
import com.slark.pengder.mybatis.model.Tuserright;
import com.slark.pengder.mybatis.model.TuserrightExample;
import com.slark.pengder.service.ISimpleService;

/**
 * 检查惩罚信息
 * 后台定时任务，每天0点调用
 * 这样调用并不及时，可以考虑有用户事件触发通知
 * @author HeHao
 *
 */
@Component(value = "punishTask")
public class PunishTask {
	private static final Logger logger = Logger.getLogger(PunishTask.class);

	/**
	 * 处理惩罚信息
	 */
	public void check() {
		try {
			if (update()) {
				notice();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Autowired
	TuserrightMapper tuserrightMapper;
	@Autowired
	ProcMapper procMapper;

	/**
	 * 调用存储过程，更新当天出惩罚期的用户，不需要开启事务
	 */
	private boolean update() {
		// 查询当天出惩罚期列表
		logger.debug("更新当天出惩罚期记录");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		Date currDate = calendar.getTime();
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		TuserrightExample example = new TuserrightExample();
		example.createCriteria().andExpiretimeGreaterThanOrEqualTo(currDate)
				.andExpiretimeLessThan(calendar.getTime());
		List<Tuserright> list = tuserrightMapper.selectByExample(example);
		for (Tuserright o : list) {
			Map paramMap = new HashMap();
			paramMap.put("userId", o.getUserid());
			paramMap.put("instrumentId", o.getInstrumentid());
			procMapper.getCurUserright(paramMap);
		}
		return true;
	}

	@Autowired
	@Qualifier("userPunishNotice")
	AbsSimpleService userPunishNotice;
	@Autowired
	TeventofuserMapper teventofuserMapper;

	/**
	 * 查询所有当天进入惩罚期和出惩罚期的用户，发送提示信息
	 */
	private void notice() {
		// 查询前一天用户进出惩罚期事件
		// 查询当天出惩罚期列表
		logger.debug("发送当天进出惩罚期通知");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		Date currDate = calendar.getTime();
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		List<Short> listType = new ArrayList<Short>();
		listType.add((short) 1009);// 进惩罚期
		listType.add((short) 1010);// 出惩罚期
		TeventofuserExample example = new TeventofuserExample();
		example.createCriteria().andEventtypeIn(listType)
				.andOperationtimeGreaterThanOrEqualTo(calendar.getTime())
				.andOperationtimeLessThan(currDate);
		List<Teventofuser> list = teventofuserMapper.selectByExample(example);
		for (Teventofuser o : list) {
			userPunishNotice.doService(o);
		}
		return;
	}
	
}
