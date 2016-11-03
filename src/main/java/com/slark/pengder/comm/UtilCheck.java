package com.slark.pengder.comm;

import com.slark.pengder.protocol.MessageProtos;
import com.slark.pengder.protocol.PengderMessage;

import java.util.Date;

/**
 * Created by fengwei on 16/7/12.
 */
public class UtilCheck {
    /**
     * @param id
     * @return
     * @Description 判断设备id是否合法
     */
    public static final int checkTinstumentId(int id) {
        if (id >= 65536 && id < 65536 + 65536) {
            return id % 65536;
        } else {
            return -1;
        }
    }

    /**
     * @description
     *      判断d是否为空
     * @param d
     * @return
     */
    public static int  caseToSecond(Date  d){
        if(d == null){
            return 0;
        }
        return (int)(d.getTime()/1000);
    }

    /**
     * @Description 将秒数转成Date对象
     * @param second
     * @return
     */
    public static Date  castToDate(int  second){
        return new Date(second*1000L);
    }


    public static PengderMessage  newCommandMessage(int option){
        PengderMessage msg = new PengderMessage();
        msg.setMsgId(MessageProtos.MessageType.COMMAND.getNumber());
        MessageProtos.Command.Builder msgBuilder= MessageProtos.Command.newBuilder();
        msgBuilder.setOption(MessageProtos.Command.Option.valueOf(option));
        msg.setMsg(msgBuilder.build());
        msg.setNeedReply(false);
        return msg;
    }
}
