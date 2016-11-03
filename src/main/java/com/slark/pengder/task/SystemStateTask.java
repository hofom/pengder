package com.slark.pengder.task;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.slark.pengder.service.AbsSimpleService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.slark.pengder.mybatis.dao.ProcMapper;
import com.slark.pengder.mybatis.dao.TeventofuserMapper;
import com.slark.pengder.mybatis.dao.TinstrumentMapper;
import com.slark.pengder.mybatis.dao.TuserrightMapper;
import com.slark.pengder.mybatis.model.Teventofuser;
import com.slark.pengder.mybatis.model.TeventofuserExample;
import com.slark.pengder.mybatis.model.Tinstrument;
import com.slark.pengder.mybatis.model.Tuserright;
import com.slark.pengder.mybatis.model.TuserrightExample;
import com.slark.pengder.net.PengderChannelGroup;
import com.slark.pengder.service.ISimpleService;

/**
 * 检查设备状态和系统状态 后台定时任务，每分钟一次 这样调用并不及时，可以考虑由离线事件触发通知
 * 
 * @author HeHao
 *
 */
@Component(value = "systemStateTask")
public class SystemStateTask {
	private static final Logger logger = Logger
			.getLogger(SystemStateTask.class);

	private static boolean sysOffMode = false;

	@Value("${pengder.notice.systemOff.num:10}")
	private Integer systemOffNums;

	@Value("${pengder.notice.systemOff.minute:10}")
	private Integer instOffMinutes;

	@Autowired
	@Qualifier("instrumentOfflineNotice")
	AbsSimpleService instrumentOfflineNotice;

	@Autowired
	@Qualifier("systemOfflineNotice")
	AbsSimpleService systemOfflineNotice;

	/**
	 * 处理惩罚信息
	 */
	public void check() {
		logger.debug("systemStateTask run....");
		try {
			if (PengderChannelGroup.defaultTerminalGroup().getOfflineApps() >= systemOffNums) {
				/**
				 * 设备大量离线，直接通知系统管理员
				 */
				if (!sysOffMode) {
					logger.warn("设备大量离线，通知系统管理员");
					sysOffMode = true;
					systemOfflineNotice.doService(null);
				}
				PengderChannelGroup.defaultTerminalGroup().getOfflineIds()
						.clear();

			} else {
				/**
				 * 通知设备管理员
				 */
				if (sysOffMode) {
					sysOffMode = false;
				}

				instOffCheck();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 查询所有待通知离线设备
	 */
	private void instOffCheck() {
		Map<Integer, Date> mapOffIds = PengderChannelGroup
				.defaultTerminalGroup().getOfflineIds();
		Iterator<Map.Entry<Integer, Date>> it = mapOffIds.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, Date> entry = it.next();
			Integer id = entry.getKey();
			Date date = entry.getValue();
			if (PengderChannelGroup.defaultTerminalGroup()
					.findApplianceByAppId(id) != null) {
				it.remove();// 设备在线
			} else {
				long minutes = ((new Date()).getTime() - date.getTime())
						/ (60 * 1000);
				if (minutes >= instOffMinutes) {
					// 检测时间内一直离线，发送设备离线通知
					instOffNotice(id);
					it.remove();
				} else {
					;
				}
			}
		}
	}

	@Autowired
	TinstrumentMapper tinstrumentMapper;

	/**
	 * 通知管理员设备离线
	 */
	private void instOffNotice(Integer id) {
		if (id == null)
			return;
		logger.debug("发送当前离线设备[" + id + "]通知");
		Tinstrument o = tinstrumentMapper.selectByPrimaryKey(id);
		if (o != null) {
			instrumentOfflineNotice.doService(o);
		}
		return;
	}

}
