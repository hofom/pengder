package com.slark.pengder.notice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

/**
 * 
 * @author HeHao
 *
 */
public class Notice {
	
	private List<String> receivers = null;
	private NoticeContext context = null;
	
	@Value("${pengder.notice.email.send:true}")
	private static boolean isSendEmail;
	@Value("${pengder.notice.sms.send:true}")
	private static boolean isSendSms;
	
	/**
	 * 
	 * @param receivers
	 * @param title
	 * @param context
	 * @return
	 */
	public static int send(List<String> receivers , NoticeContext context){
		int ret = 0;
		List<String> email = new ArrayList<String>();
		List<String> sms = new ArrayList<String>();
		if(receivers == null){
			return 0;
		}
		for(String s : receivers){
			if(s.indexOf('@')!=-1){
				email.add(s);
			}else{
				sms.add(s);
			}
		}
		if(sms.size()!=0 ){
			ret = sendSMS(sms,context);
		}
		
		if(email.size() != 0 && ret == 0){
			ret = sendEmail(email, context);
		}
		return ret;
	}
	
	/**
	 * 
	 * @param receivers
	 * @param title
	 * @param context
	 * @return
	 */
	public static int sendEmail(List<String> receivers , NoticeContext context){
		if(receivers.size()==0 || isSendEmail)
			return 0;
		NoticeSender sender = EmailSender.createSender();
		sender.set(receivers, context.getTitle(), context.getContext());
		sender.start();
		return 0;
	}
	
	/**
	 * 
	 * @param receivers
	 * @param context
	 * @return
	 */
	public static int sendSMS(List<String> receivers , NoticeContext context){
		if(receivers.size()==0 || isSendSms)
			return 0;
		NoticeSender sender = SmsSender.createSender();
		sender.set(receivers, context.getTitle(), context.getContext());
		sender.start();
		return 0;
	}
	
	/**
	 * 
	 * @return
	 */
	public int send(){
		return send(this.receivers,this.context);
	}

	/**
	 * 
	 * @param recver
	 * @return
	 */
	public Notice addReceiver(String recver){
		if(receivers == null)
			receivers = new ArrayList<String>();
		receivers.add(recver);
		return this;
	}
	
	public List<String> getReceivers() {
		if(receivers == null)
			receivers = new ArrayList<String>();
		return receivers;
	}

	public void setReceivers(List<String> receivers) {
		this.receivers = receivers;
	}


	public NoticeContext getContext() {
		return context;
	}

	public void setContext(NoticeContext context) {
		this.context = context;
	}
	
}
