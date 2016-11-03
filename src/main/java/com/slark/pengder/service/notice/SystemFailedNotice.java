package com.slark.pengder.service.notice;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.slark.pengder.mybatis.dao.TuserMapper;
import com.slark.pengder.mybatis.model.Tbookingrecord;
import com.slark.pengder.mybatis.model.Tuser;
import com.slark.pengder.notice.Notice;
import com.slark.pengder.notice.NoticeContext;
import com.slark.pengder.service.AbsSimpleService;

/**
 * 通讯服务系统异常，通知系统管理员 发送邮件和短信
 * 
 * @author HeHao
 *
 */
@Service("systemFailedNotice")
public class SystemFailedNotice extends AbsSimpleService {
	private static Logger logger = Logger.getLogger(SystemFailedNotice.class);

	@Value("${pengder.notice.systemFail.sendEmail:true}")
	boolean isSendEmail;
	@Value("${pengder.notice.systemFail.sendSms:true}")
	boolean isSendSms;
	@Value("${pengder.notice.systemFail.title:通知：通信服务系统消息}")
	String title;
	@Value("${pengder.notice.systemFail.text:您好，通信服务异常终止}")
	String templateEmail;
	@Value("${pengder.notice.systemFail.sms:您好，通信服务异常}")
	String templateSms;

	/**
	 *模式串的书写原先有问题
	 */
	String regexPartern = "\\$ \\{";
	/**
	 * 匹配串的书写原先也有问题
	 */
	String replacement = "\\$\\{";
	
	@Value("${pengder.notice.email.admin:}")
	String adminMail;
	@Value("${pengder.notice.sms.admin:}")
	String adminMobile;

	@Autowired
	TuserMapper tuserMapper;

	@Override
	public List doService(Object param) {
		// TODO Auto-generated method stub
		if (isSendEmail || isSendSms) {
			/**
			 * 组织邮件内容
			 */
			NoticeContext emailContext = new NoticeContext(title, templateEmail);
			NoticeContext smsContext = new NoticeContext(title, templateSms);
			/**
			 * 发送
			 */
			if (isSendEmail && adminMail.length() > 0) {
				Notice notice = new Notice();
				notice.addReceiver(adminMail);
				notice.setContext(emailContext);
				notice.send();
			}
			if (isSendSms && adminMobile.length() > 0) {
				Notice notice = new Notice();
				notice.addReceiver(adminMobile);
				notice.setContext(smsContext);
				notice.send();
			}

		}

		return null;
	}

}
