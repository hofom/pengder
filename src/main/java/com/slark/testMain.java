package com.slark;

import java.sql.Connection;

import com.slark.pengder.comm.UtilCheck;
import com.slark.pengder.mybatis.dao.TaccountMapper;
import com.slark.pengder.mybatis.model.Taccount;
import com.slark.pengder.net.Appliance;
import com.slark.pengder.net.PengderCommServerNettyIOServerImpl;
import com.slark.pengder.protocol.MessageProtos;
import com.slark.pengder.protocol.MessageProtos.MessageType;
import com.slark.pengder.protocol.MessageProtos.UserRight;
import com.slark.pengder.protocol.MessageProtos.UserRightList;
import com.slark.pengder.protocol.PengderMessage;
import com.slark.pengder.service.ISimpleService;
import com.slark.proxy.SlarkProxy;
import com.slark.util.system.ResourcePath;
import com.slark.util.system.SlarkPropertyConfigure;

import io.netty.util.concurrent.ExecutorServiceFactory;
import io.netty.util.internal.PlatformDependent;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.BeansException;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.slark.pengder.test.SpringTest;
import com.slark.pengder.tools.UpdateDataTick;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.slark.pengder.test.PengderTestUnit;
/**
 * Created by fengwei on 16/7/4.
 * @Configuration(value="application-context.xml")
 * #ImportResource("classpath:application-context.xml")
 */

@EnableScheduling
public class testMain {
    /**
     * 得到指定的ApplicationContext对象
     */
    public static ApplicationContext ctx = SlarkContext.getApplicationContext();
    public final static Logger logger = Logger.getLogger(testMain.class);


    public final static void main(String args[]) {

        PengderTestUnit testUnit = (PengderTestUnit) ctx.getBean("pengderTestUnit");

        testUnit.testEntry();
    }

}
