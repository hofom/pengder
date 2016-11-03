package com.slark.pengder.service.notice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.slark.pengder.mybatis.dao.ProcMapper;
import com.slark.pengder.mybatis.dao.TbookingrecordMapper;
import com.slark.pengder.mybatis.dao.TinstrumentMapper;
import com.slark.pengder.mybatis.dao.TuserMapper;
import com.slark.pengder.mybatis.dao.TusereventofterminalMapper;
import com.slark.pengder.mybatis.model.Tbookingrecord;
import com.slark.pengder.mybatis.model.Tinstrument;
import com.slark.pengder.mybatis.model.Tuser;
import com.slark.pengder.notice.Notice;
import com.slark.pengder.notice.NoticeContext;
import com.slark.pengder.protocol.MessageProtos.SystemEvent;
import com.slark.pengder.service.AbsSimpleService;

/**
 * 预约保护提醒,发送给预约者
 * 只发短信
 * @author HeHao
 *
 */
@Service("bookingProtectNotice")
public class BookingProtectNotice extends AbsSimpleService {
	private static Logger logger = Logger
			.getLogger(BookingProtectNotice.class);

	@Value("${pengder.notice.bookingProtect.send:true}")
	boolean isSend;
	String title = null;
	@Value("${pengder.notice.bookingProtect.text:$ {userName}您好，您预约的仪器[$ {instName}]已进入您专属的预约保护时段，请您如约使用仪器！\n您预约的开始时间：$ {startTime}，预约保护时段结束时间：$ {endTime}，仪器当前状态：$ {instState}}")
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
	TbookingrecordMapper tbookingrecordMapper;
	@Autowired
	TinstrumentMapper tinstrumentMapper;
	@Autowired
	TusereventofterminalMapper tuserEventMapper;
	@Autowired
	ProcMapper procMapper;

	@Override
	public List doService(Object param) {
		// TODO Auto-generated method stub
		if (isSend) {
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
				 * 预约信息,用户信息
				 */
				Tbookingrecord booking = tbookingrecordMapper
						.selectByPrimaryKey(obj.getEventContent());
				Tuser user = tuserMapper.selectByPrimaryKey(booking
						.getUserid());
				/**
				 * 组织文本内容
				 */
				String template1 = template.replaceAll(regexPartern, replacement);
				NoticeContext noticeContext = new NoticeContext(title, template1);
				noticeContext.putMap("instName", inst.getName());
				noticeContext.putMap("instId", inst.getId());
				noticeContext.putMap("userName",
						user.getFirstname() + user.getLastname());
				
				Date now = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");  
				noticeContext.putMap("startTime", dateFormat.format(now));
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(now);
				calendar.add(Calendar.MINUTE, inst.getBookingholdingtime());
				noticeContext.putMap("endTime", dateFormat.format(calendar.getTime()));
				
				switch (obj.getEventType()) {
				case 1485:
					noticeContext.putMap("instState", "空闲");
					break;
				case 1486:
					noticeContext.putMap("instState", "非预约用户使用");
					break;
				case 1487:
					noticeContext.putMap("instState", "预约用户本人在使用，但使用类型与预约类型不符");
					break;
				default:
					noticeContext.putMap("instState",
							obj.getEventType());
				}

				/**
				 * 发送
				 */
				//给预约者发送提醒
				Notice notice = new Notice();
				notice.addReceiver(user.getMobilephone1());
				notice.setContext(noticeContext);
				notice.send();
			}
		}

		return null;
	}

}
