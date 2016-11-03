package com.slark.pengder.net.handler;

import com.slark.SlarkContext;
import com.slark.pengder.net.Appliance;
import com.slark.pengder.net.PengderChannelGroup;
import com.slark.pengder.service.AbsSimpleService;
import com.slark.pengder.service.ISimpleService;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.timeout.IdleStateEvent;
import org.apache.log4j.Logger;

/**
 * Created by fengwei on 16/7/7.
 */
public class HearbeatMessageHandler extends ChannelHandlerAdapter {
    private static final Logger logger = Logger.getLogger(HearbeatMessageHandler.class);
    /**
     * 设置心跳间隔
     */
    private  int  heartBeatInterval = 3;

    public HearbeatMessageHandler(int readInterval){
        heartBeatInterval = readInterval;
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
        logger.error(cause.getMessage(),cause);//cause.printStackTrace();
        ctx.close();
    }

    protected  AbsSimpleService getService(String svcName){
        return (AbsSimpleService)SlarkContext.getBean(svcName);
    }
    /**
     * Calls {@link ChannelHandlerContext#fireUserEventTriggered(Object)} to forward
     * to the next {@link ChannelHandler} in the {@link ChannelPipeline}.
     * <p/>
     * Sub-classes may override this method to change behavior.
     *
     * @param ctx
     * @param evt
     */
    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            /**
             * 如果是心跳事件,说明超过5秒钟没有数据读了,默认是5秒
             */
            Appliance app = PengderChannelGroup.defaultTerminalGroup().getAppliance(ctx.channel());
            if(app != null) {
                app.addReadIdleTime(this.heartBeatInterval);
                /*
                logger.debug("当前设备，address : "
                        + ctx.channel().remoteAddress()
                        + "有" + readIdleTime
                        + "秒没有数据读入");
                        */
                /**
                 * 生成超时服务处理对象
                 */
                AbsSimpleService svc = getService("timeoutService");
                /**
                 * 直接调用即可
                 */
                svc.doService(app);
            }else {
                logger.error("找不到对应设备通道");
            }
        } else {
            super.userEventTriggered(ctx, evt);
        }
    }

}
