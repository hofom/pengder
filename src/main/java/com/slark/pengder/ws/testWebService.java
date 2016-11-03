package com.slark.pengder.ws;

import java.util.List;
import java.util.Properties;

import org.apache.ibatis.javassist.tools.web.Webserver;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.slark.CommServer;
import com.slark.SlarkContext;
import com.slark.pengder.mybatis.dao.TcalendarMapper;
import com.slark.pengder.mybatis.model.Tcalendar;
import com.slark.pengder.net.PengderCommServerNettyIOServerImpl;
import com.slark.pengder.service.TestService;
import com.slark.pengder.service.receiver.AbsReceiverService;
import com.slark.pengder.tools.EUpdateType;
import com.slark.pengder.tools.QuerySyncDataOpr;

import javax.xml.ws.Endpoint;

public class testWebService {
    public static ApplicationContext ctx = SlarkContext.getApplicationContext();
    public final static Logger logger = Logger.getLogger(testWebService.class);
    
    public final static void main(String args[]){
/*    	WebServiceRun webServiceRun = ctx.getBean(WebServiceRun.class);
    	webServiceRun.start();
    	TestService testService = (TestService) ctx.getBean("testService");
    	//testService.call(null);
    	testService.doServive();
        logger.debug("x-------------------x");
        try {
			Thread.currentThread().sleep(10*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        webServiceRun.stop();*/
    	
    	
    	
/*    	BaseService svc = ctx.getBean(TestAop.class);
    	//svc.call();
    	svc.doService();
    	logger.debug(svc+"-------------------------------------");
    	ServiceCall.call(svc);
    	logger.debug("-------------------------------------");
    	svc.call();*/
    	
/*    	WebServer svc = ctx.getBean(WebServerImpl.class);
    	svc.getInstrumentStateList();*/
    	
    	TcalendarMapper mapper = ctx.getBean(TcalendarMapper.class);
    	List<Tcalendar> list = mapper.selectByExample(null);
    	logger.debug(list.get(0).getCalendar());
    	
    	QuerySyncDataOpr dataOpr = ctx.getBean(QuerySyncDataOpr.class);
    	//dataOpr.selectGlobalConfig(0, true);
    }
}
