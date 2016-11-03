package com.slark.pengder.task;

import com.slark.SlarkContext;
import com.slark.util.system.SlarkPropertyConfigure;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.xml.ws.soap.Addressing;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by fengwei on 16/7/4.
 */
@Component(value = "scheduledTask")
public class CommServerScheduledTasks {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private static final Logger  logger = Logger.getLogger(CommServerScheduledTasks.class);

    @Value("${WebServiceURL:http://211.86.157.104:8081/wsServerExample}")
    private String WebServiceURL;

   // @Scheduled(fixedDelay = 100)
    public void reportCurrentTime(){
       // String result = SlarkContext.getProperty("JDBCDriver","default.driver");
       // logger.info("The time is now " + dateFormat.format(new Date())  + "  WebServiceURL  : " + result );
    }

}
