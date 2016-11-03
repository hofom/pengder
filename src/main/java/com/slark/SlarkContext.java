package com.slark;

import com.slark.util.system.ResourcePath;
import com.slark.util.system.SlarkPropertyConfigure;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.IOException;
import java.util.TimeZone;

/**
 * Created by fengwei on 16/7/5.
 */
public class SlarkContext {

    private static ApplicationContext applicationContext;
    private static SlarkPropertyConfigure propertyConfigure;
    public final static Logger logger = Logger.getLogger(SlarkContext.class);

    static {
        String resourcePath = ResourcePath.getSlarkConfigureFile("config/props/log4j.properties");

        if (resourcePath != null) {
            try {
                PropertyConfigurator.configure(resourcePath);
            } catch (Exception e) {
                System.out.println("加载日志配置文件失败: " + resourcePath + ",错误信息: " + e.getMessage());
            }
        }
        /**
         * 修改时区
         */
        System.setProperty("user.timezone", "Asia/Shanghai");
        TimeZone tz = TimeZone.getTimeZone("Asia/Shanghai");
        TimeZone.setDefault(tz);

        try {
            applicationContext = new FileSystemXmlApplicationContext(ResourcePath.slark_context_file);
            propertyConfigure = (SlarkPropertyConfigure) applicationContext.getBean("slarkPropertyConfigure");
        } catch (Exception e) {
            logger.error("加载" + ResourcePath.slark_context_file + "失败,msg : " + e.getMessage());
            e.printStackTrace();
            System.exit(-1);
        }
    }

    /**
     * @return 返回ApplicationContext句柄
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * @param applicationContext
     * @Description 外部设置这个applicationContext
     */
    public static void setApplicationContext(ApplicationContext applicationContext) {
        SlarkContext.applicationContext = applicationContext;
    }

    /**
     * @param beanName
     * @return bean object
     * @Description 根据bean名称得到指定
     * 对象
     */
    public static Object getBean(String beanName) {
        return applicationContext.getBean(beanName);
    }

    /**
     * @description 得到一个指定类型的bean
     * @param beanName
     * @param <T>
     * @return
     */
    public static <T> T obtainBean(String beanName) {return (T)applicationContext.getBean(beanName);}
    /**
     * @param key
     * @return
     */
    public static String getProperty(String key) {
        String val = null;
        SlarkPropertyConfigure slarkProps = null;

        try {
            val = propertyConfigure.getProperty(key);
        } catch (IOException e) {
            logger.debug("slark : get Property value failed.. key ->[" + key + "]");
        }

        return val;
    }

    /**
     * @param key
     * @param defaultValue
     * @return
     * @Description 得到指定的属性值，如果失败。则用
     * 默认值代替
     */
    public static String getProperty(String key, String defaultValue) {
        String val = null;

        try {
            val = propertyConfigure.getProperty(key);
            if(val == null){
             val = defaultValue;
            }
        } catch (Exception e) {
            logger.warn("获取属性 【 " + key + " 】失败,将使用默认值" + defaultValue);
            val = defaultValue;
        }

        return val;
    }
}
