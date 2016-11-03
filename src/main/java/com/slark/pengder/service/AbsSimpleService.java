package com.slark.pengder.service;

import com.slark.SlarkContext;
import com.slark.pengder.protocol.PengderMessage;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * 消息服务基类
 * 
 * @author HeHao
 *
 */
public abstract class AbsSimpleService /*implements ISimpleService*/ {
	private static Logger logger = Logger
			.getLogger(AbsSimpleService.class);

	/**
	 * @param param
	 * @return
	 */
	/*
	public List call(Object param) {
		try {
			return SlarkContext.getApplicationContext()
					.getBean(this.getClass()).doService(param);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("call server " + this.getClass().getName()
					+ " failed!");
			e.printStackTrace();
			return null;
		}
	}
	*/
	/**
	 * @Description 重新定义这个接口
	 * @param param
	 * @return
	 */
	public abstract List doService(Object param);

}
