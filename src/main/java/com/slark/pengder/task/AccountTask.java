package com.slark.pengder.task;

import java.util.Calendar;
import java.util.List;

import com.slark.pengder.service.AbsSimpleService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.slark.pengder.mybatis.dao.TaccountMapper;
import com.slark.pengder.mybatis.model.Taccount;

/**
 * 定期检查账户，发出欠费、超支等信息
 * 后台定时任务
 * @author HeHao
 *
 */
@Component(value="accountTask")
public class AccountTask {
	private static final Logger logger = Logger.getLogger(AccountTask.class);
	@Autowired
	@Qualifier("accountWarnNotice")
	AbsSimpleService accountWarnNotice;
	
	@Autowired
	@Qualifier("setAccountEvent")
	AbsSimpleService setAccountEvent;
	
	/**
	 * 检查账户
	 */
	public void check(){
		try {
			logger.debug("检查异常账户");
			/**
			 * 查询当天产生的所有异常账户
			 */
			List<Taccount> list = this.queryWarnAccount();

			for(Taccount o : list){
				//o = taccountMapper.selectByPrimaryKey(o.getId());
				accountWarnNotice.doService(o);
				//插入余额不足事件
				setAccountEvent.doService(o);
			}
			
			/**
			 * 大客户检查
			 */
			list = this.queryBigAccount();
			for(Taccount o : list){
				o.setMoney(null);
				//插入大客户检查事件
				setAccountEvent.doService(o);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage(), e);
		}
	}

	@Autowired
	TaccountMapper taccountMapper;

	private List<Taccount> queryWarnAccount(){
		return taccountMapper.selectWarnAccount();
	}
	
	private List<Taccount> queryBigAccount(){
		Integer year = Calendar.getInstance().get(Calendar.YEAR);
		return taccountMapper.selectPayedAccount(year);
	}
	
}
