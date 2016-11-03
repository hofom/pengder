package com.slark.pengder.ws;

import com.slark.SlarkContext;

public abstract class BaseService {
	public void call(){
		//ServiceCall.call(this);
		//doService();
		SlarkContext.getApplicationContext().getBean(this.getClass()).doService();
		//this.doService();
		//BaseService x = (BaseService)this;
		//x.doService();
		System.out.println(this);System.out.println("xxxxxxxx");
		System.out.println(SlarkContext.getApplicationContext().getBean(this.getClass()));
	}
	
	public void doService(){
		return;
	}
}

class BaseServiceCall{
	void call(BaseService svc){
		svc.doService();
	}
}