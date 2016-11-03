package com.slark.pengder.protocol;

import com.slark.SlarkContext;
import io.netty.buffer.ByteBuf;
import org.apache.log4j.Logger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Adler32;

/**
 * Created by fengwei on 16/7/8.
 */
public class PengderPackage {
    private final static Logger logger = Logger.getLogger(PengderPackage.class);
    public static final int minPackageSize = 16;
    // 系统正常运行可以改大为1KB
    public static int maxDataByteSize = Integer.parseInt(SlarkContext.getProperty("pengder.package.maxSize", "256"));
    public static final byte dataHead1_2 = 0x7e;
    public static final byte dataHead2_2 = 0x3a;
    public static final byte dataHead3_2 = 0x7e;
    public static final byte dataHead4_2 = 0x3a;
    //7E3A7E33
    public static final byte dataHead1_3 = 0x7e;
    public static final byte dataHead2_3 = 0x3A;
    public static final byte dataHead3_3 = 0x7e;
    public static final byte dataHead4_3 = 0x33;

    public static final int msgOffset = 8;
    /*完整消息的情况下应该减去的长度*/
    public static final int msgIncreNum = 12;

    /**
     * @param needSize
     * @return
     * @description 一种自适应的最大包的大小的算法
     */
    public static int adaptionMaxPackageSize(int needSize) {
        maxDataByteSize = maxDataByteSize + Math.abs(needSize - maxDataByteSize) * 2;
        return maxDataByteSize;
    }

    /**
     * @param buf
     * @return
     * @Description 检查包头格式是否符合要求
     */
    public final static int checkPackageHead(byte[] buf, int headerIdx) {
        if (buf[headerIdx + 0] == dataHead1_2
                && buf[headerIdx + 1] == dataHead2_2
                && buf[headerIdx + 2] == dataHead3_2
                && buf[headerIdx + 3] == dataHead4_2) {
            return 2;
        } else if (buf[headerIdx + 0] == dataHead1_3
                && buf[headerIdx + 1] == dataHead2_3
                && buf[headerIdx + 2] == dataHead3_3
                && buf[headerIdx + 3] == dataHead4_3) {
            return 3;
        }
        return -1;
    }

    // bytes转int（低字节在前，内部保证数组不越界）
    public final static int bytesToInt(byte[] buffer, int offset) {
        if (buffer.length >= offset + 4) {
            int num = 0;
            num += buffer[offset + 3] & 0xff;
            num = num << 8;
            num += buffer[offset + 2] & 0xff;
            num = num << 8;
            num += buffer[offset + 1] & 0xff;
            num = num << 8;
            num += buffer[offset + 0] & 0xff;
            return num;
        } else {
            return 0;
        }
    }

    // int转bytes（低字节在前，内部保证数组不越界）
    public final static void intToBytes(int num, byte[] buffer, int offset) {
        if (buffer.length >= offset + 4) {
            buffer[offset + 0] = (byte) (num & 0xff);
            num = num >>> 8;
            buffer[offset + 1] = (byte) (num & 0xff);
            num = num >>> 8;
            buffer[offset + 2] = (byte) (num & 0xff);
            num = num >>> 8;
            buffer[offset + 3] = (byte) (num & 0xff);
        }
    }

    public final static int checkDataLength(final byte[] buffer, int indexIdx) { // 获取帧的总长度
        return bytesToInt(buffer, indexIdx) - 4;
    }

    /**
     * @param buffer
     * @param offset
     * @param num
     * @return
     * @Decription 得到crc32马
     */
    public final static int reckonCrc32(byte[] buffer, int offset, int num) {
        Adler32 check32 = new Adler32();
        check32.update(buffer, offset, num);
        return (int) (check32.getValue() & 0xffffffff);
    }

    /**
     * @param buffer
     * @param offset
     * @return
     * @Description 得到crc32码
     */
    public final static int getCrc32(byte[] buffer, int offset) {
        return bytesToInt(buffer, offset);
    }

    /**
     * @param buf
     * @Description 检查包是否合法
     */
    public static void checkByteBuf(ByteBuf buf) {

    }

    /**
     * @param buf
     * @return 如果合法返回msgContent的实际大小。如果不合法。返回-1;
     * @Description 用于检查数据包的完整性
     */
    public static int checkByteBuf(byte[] buf, int headerIndex) {
        /**
         * 首先判断包的大小是否合法
         */
        if (buf.length - headerIndex < minPackageSize) {
            logger.error("接受到数据包小于最小数据包的大小。数据包格式非法");
            return -1;
        }
        /**
         * 判断头格式是否合法
         */
        if (checkPackageHead(buf, headerIndex) < 0) {
            logger.error("数据包包头格式不符合要求。数据包格式非法");
            return -1;
        }
        /**
         * 得到数据包的长度
         */
        int msgLen = checkDataLength(buf, headerIndex);

        if (msgLen < minPackageSize) {
            logger.error("消息格式异常，消息的长度小于协议定义的最小长度");
            return -1;
        }
        /**
         * 没有数据发送过来
         * 这时候只有一个msgId
         */

        if (msgLen == minPackageSize) {
            logger.info("当前消息只有消息id，没有消息实体");
        }
        /**
         * 计算crc32嘛
         */
        int crc32 = reckonCrc32(buf, headerIndex + 8, msgLen - 12);
        int crcNum = getCrc32(buf, headerIndex + (msgLen - 4));
        /**
         *判断crc32嘛是否正常
         */
        if (crc32 != crcNum) {
            logger.error("消息验证失败，crc检验失败,data crc32 : " + crc32 + ",recv crc32 : " + crcNum);
            return -1;
        }
        /**
         * 返回实际的数据长度
         */
        ByteBuffer.wrap(buf, headerIndex + 8, msgLen - msgIncreNum);

        return msgLen - msgIncreNum;
    }

    /**
     * @param msg
     * @return
     * @decription 打包数据
     */
    public static byte[] encodeMessage(PengderMessage msg) {
        byte[] msgByte = msg.getMsg().toByteArray();
        int dataLen = msgByte.length + PengderPackage.minPackageSize;
        byte[] buffer = new byte[dataLen];
        /**
         * 开始组装消息
         */
        logger.debug("设备协议版本号为：" + msg.getAppliance().getVersion());
        logger.debug("当前待发送消息的协议版本号：" + msg.getVersion());
        if (msg.getAppliance().getVersion() == 2) {
            buffer[0] = PengderPackage.dataHead1_2; // 帧头1
            buffer[1] = PengderPackage.dataHead2_2; // 帧头2
            buffer[2] = PengderPackage.dataHead3_2; // 帧头3
            buffer[3] = PengderPackage.dataHead4_2; // 帧头4
        } else if (msg.getAppliance().getVersion() == 3) {
            buffer[0] = PengderPackage.dataHead1_3; // 帧头1
            buffer[1] = PengderPackage.dataHead2_3; // 帧头2
            buffer[2] = PengderPackage.dataHead3_3; // 帧头3
            buffer[3] = PengderPackage.dataHead4_3; // 帧头4
        } else {
            logger.error("无法支持的协议包版本，目前只支持2代机的协议版本与3代机的协议版本");
            return null;
        }
        /**
         * 写入数据长度，数据长度是MsgId加上protobuf的数据长度
         */
        PengderPackage.intToBytes(dataLen - 4 * 2, buffer, 4);
        /**
         * 开始写入MsgId
         */
        PengderPackage.intToBytes(msg.getMsgId(), buffer, 8);
        /**
         * 将数据拷贝到buffer中
         */
        System.arraycopy(msgByte, 0, buffer, 3 * 4, msgByte.length);
        /**
         * 计算crc32值，并将crc32值写入消息末尾的4字节
         */
        int crc32 = PengderPackage.reckonCrc32(buffer, 8, msgByte.length + 4);
        PengderPackage.intToBytes(crc32, buffer, dataLen - 4);
        return buffer;
    }

    /**
     * @param in
     * @return
     * @descritpion
     */
    public static List<PengderMessage> decodePenderBuffer(ByteBuf in) {
        int  version = -1,buflen = in.readableBytes(),dataLen = 0,crcNum = 0,msgId  = 0, crc32 = 0;
        List<PengderMessage> res = new ArrayList<PengderMessage>();

        if (in.readableBytes() < PengderPackage.minPackageSize) {
            return res;
        }

        byte []  buf4 = new byte[4];

        while(in.readableBytes()>0) {
            /*先找到头*/
            in.markReaderIndex();

            in.readBytes(buf4);
            version = PengderPackage.checkPackageHead(buf4, 0);

            if(version <= 0){
                logger.warn("校验包头失败，当前包可能不完整");
                in.resetReaderIndex();
                break;
            }


            in.readBytes(buf4);
            dataLen = PengderPackage.checkDataLength(buf4, 0);
            if(dataLen < 0){
                logger.warn("消息包长度异常，长度为:" + dataLen + ",当前包可能不完整");
                in.resetReaderIndex();
                break;
            }

            byte [] msgBuffer = new byte[dataLen];

            try {
                in.readBytes(msgBuffer);
            }catch (IndexOutOfBoundsException e){
                logger.warn(" 读取protobuf消息包异常，当前包可能不完整");
                in.resetReaderIndex();
                break;
            }

            crcNum = PengderPackage.reckonCrc32(msgBuffer, 0, msgBuffer.length);
            /**
             * 索引0开始4字节是msgId
             */
            msgId = PengderPackage.bytesToInt(msgBuffer, 0);

            try {
                in.readBytes(buf4);
            }catch (IndexOutOfBoundsException e){
                logger.warn(" 读取crc码异常，当前包可能不完整");
                in.resetReaderIndex();
                break;
            }

            crc32 = PengderPackage.getCrc32(buf4, 0);

            if (crc32 != crcNum) {
                logger.warn("收到CRC32校验失败的消息报，消息ID是： " + msgId);
                continue;
            }

            PengderMessage msg = PengderMessage.buildMessage(msgId, msgBuffer, 4, dataLen-4);
            if (msg != null) {
            /*读索引要后移。否则不后移*/
            } else {
                logger.debug("组装Protobuf对象失败，protobuf字节码流非法");
                continue;
            }

            msg.setVersion(version);
            res.add(msg);
        }

        return res;
    }

    /**
     * @param in
     * @return
     * @decription 解析buffer获得message对象
     */
    public static List<PengderMessage> decodeBuffer(ByteBuf in) {
        int msgId, crc32, crcNum, dataLen, buflen = in.readableBytes(), version = -1;
        List<PengderMessage> res = new ArrayList<PengderMessage>();

        byte[] pkgBuffer = new byte[buflen];

        /**
         * 首先判断包的大小是否合法
         */
        if (buflen < PengderPackage.minPackageSize) {
            logger.warn("消息包的长度小于协议要求的最小长度。消息格式非法");
            return null;
        }
        /**/
        in.readBytes(pkgBuffer);
        /**
         * 要防止数组越界
         * 如果找不到。则一直找
         */
        int idx = 0;

        while (idx + 4 <= buflen) {
            version = PengderPackage.checkPackageHead(pkgBuffer, idx);

            if (version < 0) {
                idx++;
                continue;
            }
            /**
             * 向后偏移4字节
             */
            idx += 4;
            /**
             * 获得数据的长度,这个长度是protobuf数据的长度
             */
            dataLen = PengderPackage.checkDataLength(pkgBuffer, idx);
        /*判断数据长度是否为0.如果为零，直接返回null*/
            idx += 4;

            if (dataLen <= 0) {
                logger.debug("dataLen = " + dataLen + "idx = " + idx);
                continue;
            }

            /**
             * 开始解析MsgID
             */
            crcNum = PengderPackage.reckonCrc32(pkgBuffer, idx, dataLen);

            /**
             * 索引0开始4字节是msgId
             */
            msgId = PengderPackage.bytesToInt(pkgBuffer, idx);

            /*记录真正的消息开始位置*/
            int msgPos = idx + 4;
            int msgLen = dataLen - 4;

            idx += dataLen;
            crc32 = PengderPackage.getCrc32(pkgBuffer, idx);

            if (crc32 != crcNum) {
                logger.warn("收到CRC32校验失败的消息报，消息ID是： " + msgId);
                continue;
            }

            PengderMessage msg = PengderMessage.buildMessage(msgId, pkgBuffer, msgPos, msgLen);
            if (msg != null) {
            /*读索引要后移。否则不后移*/
            } else {
                logger.debug("msg == null ");
                continue;
            }

            msg.setVersion(version);
            res.add(msg);
        }
        return res;
    }


}
