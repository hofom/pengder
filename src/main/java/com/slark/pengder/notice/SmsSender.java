package com.slark.pengder.notice;

import org.apache.axis2.client.Options;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

/**
 * 
 * @author HeHao
 *
 */
public class SmsSender extends NoticeSender {
	private static final Logger logger = Logger.getLogger(NoticeSender.class);
	
	@Value("${UMessLoginID}")
	private static String user;        //用户名
	@Value("${UMessLoginPassword}")
	private static String password;    //密码


	static public NoticeSender createSender() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		try {
			String result;
			
			UMessServiceStub stub = new UMessServiceStub();

			/**
			 * 初始化
			 */
			Options options = stub._getServiceClient().getOptions();
			options.setManageSession(true);
			options.setProperty("customCookieID", "PHPSESSID");
			options.setProperty(HTTPConstants.CHUNKED, false);
			stub._getServiceClient().setOptions(options);

			UMessServiceStub.WsClientSetCharset wsClientSetCharset = new UMessServiceStub.WsClientSetCharset();
			wsClientSetCharset.setCharset("UTF-8");
			wsClientSetCharset.setXmlCharset("UTF-8");
			result = stub.wsClientSetCharset(wsClientSetCharset).get_return();
			if(false == result.equals("1")) {
				logger.error("**设置字符集失败：" + result);
			}
			
			/**
			 * 登陆
			 */
			UMessServiceStub.WsCsLogin login = new UMessServiceStub.WsCsLogin();
			login.setCsLogin(user);
			login.setCsPassword(password);
			result = stub.wsCsLogin(login).get_return();
			if(false == result.equals("1")) {
				logger.error("**登录失败：" + result);
			}
			
			/**
			 * 查询登陆状态
			 */
			result = stub.wsCsCheckLogin(new UMessServiceStub.WsCsCheckLogin()).get_return();
			if(false == result.equals("1")) {
				logger.error("**未登录，登录状态：" + result);
				return;
			}
			
			/**
			 * 创建消息
			 */
			UMessServiceStub.WsCreateMessage wsCreateMessage = new UMessServiceStub.WsCreateMessage();
			wsCreateMessage.setMessageContent(getContext());
			wsCreateMessage.setMessageContentFormat("plaintext");
			//wsCreateMessage.setMessageFromAddress(null);
			//wsCreateMessage.setMessageFromName(null);
			wsCreateMessage.setMessageTitle(getTitle());
			UMessServiceStub.WsCreateMessageResponse creatMessageResponse = stub.wsCreateMessage(wsCreateMessage);
			String messageId = creatMessageResponse.get_return();
			logger.debug("创建消息messageId:" + messageId);

			/**
			 * 添加收件人
			 */
			for(String recver : getReceivers()){
				UMessServiceStub.WsMessageAddReceiver wsMessageAddReceiver = new UMessServiceStub.WsMessageAddReceiver();
				wsMessageAddReceiver.setMessageId(messageId);
				wsMessageAddReceiver.setMessagePriority("1");
				wsMessageAddReceiver.setReceiver(recver);
				wsMessageAddReceiver.setReciverTypeCode("mobile");
				wsMessageAddReceiver.setSendTime(null);
				wsMessageAddReceiver.setSendTypeCode("sms");
				result = stub.wsMessageAddReceiver(wsMessageAddReceiver).get_return();
				logger.debug("添加接收人：" + result);
			}
			
			/**
			 * 发送
			 */
			UMessServiceStub.WsMessageSend wsMessageSend = new UMessServiceStub.WsMessageSend();
			wsMessageSend.setMessageId(messageId);
			result = stub.wsMessageSend(wsMessageSend).get_return();
			if(false == result.equals("1")) {
				logger.error("**发送失败：" + result);
			}

			/**
			 * 登出
			 */
			stub.wsCsLogout(new UMessServiceStub.WsCsLogout());

		} catch (Exception e) {
			logger.error(e);
		} 
		
	}
	
}
