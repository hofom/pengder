package com.slark.util.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by fengwei on 16/7/5.
 * 这个类有问题
 */
@Component(value="slarkPropertyConfigure")
public class SlarkPropertyConfigure {
    @Autowired
    private  PropertiesFactoryBean propsFactory;
//
//    private PropertyPlaceholderConfigurer  propsHolder;
  //  @Autowired
  //  private Properties properties;
    /**
     *
     * @param key
     * @return
     *
     */
    public  String  getProperty(String key) throws IOException {
        return propsFactory.getObject().getProperty(key);
    }

}
