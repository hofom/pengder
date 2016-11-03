package com.slark.pengder.net;

import com.slark.pengder.net.handler.CertMessageProcessHandler;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;

/**
 * Created by fengwei on 16/7/21.
 */
public class CertServerInitHandler extends ChannelInitializer<Channel> {
    /**
     * This method will be called once the {@link Channel} was registered. After the method returns this instance
     * will be removed from the {@link ChannelPipeline} of the {@link Channel}.
     *
     * @param ch the {@link Channel} which was registered.
     * @throws Exception is thrown if an error occurs. In that case the {@link Channel} will be closed.
     */
    @Override
    protected void initChannel(Channel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast(new CertMessageProcessHandler());
    }
}
