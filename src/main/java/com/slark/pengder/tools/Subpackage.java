package com.slark.pengder.tools;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.slark.pengder.protocol.MessageProtos;
import com.slark.pengder.protocol.PengderMessage;
import com.slark.pengder.protocol.PengderPackage;
import com.slark.util.system.SlarkUtil;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengwei on 16/7/13.
 */
public class Subpackage<EleType extends com.google.protobuf.GeneratedMessageLite,
        TList extends GeneratedMessageLite,TB extends MessageLite.Builder> {
    private static final Logger logger = Logger.getLogger(Subpackage.class);
    private IRepeatOpr<EleType,TList> msgOperation;
    private TB messageBuilder;
    private TList  message;

    public Subpackage(TB tb,IRepeatOpr<EleType,TList> opr){
        messageBuilder = tb;
        msgOperation = opr;
        message = (TList)tb.build();
    }

    /**
     * @description 该函数可以减少循环次数
     * @param builder
     * @param nextEle
     * @param newUpdateTick
     * @param msgType
     * @param msg
     * @return
     */
    public int splitPackage(TB  builder,EleType nextEle,Integer  newUpdateTick,int msgType,PengderMessage msg){
        TList repeat = msgOperation.build();
        int size = repeat.getSerializedSize();
        int eleSize = nextEle.getSerializedSize();
        int res = 0;
        /**
         * 如果小于这个数值，则加进去
         */
        if(size + eleSize <  PengderPackage.maxDataByteSize){
            msgOperation.addElement(nextEle);
            res = 1;
        }else {
            if(msgOperation.getTemporyCount()<=0){
                PengderPackage.adaptionMaxPackageSize(size + eleSize);
                msgOperation.addElement(nextEle);
                res = 1;
            }else if(size + eleSize ==  PengderPackage.maxDataByteSize){
                msgOperation.addElement(nextEle);
                msg.setMsg(repeat);
                msg.setUpdateNum(newUpdateTick);
                msg.setMsgId(msgType);
                res = 2;
            }else {
                msg.setMsg(repeat);
                msg.setUpdateNum(newUpdateTick);
                msg.setMsgId(msgType);
                res = 3;
            }
        }
        msgOperation.clear();
        return res;
    }

    /**
     * @description 分包的方法
     * @return
     */
    public List<PengderMessage> splitPackage(Integer  newUpdateTick,int msgType){
        List<PengderMessage> res = new ArrayList<PengderMessage>();
        int msgNum  = msgOperation.getElementCount();
        int msgSize = message.getSerializedSize();

        if (msgSize > PengderPackage.maxDataByteSize) {
            for (int i = 0; i < msgNum; ){
                PengderMessage msg = null;
                TList repeat = msgOperation.build();
                final EleType ele  = msgOperation.getElement(i);
                final int ulSize = repeat.getSerializedSize();
                final int uSize = ele.getSerializedSize();

                if (ulSize + uSize > PengderPackage.maxDataByteSize){
                    if( msgOperation.getTemporyCount()<= 0){
                        PengderPackage.adaptionMaxPackageSize(ulSize + uSize);
                        logger.warn("配置的最大数据包大小不合理，将采用自适应的包大小");
                        msgOperation.clear();
                        continue;
                    }
                    msg = new PengderMessage();
                    msg.setMsg(repeat);
                    msg.setUpdateNum(newUpdateTick);
                    msg.setMsgId(msgType);
                    msgOperation.clear();
                }else if(ulSize + uSize == PengderPackage.maxDataByteSize){
                    msgOperation.addElement(ele);
                    repeat = msgOperation.build();
                    msg = new PengderMessage();
                    msg.setMsg(repeat);
                    msg.setUpdateNum(newUpdateTick);
                    msg.setMsgId(msgType);
                    msgOperation.clear();
                    i++;
                } else {
                    msgOperation.addElement(ele);
                    i++;
                }

                if(msg != null){
                    res.add(msg);
                }
            }
        } else {
            PengderMessage msg = new PengderMessage();
            msg.setMsg(message);
            msg.setUpdateNum(newUpdateTick);
            msg.setMsgId(msgType);
            res.add(msg);
        }

        logger.debug("共"  + msgNum + "消息，生成 "+ res.size() + "个PengderMessage");
        return res;
    }


}
