package com.slark.pengder.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slark.pengder.comm.UtilCheck;
import com.slark.pengder.mybatis.dao.TinstrumentMapper;
import com.slark.pengder.mybatis.model.Tinstrument;
import com.slark.pengder.net.Appliance;
import com.slark.pengder.net.PengderChannelGroup;

/**
 * 查询所有设备的状态，返回设备状态列表，列表下标对应设备id的转换值
 * @author HeHao
 *
 */
@Service("webInstStateService")
public class WebInstStateService extends AbsSimpleService {
	private static final Logger logger = Logger
			.getLogger(WebInstStateService.class);

	@Autowired
	TinstrumentMapper tinstrumentMapper;

	public List doService(Object param) {
		// TODO Auto-generated method stub

		int max = 1;

		List<Tinstrument> listInst = tinstrumentMapper.selectByExample(null);

		/**
		 * 先获取最大设备id，用于生成列表
		 */
		for (Tinstrument inst : listInst) {
			if (max < UtilCheck.checkTinstumentId(inst.getId()))
				max = UtilCheck.checkTinstumentId(inst.getId());
		}

		/**
		 * 创建max+1个元素的list，并全部初始化为0
		 */
		List<Integer> list = new ArrayList<Integer>(Collections.nCopies(max+1, 0));
		
		PengderChannelGroup pcg = PengderChannelGroup.defaultTerminalGroup();
		for (Appliance app : pcg.toApplianceList()) {
			int offset = UtilCheck.checkTinstumentId(app.getApplianceID());
			logger.debug("appId:"+app.getApplianceID()+",and clientState:"+app.getClientState() + ",array index : " + offset);
			if(app.getApplianceID()>=0 && app.isSyncInitData())
				list.set(offset, app.getClientState());// 在线
		}

		return list;
	}

}
