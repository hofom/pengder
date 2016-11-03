package com.slark;

import com.slark.io.AbstractIOServer;
import com.slark.pengder.ws.WebServiceRun;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;

/**
 * Created by fengwei on 16/7/21.
 */
public class CertServer {
    public static ApplicationContext ctx = SlarkContext.getApplicationContext();
    public final static Logger logger = Logger.getLogger(CertServer.class);


    public final static void main(String args[]){

        logger.info("start certServerIOServer...");
        AbstractIOServer svr =(AbstractIOServer) ctx.getBean("certServerIOServer");
        svr.start();
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
    }

}
