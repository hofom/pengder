package com.slark.io;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by fengwei on 16/7/5.
 */
public abstract class NettyIOServer extends AbstractIOServer {

    /**
     * @Description 定义一个netty的serverBootstrap句柄
     */
    private static ServerBootstrap serverBootstrap = null;
    private static AtomicInteger refCount = new AtomicInteger(0);
    private ChannelFuture channelFuture;

    /**
     * @Description 定义了一个serverLoop的循环入口
     */
    public boolean serverLoop() {
        try {
            while(!Thread.currentThread().isInterrupted()) {
                if(channelFuture != null){
                    channelFuture.channel().closeFuture().sync();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Closes this stream and releases any system resources associated
     * with it. If the stream is already closed then invoking this
     * method has no effect.
     *
     * @throws IOException if an I/O error occurs
     */
    public void close() throws IOException {
        int val = refCount.decrementAndGet();

        if(val == 0){
            /**
             * 关闭这个
             */
            if(channelFuture!= null){
                channelFuture.channel().close();
            }
        }
    }

    /**
     * @Description 创建一个serverbootstrap
     * 该方法是一个同步方法
     */
    protected ServerBootstrap newServerBootstrap(int nWorks) {
        synchronized (NettyIOServer.class) {
            if (this.getServerBootstrap() == null) {
                NioEventLoopGroup bossGroup = new NioEventLoopGroup();
                NioEventLoopGroup workGroup = null;
                if (nWorks > 0) {
                    workGroup = new NioEventLoopGroup(nWorks);
                } else {
                    workGroup = new NioEventLoopGroup();
                }

                ServerBootstrap bootstrap = new ServerBootstrap();

                //bootstrap.channelFactory()
                bootstrap.group(bossGroup, workGroup)
                        .channel(NioServerSocketChannel.class)
                        .option(ChannelOption.SO_BACKLOG, 1024)
                        .option(ChannelOption.SO_REUSEADDR, true)
                        .childOption(ChannelOption.SO_KEEPALIVE,true);

                this.setServerBootstrap(bootstrap);
            }
        }
        /**
         * refCount +1;
         */
        refCount.incrementAndGet();
        return getServerBootstrap();
    }

    /**
     * 永远只会生成一个
     *
     * @return
     */
    public ServerBootstrap getServerBootstrap() {
        return NettyIOServer.serverBootstrap;
    }

    public void setServerBootstrap(ServerBootstrap serverBootstrap) {
        NettyIOServer.serverBootstrap = serverBootstrap;
    }

    public ChannelFuture getChannelFuture() {
        return channelFuture;
    }

    public void setChannelFuture(ChannelFuture channelFuture) {
        this.channelFuture = channelFuture;
    }
}
