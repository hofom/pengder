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
 * 预约同步失败,在预约下发和web下发预约失败时调用
 * 只发送邮件
 * @author HeHao
 *
 */
@Service("bookingFailedNotice")
public class BookingFailedNotice extends AbsSimpleService {
	private static  Logger logger = Logger.getLogger(BookingFailedNotice.class);
	
	@Value("${pengder.notice.bookingFail.send:true}")
	boolean isSend;
	@Value("${pengder.notice.bookingFail.title:通知：预约未成功}")
	String title;
	@Value("${pengder.notice.bookingFail.text:您好，您有未成功的预约}")
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
	
	@Override
	public List doService(Object param) {
		// TODO Auto-generated method stub
		if(isSend){
			if(param instanceof Tbookingrecord){
				/**
				 * 获取预约信息
				 */
				Tbookingrecord obj = (Tbookingrecord)param;
				/**
				 * 获取预约人、收件人信息
				 */
				Tuser user = tuserMapper.selectByPrimaryKey(obj.getUserid());
				/**
				 * 组织邮件内容
				 */
				String template1 = template.replaceAll(regexPartern, replacement);
				NoticeContext noticeContext = new NoticeContext(title,template1);
				noticeContext.putMap("name", user.getFirstname() + user.getLastname());
				noticeContext.putMap("bookingId", obj.getId());
				noticeContext.putMap("date", obj.getCreatedtime().toLocaleString());
				/**
				 * 发送
				 */
				Notice notice = new Notice();
				notice.addReceiver(user.getEmail1());
				notice.setContext(noticeContext);
				notice.send();
			}
		}
				
		return null;
	}
	
}
