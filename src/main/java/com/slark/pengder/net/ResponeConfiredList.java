package com.slark.pengder.net;

import com.slark.pengder.protocol.PengderMessage;
import io.netty.util.internal.PlatformDependent;

import java.util.Queue;

/**
 * Created by fengwei on 16/7/11.
 */
public class ResponeConfiredList {
    /**
     * 这里面存放一个队列
     */
    private final Queue<PengderMessage> messageQueue = PlatformDependent.newMpscQueue();

    ResponeConfiredList() {

    }
    /**
     * @Description 将一个需要回复确认的消息打入消息队列
     * @param msg
     */
    public void offer(PengderMessage msg){
        messageQueue.offer(msg);
        messageQueue.peek();
    }
    /**
     * @Description 得到这个消息队列的数据
     * @return
     */
    public PengderMessage poll(){
        return messageQueue.poll();
    }

    void clear(){
        messageQueue.clear();
    }
}
