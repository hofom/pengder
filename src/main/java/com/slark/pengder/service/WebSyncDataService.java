package com.slark.pengder.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slark.pengder.mybatis.dao.TinstrumentMapper;
import com.slark.pengder.mybatis.model.Tinstrument;
import com.slark.pengder.net.Appliance;
import com.slark.pengder.net.PengderChannelGroup;
import com.slark.pengder.tools.EUpdateType;
import com.slark.pengder.tools.SyncDataTaskList;

/**
 * 处理web发起的数据同步命令
 * 写同步命令到内存
 * @author HeHao
 *
 */
@Service("webSyncDataService")
public class WebSyncDataService extends AbsSimpleService {
	private static final Logger logger = Logger.getLogger(WebSyncDataService.class);
	
	@Autowired
	private SyncDataTaskList syncList;
	
	public List doService(Object param) {
		// TODO Auto-generated method stub
		
		if(param instanceof Map){
			Map paramMap = (Map) param;
			EUpdateType type = (EUpdateType) paramMap.get("type");
			Integer instId = (Integer) paramMap.get("instId");
			if(type == null || instId == null)
				return null;
			syncList.addEx(type, instId);
		}
		return null;
	}

}
