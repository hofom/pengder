package com.slark.pengder.net.handler;

import com.google.protobuf.InvalidProtocolBufferException;
import com.slark.pengder.protocol.MessageProtos;
import com.slark.pengder.protocol.PengderMessage;
import com.slark.pengder.protocol.PengderPackage;
import com.slark.util.system.SlarkUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.apache.log4j.Logger;

/**
 * Created by fengwei on 16/7/8.
 */
public class PengderProtocolEncoder extends MessageToByteEncoder<PengderMessage> {
    private static final Logger logger = Logger.getLogger(PengderProtocolEncoder.class);

    /**
     *
     */
    public PengderProtocolEncoder() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param outboundMessageType
     */
    public PengderProtocolEncoder(Class<? extends PengderMessage> outboundMessageType) {
        super(outboundMessageType);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param preferDirect
     */
    public PengderProtocolEncoder(boolean preferDirect) {
        super(preferDirect);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param outboundMessageType
     * @param preferDirect
     */
    public PengderProtocolEncoder(Class<? extends PengderMessage> outboundMessageType,
                                  boolean preferDirect) {
        super(outboundMessageType, preferDirect);
        // TODO Auto-generated constructor stub
    }
    /**
     * Encode a message into a {@link ByteBuf}. This method will be called for each written message that can be handled
     * by this encoder.
     *
     * @param ctx the {@link ChannelHandlerContext} which this {@link MessageToByteEncoder} belongs to
     * @param msg the message to encode
     * @param out the {@link ByteBuf} into which the encoded message will be written
     * @throws Exception is thrown if an error accour
     */
    @Override
    protected void encode(ChannelHandlerContext ctx, PengderMessage msg, ByteBuf out) throws Exception {
        byte[] buffer =  PengderPackage.encodeMessage(msg);
        logger.debug("返回消息：长度 [" + buffer.length + " ]，数据包 [ " + SlarkUtil.byte2hex(buffer) + " ]");
        out.writeBytes(buffer);
        msg.updateSendTime();
    }
}
