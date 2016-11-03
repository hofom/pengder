package com.slark.pengder.service.notice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.slark.pengder.mybatis.dao.ProcMapper;
import com.slark.pengder.mybatis.dao.TinstrumentMapper;
import com.slark.pengder.mybatis.dao.TuserMapper;
import com.slark.pengder.mybatis.dao.TusereventofterminalMapper;
import com.slark.pengder.mybatis.dao.TuserrightMapper;
import com.slark.pengder.mybatis.model.Tbookingrecord;
import com.slark.pengder.mybatis.model.Tinstrument;
import com.slark.pengder.mybatis.model.Tuser;
import com.slark.pengder.mybatis.model.Tusereventofterminal;
import com.slark.pengder.mybatis.model.Tuserright;
import com.slark.pengder.mybatis.model.TuserrightExample;
import com.slark.pengder.notice.Notice;
import com.slark.pengder.notice.NoticeContext;
import com.slark.pengder.protocol.MessageProtos.SystemEvent;
import com.slark.pengder.service.AbsSimpleService;

/**
 * 仪器使用超时，通知设备管理员 发送邮件和短信
 * 同时提醒使用者
 * @author HeHao
 *
 */
@Service("instrumentUsingTimeoutNotice")
public class InstrumentUsingTimeoutNotice extends AbsSimpleService {
	private static Logger logger = Logger
			.getLogger(InstrumentUsingTimeoutNotice.class);

	@Value("${IsSendNoteEmailInstrumentWarn:true}")
	boolean isSendEmail;
	@Value("${IsSendNoteSMSInstrumentUsingWarn:true}")
	boolean isSendSms;
	@Value("${SubjectNoteInstrumentWarn:通知：仪器通知}")
	String title;
	@Value("${ContentNoteInstrumentWarn:您好，仪器超长使用提醒！\n 仪器名称：$ {instName}，仪器ID：$ {instId}，使用者姓名：$ {userName}，开始时间：$ {actionTime}，刷卡记录ID：$ {cardSwipeDispID}，动作类型：$ {actionType}}")
	String emailTemplate;
	@Value("${ContentNoteSMSInstrumentUsingWarn:您好，仪器超长使用提醒！\n 仪器名称：$ {instName}，开始时间：$ {actionTime}，动作类型：$ {actionType}}")
	String smsTemplate;
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
	TuserrightMapper tuserrightMapper;
	@Autowired
	TinstrumentMapper tinstrumentMapper;
	@Autowired
	TusereventofterminalMapper tuserEventMapper;
	@Autowired
	ProcMapper procMapper;

	@Override
	public List doService(Object param) {
		// TODO Auto-generated method stub
		if (isSendEmail || isSendSms) {
			if (param instanceof SystemEvent) {
				/**
				 * 获取超时事件信息
				 */
				SystemEvent obj = (SystemEvent) param;
				/**
				 * 设备信息
				 */
				Tinstrument inst = tinstrumentMapper.selectByPrimaryKey(obj
						.getInstrumentId());
				/**
				 * 用户信息,刷卡记录
				 */

				Map<String, Object> paramMap = new HashMap<String, Object>();
				paramMap.put("eventContent", obj.getEventContent());
				procMapper.terminalIDFormation(paramMap);
				String cardSwipeDispID = (String) paramMap
						.get("cardSwipeDispID");
				/**
				 * 获取设备管理员信息
				 */
				TuserrightExample example = new TuserrightExample();
				example.createCriteria()
						.andUserrightidBetween(
								Integer.valueOf(254).shortValue(),
								Integer.valueOf(255).shortValue())
						.andInstrumentidEqualTo(inst.getId());
				List<Tuserright> listUserRight = tuserrightMapper
						.selectByExample(example);
				List<Tuser> listAdmin = new ArrayList<Tuser>();
				for (Tuserright ur : listUserRight) {
					Tuser u = tuserMapper.selectByPrimaryKey(ur.getUserid());
					if (u != null) {
						listAdmin.add(u);
					}
				}
				/**
				 * 组织文本内容
				 */
				Tusereventofterminal userEvent = tuserEventMapper
						.selectByPrimaryKey(obj.getEventContent());
				NoticeContext emailContext =null;

				if(userEvent != null) {
					Tuser user = tuserMapper.selectByPrimaryKey(userEvent
							.getUserid());

					String template1 = emailTemplate.replaceAll(regexPartern, replacement);

					emailContext = new NoticeContext(title, template1);
					emailContext.putMap("instName", inst.getName());
					emailContext.putMap("instId", inst.getId());
					emailContext.putMap("userName",
							user.getFirstname() + user.getLastname());
					emailContext.putMap("actionTime", userEvent.getCreatedtime()
							.toLocaleString());
					emailContext.putMap("cardSwipeDispID", cardSwipeDispID);
					switch (userEvent.getActiontypeid()) {
						case 1402:
							emailContext.putMap("actionType", "实验开机");
							break;
						case 1403:
							emailContext.putMap("actionType", "培训开机");
							break;
						case 1404:
							emailContext.putMap("actionType", "维护开机");
							break;
						case 1405:
							emailContext.putMap("actionType", "待刷开机");
							break;
						default:
							emailContext.putMap("actionType",
									userEvent.getActiontypeid());
					}

					String template2 = smsTemplate.replaceAll(regexPartern, replacement);
					NoticeContext smsContext = new NoticeContext(title, template2);
					smsContext.setRootMap(emailContext.getRootMap());
					/**
					 * 发送
					 */
					if (isSendEmail) {
						Notice notice = new Notice();
						for (Tuser admin : listAdmin) {
							notice.addReceiver(admin.getEmail1());
						}
						//给使用者发送提醒
						notice.addReceiver(user.getEmail1());
						notice.setContext(emailContext);
						notice.send();
					}

					if (isSendSms) {
						Notice notice = new Notice();
						for (Tuser admin : listAdmin) {
							notice.addReceiver(admin.getMobilephone1());
						}
						//给使用者发送提醒
						notice.addReceiver(user.getMobilephone1());
						notice.setContext(smsContext);
						notice.send();
					}
				}
			}
		}

		return null;
	}

}
