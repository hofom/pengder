package com.slark.pengder.net;

import com.slark.SlarkContext;
import com.slark.pengder.net.handler.*;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.ssl.SslHandler;
import io.netty.handler.timeout.IdleStateHandler;
import org.apache.log4j.Logger;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import java.util.concurrent.TimeUnit;

/**
 * Created by fengwei on 16/7/6.
 */
public class CommServerHandlerInitializer extends ChannelInitializer<Channel> {
    public final static Logger logger = Logger.getLogger(CommServerHandlerInitializer.class);
    private final SSLContext sslContext;
    /**
     * @param sslCtx
     * @Description 构造函数
     */
    public CommServerHandlerInitializer(SSLContext sslCtx) {
        sslContext = sslCtx;
    }

    /**
     * This method will be called once the {@link Channel} was registered. After the method returns this instance
     * will be removed from the {@link ChannelPipeline} of the {@link Channel}.
     * <p/>
     * 在该方法中。要保存所有的连接通道。此接口采用SSL套接字接口
     *
     * @param ch the {@link Channel} which was registered.
     * @throws Exception is thrown if an error occurs. In that case the {@link Channel} will be closed.
     */
    /*
    	SSLContext sslContext = SSLContext.getInstance("SSLv3");
		sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);

		SSLServerSocketFactory factory = sslContext.getServerSocketFactory();
		SSLServerSocket serverSocket = (SSLServerSocket) factory
				.createServerSocket(thePort);

		serverSocket.setUseClientMode(false);
		serverSocket.setNeedClientAuth(true);

     */
    @Override
    protected void initChannel(Channel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        SSLEngine sslEngine = sslContext.createSSLEngine();
        sslEngine.setUseClientMode(false);
        //sslEngine.setNeedClientAuth(true);
        /**
         * 加入一系列的
         * 处理句柄
         */
        pipeline.addLast(new SslHandler(sslEngine));
        pipeline.addLast(new CertParseHandler());
        pipeline.addLast("Decoder", new PengderProtocolDecoder());
        pipeline.addLast("Encoder", new PengderProtocolEncoder());
        /**
         * 加入心跳处理策略
         * 从配置文件中获取这个时间。单位秒
         */
        int hearbeat = Integer.parseInt(SlarkContext.getProperty("pengder.commServer.heartbeat.interval", "2"));
        pipeline.addLast(new IdleStateHandler(hearbeat, 0, 0, TimeUnit.SECONDS));
        pipeline.addLast(new HearbeatMessageHandler(hearbeat));
        pipeline.addLast(new ProtoBufferMessageHandler());
    }
}
