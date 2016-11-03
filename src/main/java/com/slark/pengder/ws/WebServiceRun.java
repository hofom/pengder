package com.slark.pengder.ws;

import javax.xml.ws.Endpoint;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * @author HeHao
 *
 */
@Component(value = "webServiceRun")
public class WebServiceRun {
    private static final Logger  logger = Logger.getLogger(WebServiceRun.class);

	private Endpoint endpoint = null;
    
    @Value("${pengder.commServer.ws.url:http://127.0.0.1:8081/wsServerExample}")
    private String WebServiceURL;

    @Autowired
    private WebServer webServer;
    /**
     * webservice 启动函数
     * @return
     */
	public boolean start() {
		try {
			endpoint = Endpoint.publish(WebServiceURL,webServer);
			logger.info("WebService启动，发布的地址为:" + WebServiceURL);
			return true;
		} catch(Exception e){
			//e.printStackTrace();
			logger.error(e);
			logger.error("WebService启动-出错");
			return false;
		}
		
	}
	
	public boolean isPublished(){
		if(endpoint == null)
			return false;
		return this.endpoint.isPublished();
	}

	/**
	 * webservice 销毁，退出函数
	 */
	public void stop() {
		if(null != this.endpoint){
			this.endpoint.stop();
			this.endpoint = null;
		}		
		logger.info("WebService退出");
	}
	
}
