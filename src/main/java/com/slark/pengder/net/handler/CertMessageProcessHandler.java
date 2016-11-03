package com.slark.pengder.net.handler;

import com.slark.SlarkContext;
import com.slark.pengder.protocol.PengderPackage;
import com.slark.util.system.ResourcePath;
import com.slark.util.system.SlarkUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;

/**
 * Created by fengwei on 16/7/21.
 */
public class CertMessageProcessHandler extends SimpleChannelInboundHandler<ByteBuf> {
    private static final Logger logger = Logger.getLogger(CertMessageProcessHandler.class);
    /**
     * Is called for each message of type
     *
     * @param ctx the {@link ChannelHandlerContext} which this {@link SimpleChannelInboundHandler}
     * belongs to
     * @param msg the message to handle
     * @throws Exception is thrown if an error occurred
     */
    private int password = Integer.valueOf(SlarkContext.getProperty("pengder.certServer.password", "12345678")); // 客户端请求校验密码（需要与客户端保持一致）
    // 服务端与客户端时间差别上限（客户端验证码中分钟数与服务端当前分钟数最大差别）
    private int maxDataDelayTimeMinitue = Integer.valueOf(SlarkContext.getProperty("pengder.certServer.maxTimeDelayMinite", "10"));
    private String filePath = SlarkContext.getProperty("pengder.certServer.certFile", "config/mycert.pem");
    private String fileMD5 = SlarkContext.getProperty("pengder.certServer.certFileMD5", "4fbcb3c52c5b8a01f11e9040ea7778b1");
    private String TimeServerIP = SlarkContext.getProperty("pengder.certServer.timeServerIP", "time.windows.com"); // 时间服务器地址
    private String CommServerIP = SlarkContext.getProperty("pengder.certServer.commServerIP", "127.0.0.1"); // 通信服务IP
    private String CommServerPort = SlarkContext.getProperty("pengder.certServer.commServerPort", "6666"); // 通信服务的客户端监听端口
    private final String divider = ":"; // 发送字符串分割符，注：经调研，pem证书文件中不会出现":"

    @Override
    protected void messageReceived(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
        /**
         * 得到可读数据的大小
         */
        final int msgSize = msg.readableBytes();
        final int readIdx = msg.readerIndex();
        if (msgSize < 12) {
            logger.warn("认证服务没有接受到完整的数据。直接返回不做处理");
            return;
        }

        byte[] buffer = new byte[msgSize];
        /**
         * 得到所有的数据
         */
        msg.getBytes(readIdx, buffer);
        /**
         *
         */
        int res = check(buffer);

        if (res == 1) {
            sendCertFile(ctx);
        } else {
            sendState(false, ctx);
        }
        return;
    }

    /**
     * @param isTrue
     * @param ctx
     * @decription 发送状态值过去
     */
    private void sendState(boolean isTrue, ChannelHandlerContext ctx) {
        if (isTrue == true) {
            //System.out.println("数据验证成功！");
            byte[] buffer = "ok".getBytes();
            ctx.channel().writeAndFlush(buffer);
        } else {
            //System.out.println("数据验证失败！");
            byte[] buffer = "error".getBytes();
            ctx.channel().writeAndFlush(buffer);
        }
    }

    /**
     * @param ctx
     * @return
     * @description 直接发送证书文件
     */
    protected boolean sendCertFile(ChannelHandlerContext ctx) {
        logger.info("开始发送文件...");
        // 检查文件有效性
        String certFile = ResourcePath.getSlarkConfigureFile(filePath);

        logger.info("配置的证书文件全路径为: " + certFile);
        File file = new File(certFile);
        if (false == file.isFile() || file.length() <= 0) {
            logger.info("证书文件无效,路径为:" + certFile);
            return false;
        }

        long num = file.length(); // 返回字节数
        byte[] bufferSendFile = new byte[(int)(num)]; // 文件缓冲
        int realNum = 0;
        // 读取文件
        FileInputStream fis = null;
        logger.debug("文件长度为： " + num);
        try {
            fis = new FileInputStream(filePath);
            realNum = bufferSendFile.length;
            fis.read(bufferSendFile,0,realNum);
/*
            for (int readNum = 0; readNum != -1; readNum = fis.read(bufferSendFile, realNum, bufferSendFile.length - realNum)) {
                realNum += readNum;
            }
            */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            logger.error("打开证书文件失败..证书文件路径是： " + filePath);
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("读取证书文件失败..证书文件路径是： " + filePath);
            return false;
        } finally {
            try {
                fis.close();
                fis = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        byte[] bufferSendInfo = (TimeServerIP + divider + CommServerIP + divider
                                + CommServerPort + divider + fileMD5 + divider).getBytes();


        ByteBuf bb = Unpooled.buffer();//ctx.alloc().directBuffer();
        bb.writeBytes(getNumBytes(bufferSendInfo.length + realNum));
        bb.writeBytes(bufferSendInfo);
        bb.writeBytes(bufferSendFile, 0, realNum);
        ctx.channel().writeAndFlush(bb);
       // bb.release();
        logger.info("发送的证书文件是: " + SlarkUtil.byte2hex(bufferSendFile));
        logger.info("发送完成总长度（字节）：" + (bufferSendInfo.length + realNum) + ",文件发送完毕(大小):" + realNum);
        return true;
    }

    /**
     * @param num
     * @return
     */
    private byte[] getNumBytes(int num) {
        byte[] buffer = new byte[4];
        for (int i = 0; i < 4; i++) {
            buffer[i] = (byte) (num & 0xff);
            num = num >>> 8;
        }
        return buffer;
    }

    /**
     * @param buffer
     * @return
     * @check
     */
    protected int check(byte[] buffer) {
        if (PengderPackage.bytesToInt(buffer, 0) == 0x08 && checkNum(buffer, 4)) {
            return 1;
        } else {
            return -1;
        }
    }

    protected boolean checkNum(byte[] buffer, int offset) {
        int questionNum = PengderPackage.bytesToInt(buffer, offset + 0); // 前四字节为随机码（问题）
        int answerNum = PengderPackage.bytesToInt(buffer, offset + 4); // 后四字节为计算结果（答案）
        int answerCheck = getLoginNum(questionNum, password); // 服务端计算结果
        int timeNum = (questionNum % 1447);
        Calendar cal = Calendar.getInstance();
        int timeCheck = cal.get(Calendar.HOUR_OF_DAY) * 60 + cal.get(Calendar.MINUTE);
        int timeSub = timeCheck - timeNum; // 对方保证questionNum>0(int32最高位是0)（否则求余操作可能为负数，不符合时间检查）
        if (timeSub < 0) {
            // 时间差可能为负数（服务端与客户端时间可能不一致）
            timeSub = 0 - timeSub;
        }

        logger.info("发送时间：" + timeNum + ", 接受时间："+ timeCheck + ",时间差：" + timeSub + ",校验随机码："
                + questionNum + ",客户端登录密码计算结果：" + answerNum + "，服务端登录密码计算结果：" + answerCheck);

        if (timeSub < maxDataDelayTimeMinitue && answerCheck == answerNum) {
            return true;
        } else {
            logger.info("时间差或校验有问题，校验失败。" + "发送时间：" + timeNum + ",接受时间：" + timeCheck + "，时间差："
                    + timeSub + ",校验随机码：" + questionNum
                    + ",客户端登录密码计算结果：" + answerNum + "，服务端登录密码计算结果：" + answerCheck);
            return false;
        }
    }

    protected int getLoginNum(int aNonSslLoginQuestion, int aPasswd) {
        int q3 = (aNonSslLoginQuestion >>> 24) & 0xff;
        int q2 = (aNonSslLoginQuestion >>> 16) & 0xff;
        int q1 = (aNonSslLoginQuestion >>> 8) & 0xff;
        int q0 = aNonSslLoginQuestion & 0xff;
        int m00 = (q3 & 0x03) + 2;
        int m01 = (q2 + q3) % 31 + 1;
        int m10 = (q0 + q1) % 17 + 1;
        int m11 = (q1 & 0x03) + 2;
        int a = (q0 * m01 + q2 * m11) % 126 + 1;
        a = (a << 8) + ((q1 * m01 + q3 * m11) & 0xff);
        a = (a << 8) + ((q0 * m00 + q2 * m10) & 0xff);
        a = (a << 8) + ((q1 * m00 + q3 * m10) & 0xff);
        return a ^ aPasswd;
    }
}
