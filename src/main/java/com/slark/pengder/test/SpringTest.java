package com.slark.pengder.test;

import com.slark.SlarkContext;
import com.slark.pengder.mybatis.dao.TinstrumentMapper;
import com.slark.pengder.mybatis.model.Tinstrument;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by fengwei on 16/7/4.
 */
@Component(value = "springTest")
public class SpringTest {
    public final static Logger logger = Logger.getLogger(SpringTest.class);

    @Autowired
    private TinstrumentMapper tinstrumentMapper;
    /**
     * @Description 注解的方式获得property文件中的值
     * propsReader[KeyServer]
     */
    @Value("${KeyServer:abc}")
    private String keyServer;

    public void test1() {

        String port = SlarkContext.getProperty("CommServerListenPort");
        logger.debug(port);


        List<Tinstrument> result = tinstrumentMapper.selectByExample(null);
        if (result != null) {
            for (Tinstrument t : result) {
                logger.info(t.toString());
            }
        }

        //HashMap<String,Object>  res =  tinstrumentMapper.selectTinstrumentsForMap();


    }
}
