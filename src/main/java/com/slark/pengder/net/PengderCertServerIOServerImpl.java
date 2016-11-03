package com.slark.pengder.net;

import com.slark.io.NettyIOServer;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by fengwei on 16/7/21.
 */
@Component(value = "certServerIOServer")
public class PengderCertServerIOServerImpl extends NettyIOServer {
    private final  static String  certServerIOThreadName = "certServer";
    private final  static Logger logger = Logger.getLogger("certServer");
    /**
     * 端口号
     */
    @Value("${pengder.certServer.port:1234}")
    private int port = 1234;
    /**
     * ip地址
     */
    @Value("${pengder.certServer.ip:0.0.0.0}")
    private String ip = "0.0.0.0";

    @Value("${pengder.certServer.debug:false}")
    private boolean isDebug = false;
    /**
     * @return
     * @Description 增加一个初始化接口
     */
    public boolean start() {
        super.newServerBootstrap(1).childHandler(new CertServerInitHandler())
                .handler(new LoggingHandler(isDebug == true ? LogLevel.DEBUG : LogLevel.INFO));

        try {
            super.setChannelFuture(super.getServerBootstrap().bind(ip,port).sync());//.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            logger.error("绑定网络端口失败:" + e.getMessage());
            e.printStackTrace();
            return false;
        }

        new Thread(this,certServerIOThreadName).start();

        return true;
    }
}
