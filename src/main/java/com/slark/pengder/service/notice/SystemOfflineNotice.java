package com.slark.pengder.service.notice;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.slark.pengder.mybatis.dao.TauthassignmentsMapper;
import com.slark.pengder.mybatis.dao.TinstrumentMapper;
import com.slark.pengder.mybatis.dao.TuserMapper;
import com.slark.pengder.mybatis.model.TauthassignmentsExample;
import com.slark.pengder.mybatis.model.TauthassignmentsKey;
import com.slark.pengder.mybatis.model.TinstrumentExample;
import com.slark.pengder.mybatis.model.Tuser;
import com.slark.pengder.net.PengderChannelGroup;
import com.slark.pengder.notice.Notice;
import com.slark.pengder.notice.NoticeContext;
import com.slark.pengder.service.AbsSimpleService;

/**
 * 通讯服务系统异常，该异常由设备大量离线引起， 发送给系统管理员 只发送短信
 * 这个系统管理员的定义有点怪，地址不是在prop文件中定义的，而是在数据库中定义，啥意思
 * 
 * @author HeHao
 *
 */
@Service("systemOfflineNotice")
public class SystemOfflineNotice extends AbsSimpleService {
	private static Logger logger = Logger.getLogger(SystemOfflineNotice.class);

	@Value("${pengder.notice.systemOff.send:true}")
	boolean isSend;
	String title = null;
	@Value("${pengder.notice.systemOff.text:管理员您好，新增离线个数：$ {newOfflineNum}，当前在线个数：$ {onlineNum}，总离线个数：$ {offlineNum}}")
	String template;

	/**
	 *模式串的书写原先有问题
	 */
	String regexPartern = "\\$ \\{";
	/**
	 * 匹配串的书写原先也有问题
	 */
	String replacement = "\\$\\{";
	
	/*
	 * @Value("${RootEmailAddr:}") String adminMail;
	 * 
	 * @Value("${RootPhoneNum:}") String adminMobile;
	 */

	@Autowired
	TuserMapper tuserMapper;
	@Autowired
	TauthassignmentsMapper authMapper;
	@Autowired
	TinstrumentMapper instMapper;

	@Override
	public List doService(Object param) {
		/**
		 * 应该把新增离线数，在线数，应在线设备总数传进来，或者放在一个地方存着
		 */
		Integer newOffline = 10;
		// TODO Auto-generated method stub
		if (isSend) {
			/**
			 * 获取管理员信息
			 */
			TauthassignmentsExample authExample = new TauthassignmentsExample();
			authExample.createCriteria().andItemnameEqualTo("132");// 管理员
			List<TauthassignmentsKey> listAuth = authMapper
					.selectByExample(authExample);
			List<Tuser> listAdmin = new ArrayList<Tuser>();
			for (TauthassignmentsKey auth : listAuth) {
				Tuser u = tuserMapper.selectByPrimaryKey(Integer.valueOf(auth
						.getUserid()));
				if (u != null)
					listAdmin.add(u);
			}
			/**
			 * 获取设备数量
			 */
			// 获取本应在线仪器个数（已绑定且工作状态为正常且未被删除的仪器总数）
			TinstrumentExample instExample = new TinstrumentExample();
			instExample
					.createCriteria()
					.andTerminalmacNotEqualTo("00:00:00:00:00:00")
					.andInstrumentstatusidEqualTo(
							Integer.valueOf(231).shortValue())
					.andDeleteddateIsNull();
			List listInst = instMapper.selectByExample(instExample);
			/**
			 * 组织邮件内容
			 */
			String template1 = template.replaceAll(regexPartern, replacement);
			NoticeContext noticeContext = new NoticeContext(title, template1);
			noticeContext.putMap("newOfflineNum", newOffline);
			noticeContext.putMap("onlineNum", PengderChannelGroup
					.defaultTerminalGroup().getAppliances().size());
			noticeContext.putMap("oflineNum", listInst.size()
					- PengderChannelGroup.defaultTerminalGroup().getAppliances()
							.size());
			/**
			 * 发送
			 */
			Notice notice = new Notice();
			for (Tuser admin : listAdmin) {
				notice.addReceiver(admin.getMobilephone1());
			}
			notice.setContext(noticeContext);
			notice.send();
		}

		return null;
	}

}
