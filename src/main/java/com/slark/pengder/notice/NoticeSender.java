package com.slark.pengder.notice;

import java.util.List;

/**
 * 
 * @author HeHao
 *
 */
public abstract class NoticeSender extends Thread {
	private List<String> receivers ;
	private String title;
	private String context;
	
	/**
	 * 
	 * @param receivers
	 * @param title
	 * @param context
	 * @return
	 */
	public NoticeSender set(List<String> receivers , String title,String context) {
		this.receivers = receivers;
		this.title = title;
		this.context = context;
		return this;
	}

	public List<String> getReceivers() {
		return receivers;
	}

	public void setReceivers(List<String> receivers) {
		this.receivers = receivers;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
	
	
}
