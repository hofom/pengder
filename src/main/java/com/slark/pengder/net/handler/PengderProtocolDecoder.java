package com.slark.pengder.net.handler;

import com.slark.pengder.net.Appliance;
import com.slark.pengder.net.PengderChannelGroup;
import com.slark.pengder.protocol.PengderMessage;
import com.slark.pengder.protocol.PengderPackage;
import com.slark.util.system.SlarkUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by fengwei on 16/7/8.
 */
public class PengderProtocolDecoder extends ByteToMessageDecoder {
    private static final Logger logger = Logger.getLogger(PengderProtocolDecoder.class);

    public PengderProtocolDecoder() {
        super();
    }

    /**
     * Decode the from one {@link ByteBuf} to an other. This method will be called till either the input
     * {@link ByteBuf} has nothing to read when return from this method or till nothing was read from the input
     * {@link ByteBuf}.
     *
     * @param ctx the {@link ChannelHandlerContext} which this {@link ByteToMessageDecoder} belongs to
     * @param in  the {@link ByteBuf} from which to read data
     * @param out the {@link List} to which decoded messages should be added
     * @throws Exception is thrown if an error accour
     */
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out)
            throws Exception {
        /**
         * 直接解析成PengderMessage对象
         * 不管怎么样。这儿是收到数据了
         * 因此要重置读空闲时间
         */
        logger.debug("接受到设备请求消息: 长度为 [ " + in.readableBytes() + " ],read@[" + in.readerIndex() + "],write@[" + in.writerIndex() + "],消息包 [ " + SlarkUtil.byteBuf2hex(in) + " ].");
        Appliance app = PengderChannelGroup.defaultTerminalGroup().getAppliance(ctx.channel());
        if (app == null) {
            /**
             * 如果为空的时候。要么是客户端主动关闭了连接。要么就是出现
             * 不可恢复的错误。在第二种情况下。直接关闭这个连接
             * 在第一种情况下。不用理会
             */
            if (in.readableBytes() == 0) {
                logger.warn(" 客户端主动关闭连接...client : " + ctx.channel().toString());
            } else {
                logger.warn("出现未知的错误，连接将被关闭");
                ctx.close();
            }
            return;
        } else {
            //logger.debug("接受到客户端： " + app + "请求，开始解析请求数据");
            app.resetReadIdleTime();

            List<PengderMessage> res = decodeBuffer(in);
            for (PengderMessage msg : res) {
                app.setVersion(msg.getVersion());
                msg.setAppliance(app);
                logger.debug("收到MessageId : " + msg.getMsgId() + "的消息包");
                out.add(msg);
            }
        }

        logger.debug("接受到设备请求消息: read@[" + in.readerIndex() + "],消息包 [ " + out.size() + " ]个");
    }


    protected List<PengderMessage> decodeBuffer(ByteBuf in) {
        return PengderPackage.decodePenderBuffer(in);
    }

}
