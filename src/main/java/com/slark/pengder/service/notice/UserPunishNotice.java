package com.slark.pengder.service.notice;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.slark.pengder.mybatis.dao.TuserMapper;
import com.slark.pengder.mybatis.model.Tbookingrecord;
import com.slark.pengder.mybatis.model.Teventofuser;
import com.slark.pengder.mybatis.model.Tuser;
import com.slark.pengder.notice.Notice;
import com.slark.pengder.notice.NoticeContext;
import com.slark.pengder.service.AbsSimpleService;

/**
 * 用户事件触发，用户惩罚通知 分为进入惩罚期和出惩罚期 只发送邮件
 * 
 * @author HeHao
 *
 */
@Service("userPunishNotice")
public class UserPunishNotice extends AbsSimpleService {
	private static Logger logger = Logger.getLogger(UserPunishNotice.class);

	@Value("${pengder.notice.punishBegin.send:true}")
	boolean isSendB;
	@Value("${pengder.notice.punishBegin.title:通知：进入惩罚期通知}")
	String titleB;
	@Value("${pengder.notice.punishBegin.text:您好，您已进入惩罚期}")
	String templateB;

	@Value("${pengder.notice.punishEnd.send:true}")
	boolean isSendE;
	@Value("${pengder.notice.punishEnd.title:通知：出惩罚期通知}")
	String titleE;
	@Value("${pengder.notice.punishEnd.text:您好，您已出惩罚期}")
	String templateE;

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
		if (isSendB || isSendE) {
			if (param instanceof Teventofuser) {
				/**
				 * 获取用户事件信息
				 */
				Teventofuser obj = (Teventofuser) param;
				/**
				 * 获取用户信息
				 */
				Tuser user = tuserMapper.selectByPrimaryKey(obj.getUserid());
				/**
				 * 组织邮件内容
				 */
				NoticeContext noticeContext;
				if (obj.getEventtype().equals(1009) && isSendB) {
					// 进入惩罚期
					noticeContext = new NoticeContext(titleB, templateB);
				} else if (obj.getEventtype().equals(1010) && isSendE) {
					// 退出惩罚期
					noticeContext = new NoticeContext(titleE, templateE);
				} else {
					return null;
				}
				/**
				 * 发送
				 */
				Notice notice = new Notice();
				notice.addReceiver(user.getMobilephone1());
				notice.setContext(noticeContext);
				notice.send();
			}
		}

		return null;
	}

}
