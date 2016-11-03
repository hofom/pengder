package com.slark.pengder.notice;

import org.apache.commons.mail.SimpleEmail;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

/**
 * 
 * @author HeHao
 *
 */
public class EmailSender extends NoticeSender {

    private static final Logger logger = Logger.getLogger(EmailSender.class);

    @Value("${pengder.notice.email.host}")
    private static String host;         //邮箱发送服务器 smtp
    @Value("${pengder.notice.email.user}")
    private static String user;         //用户名
    @Value("${pengder.notice.email.passwd}")
    private static String password;     //密码
    @Value("${pengder.notice.email.name:COMM-OSLA}")
    private static String name;         //发送人姓名
    @Value("${pengder.notice.email.underwrite:--from CommServer}")
    private static String underwrite;   //签名
    
	
	static public NoticeSender createSender() {
		// TODO Auto-generated method stub
		return new EmailSender();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		logger.debug("EmailTo:" + getReceivers() + "  title: " + getTitle() + "  context: " + getContext());

		if(getReceivers().size() == 0){
			return;
		}

		/**
		 * 使用SimpleEmail发送邮件
		 */
		try {
			SimpleEmail email = new SimpleEmail();
			email.setHostName(this.host);
			email.setAuthentication(this.user, this.password);
			for(String recver : getReceivers()){
				email.addTo(recver);
			}
			email.setFrom(user, name);
			email.setCharset("UTF-8");
			email.setSubject(getTitle());
			email.setMsg(getContext() + "\n" + this.underwrite); // 邮件内容
			email.send(); // 发送

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
