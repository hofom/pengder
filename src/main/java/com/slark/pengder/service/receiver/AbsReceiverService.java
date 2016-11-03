package com.slark.pengder.service.receiver;

import com.slark.SlarkContext;
import com.slark.except.SlarkException;
import com.slark.pengder.except.ServiceException;
import com.slark.pengder.protocol.PengderMessage;
import com.slark.pengder.service.ISimpleService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.CallbackPreferringPlatformTransactionManager;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengwei on 16/7/12.
 */
public abstract class AbsReceiverService /*implements ISimpleService*/ {
	private static Logger logger = Logger
			.getLogger(AbsReceiverService.class);
	/**
	 * @param param
	 * @return
	 */
	/*
	public List call(final Object param) {
		try {
			if (param instanceof PengderMessage) {
				logger.debug("开始调用服务+ " + this.getClass().getName() );
				return SlarkContext.getApplicationContext()
						.getBean(this.getClass())
						.doService((PengderMessage) param);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("call server " + this.getClass().getName()
					+ " failed!");
			e.printStackTrace();
		}
		return null;
	}
	*/
	/**
	 * @Description 重新定义这个接口
	 * @param msg
	 * @return
	 */
	public abstract List<PengderMessage> doService(PengderMessage msg);

	/**
	 * @Description 创建一个返回的消息列表
	 * @return
	 */
	protected List<PengderMessage> newResponeMsgList() {
		return new ArrayList<PengderMessage>();
	}

}
