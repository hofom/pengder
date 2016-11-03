package com.slark.pengder.net;

import com.slark.SlarkContext;
import com.slark.io.NettyIOServer;
import com.slark.pengder.net.ssl.SslContextFactory;
import io.netty.channel.ChannelOption;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by fengwei on 16/7/5.
 * @Description  该类为Spring的一个组件
 */
@Component(value = "commServerIOServer")
public class PengderCommServerNettyIOServerImpl extends NettyIOServer {

    private final  static String  commServerIOThreadName = "commServerIO";
    private final  static Logger logger = Logger.getLogger("commServerIOServer");
    /**
     * 端口号
     */
    @Value("${pengder.commServer.port:6667}")
    private int port = 6667;
    /**
     * ip地址
     */
    @Value("${pengder.commServer.ip:0.0.0.0}")
    private String ip = "0.0.0.0";
    /**
     * 默认的work线程个数为cpu核心数
     * 外部可以配置
     */
    @Value("${pengder.commServer.works:0}")
    private int  nWorks = 0;
    /**
     * 可以配置ssl初始化的密码
     */
    @Value("${pengder.commServer.sslpwd:123456}")
    private String sslPassword;
    /**
     * 配置是否输出debug日志
     */
    @Value("${pengder.commServer.debug:false}")
    private boolean isDebug = false;

    /**
     * 初始化函数，初始化成功。则返回真
     * @return
     */
    public boolean start() {
        /**
         * 获取所有的启动参数
         */
        super.newServerBootstrap(nWorks)
                .childHandler(new CommServerHandlerInitializer(SslContextFactory.getServerContext(sslPassword)))
                .handler(new LoggingHandler(isDebug == true ? LogLevel.DEBUG : LogLevel.INFO));

        try {
            super.setChannelFuture(super.getServerBootstrap().bind(ip,port).sync());//.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            logger.error("绑定网络端口失败:" + e.getMessage());
            e.printStackTrace();
            return false;
        }


        new Thread(this,commServerIOThreadName).start();
        return true;
    }

}
