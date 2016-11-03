package com.slark.pengder.service.notice;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.slark.pengder.mybatis.dao.TuserMapper;
import com.slark.pengder.mybatis.dao.TuserrightMapper;
import com.slark.pengder.mybatis.model.Tbookingrecord;
import com.slark.pengder.mybatis.model.Tinstrument;
import com.slark.pengder.mybatis.model.Tuser;
import com.slark.pengder.mybatis.model.Tuserright;
import com.slark.pengder.mybatis.model.TuserrightExample;
import com.slark.pengder.notice.Notice;
import com.slark.pengder.notice.NoticeContext;
import com.slark.pengder.protocol.MessageProtos.SystemEvent;
import com.slark.pengder.service.AbsSimpleService;

/**
 * 仪器离线提醒,通知设备管理员 只发送短信
 * 
 * @author HeHao
 *
 */
@Service("instrumentOfflineNotice")
public class InstrumentOfflineNotice extends AbsSimpleService {
	private static Logger logger = Logger
			.getLogger(InstrumentOfflineNotice.class);

	@Value("${pengder.notice.instOff.send:true}")
	boolean isSend;
	String title = null;
	// 管理员您好，[" + instrumentName + "]仪器离线时间过长提醒！
	@Value("${pengder.notice.instOff.text:管理员您好，[$ {name}]仪器离线时间过长提醒！}")
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
	TuserrightMapper tuserrightMapper;

	@Override
	public List doService(Object param) {
		// TODO Auto-generated method stub
		if (isSend) {
			if (param instanceof Tinstrument) {
				/**
				 * 获取离线设备信息
				 */
				Tinstrument obj = (Tinstrument) param;
				/**
				 * 获取设备管理员信息
				 */
				TuserrightExample example = new TuserrightExample();
				example.createCriteria()
						.andUserrightidBetween(
								Integer.valueOf(254).shortValue(),
								Integer.valueOf(255).shortValue())
						.andInstrumentidEqualTo(obj.getId());
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
				 * 组织短信内容
				 */
				String template1 = template.replaceAll(regexPartern, replacement);
				NoticeContext noticeContext = new NoticeContext(title,
						template1);
				noticeContext.putMap("name", obj.getName());
				/**
				 * 发送
				 */
				Notice notice = new Notice();
				for (Tuser user : listAdmin) {
					notice.addReceiver(user.getMobilephone1());
				}
				notice.setContext(noticeContext);
				notice.send();
			}
		}

		return null;
	}

}
