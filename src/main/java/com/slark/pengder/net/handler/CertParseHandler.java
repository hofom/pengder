package com.slark.pengder.net.handler;

import com.slark.pengder.net.PengderChannelGroup;
import io.netty.channel.*;
import io.netty.handler.ssl.SslHandler;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import org.apache.log4j.Logger;

//import java.net.InetAddress;
//import java.security.cert.Certificate;
//import java.security.cert.X509Extension;

/**
 * Created by fengwei on 16/7/6.
 */
public class CertParseHandler extends ChannelHandlerAdapter {
    private  static final Logger  logger = Logger.getLogger(CertParseHandler.class);
    /**
     * Calls {@link ChannelHandlerContext#fireChannelActive()} to forward
     * to the next {@link ChannelHandler} in the {@link ChannelPipeline}.
     * <p/>
     * Sub-classes may override this method to change behavior.
     *
     * @param ctx
     */
    @Override
    public void channelActive(final ChannelHandlerContext ctx) throws Exception {
        ctx.pipeline().get(SslHandler.class).handshakeFuture().addListener(
                new GenericFutureListener<Future<Channel>>() {
                    /**
                     * @Description 握手完毕之后要干点事情
                     * @param future
                     * @throws Exception
                     */
                    public void operationComplete(Future<Channel> future) throws Exception {
                        logger.info("SSL套接字握手完毕。将继续后续的通讯准备");
                        PengderChannelGroup.defaultTerminalGroup().add(ctx.channel());
                    }
                });
    }


    /**
     * Calls {@link ChannelHandlerContext#fireExceptionCaught(Throwable)} to forward
     * to the next {@link ChannelHandler} in the {@link ChannelPipeline}.
     * <p/>
     * Sub-classes may override this method to change behavior.
     *
     * @param ctx
     * @param cause
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        logger.error("建立SSL连接失败。。。");
        cause.printStackTrace();
        ctx.close();
    }
}
