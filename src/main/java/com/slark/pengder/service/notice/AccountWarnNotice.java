package com.slark.pengder.service.notice;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slark.pengder.mybatis.dao.ProcMapper;
import com.slark.pengder.mybatis.dao.TaccountMapper;
import com.slark.pengder.mybatis.dao.TeventofaccountMapper;
import com.slark.pengder.mybatis.dao.TuserMapper;
import com.slark.pengder.mybatis.model.Taccount;
import com.slark.pengder.mybatis.model.Tbookingrecord;
import com.slark.pengder.mybatis.model.Teventofaccount;
import com.slark.pengder.mybatis.model.Tuser;
import com.slark.pengder.mybatis.model.TuserExample;
import com.slark.pengder.notice.Notice;
import com.slark.pengder.notice.NoticeContext;
import com.slark.pengder.service.AbsSimpleService;

/**
 * 账户异常邮件通知 只发送邮件
 * 
 * @author HeHao
 *
 */
@Service("accountWarnNotice")
public class AccountWarnNotice extends AbsSimpleService {
	private static Logger logger = Logger.getLogger(AccountWarnNotice.class);

	@Value("${pengder.notice.accountWarn.send:true}")
	boolean isSend;
	@Value("${pengder.notice.accountWarn.title:通知：账户通知}")
	String title;
	@Value("${pengder.notice.accountWarn.text:您好，您的账户可能出现以下问题之一：余额不足、透支、超支 \n 提示：\n 付款账户名称：$ {accountName}\n付款账户余额：$ {balance}}")
	String template;

	/**
	 *模式串的书写原先有问题
	 */
	String regexPartern = "\\$ \\{";
	/**
	 * 匹配串的书写原先也有问题
	 */
	String replacement = "\\$\\{";
	
	@Autowired
	TuserMapper tuserMapper;
	@Autowired
	ProcMapper procMapper;
	
	@Override
	public List doService(Object param) {
		// TODO Auto-generated method stub
		if (isSend) {
			if (param instanceof Taccount) {
				/**
				 * 获取账户信息
				 */
				Taccount obj = (Taccount) param;
				/**
				 * 检查是否为活跃账户
				 */
				Map paramMap =  new HashMap();
				paramMap.put("accountId", obj.getId());
				procMapper.checkActivity(paramMap);
				Integer state = (Integer) paramMap.get("state");
				if(state.equals(0)){
					//非活跃用户
					return null;
				}
				/**
				 * 获取账户管理者信息
				 */
				List<Tuser> l = tuserMapper.select171(obj.getId());
				/**
				 * 组织邮件内容
				 */
				String template1 = template.replaceAll(regexPartern, replacement);
				NoticeContext noticeContext = new NoticeContext(title, template1);
				noticeContext.putMap("accountName", obj.getAccountname());
				noticeContext.putMap("balance", obj.getMoney().floatValue()/100);
				/**
				 * 发送
				 */
				Notice notice = new Notice();
				for (Tuser user : l) {
					notice.addReceiver(user.getEmail1());
				}
				notice.setContext(noticeContext);
				notice.send();
				
			}
		}

		return null;
	}
}
