package com.slark.util.system;

import io.netty.buffer.ByteBuf;

/**
 * Created by fengwei on 16/7/12.
 */
public class SlarkUtil {
    /**
     * @Description 将字节码转换成16进制字符串
     * @param b
     * @return
     */
    public static String byte2hex(byte[] b) {
        StringBuilder hs= new StringBuilder();
        String stmp="";
        for (int n=0;n<b.length;n++){
            stmp=(java.lang.Integer.toHexString(b[n] & 0XFF));
            if (stmp.length()==1) {
                hs.append("0");
                hs.append(stmp);
            }else{
                hs.append(stmp);
            }
        }
        return hs.toString().toUpperCase();
    }

    /**
     * @description
     * @param b
     * @return
     */
    public static String  byteBuf2hex(ByteBuf  b){
        StringBuilder hs= new StringBuilder(" ");
        int  reads = b.readableBytes();

        for(int i = 0;i<reads;i++) {
            String stmp=(java.lang.Integer.toHexString(b.getByte(i) & 0XFF));
            if (stmp.length()==1) {
                hs.append("0");
                hs.append(stmp);
            }else{
                hs.append(stmp);
            }
        }

        return hs.toString().toUpperCase();
    }

    /**
     * @Description 将一个16进制的字符串转换成字节码
     * @param h
     * @return
     */
    public static byte[] hex2byte(String h) {
        byte[] ret = new byte[h.length()/2];
        for(int i=0; i<ret.length; i++){
            ret[i] = Integer.decode("#"+h.substring(2*i, 2*i+2)).byteValue();
        }
        return ret;
    }
}
