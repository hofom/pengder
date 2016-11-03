package com.slark;

import com.slark.io.AbstractIOServer;
import com.slark.pengder.service.AbsSimpleService;
import com.slark.pengder.ws.WebServiceRun;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
/**
 * Created by fengwei on 16/7/7.
 */
public class CommServer {

    public static ApplicationContext ctx = SlarkContext.getApplicationContext();
    public final static Logger logger = Logger.getLogger(CommServer.class);

    public final static void main(String args[]){
        logger.info("start commServer...");
        AbstractIOServer svr =(AbstractIOServer) ctx.getBean("commServerIOServer");
        svr.start();

        logger.info("start webservice ....");
        WebServiceRun webServiceRun = ctx.getBean(WebServiceRun.class);
        webServiceRun.start();
        /**
         * 主线程进入
         * sleep
         */
        while(!Thread.currentThread().isInterrupted()){
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        webServiceRun.stop();
        
    	AbsSimpleService systemFailedNotice = (AbsSimpleService)ctx.getBean("systemFailedNotice");
        systemFailedNotice.doService(null);
    	
    }

}
