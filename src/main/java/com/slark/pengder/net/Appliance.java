package com.slark.pengder.net;

import com.slark.pengder.protocol.MessageProtos.MessageType;
import com.slark.pengder.protocol.PengderMessage;
import com.slark.pengder.tools.EUpdateType;
import com.slark.pengder.tools.SyncState;
import io.netty.channel.Channel;
import org.apache.log4j.Logger;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by fengwei on 16/7/8.
 */
public class Appliance {
    private static final Logger logger = Logger.getLogger(Appliance.class);
    /**
     * 设备id
     */
    private int applianceID = -1;
    /**
     * 设备的通道id
     */
    private Channel channel = null;
    /**
     * 设备的mac地址
     */
    private String macAddress = null;

    private boolean isBinded = false;

    private boolean isSyncInitData = false;

    /**
     * 默认二代机
     */
    private int version = 2;
    /**
     * 数据同步标记，初始化为0
     */
    private SyncState[] arraySyncFlag = null;

    /**
     * 客户端状态,心跳包写入
     */
    private int clientState = 0;
    //private boolean waitReply = false;
    /**
     * 空闲的读时间
     */
    private AtomicInteger readIdleTime = new AtomicInteger(0);
    private AtomicInteger heartbeatCount = new AtomicInteger(0);

    /**
     * 需要回复的消息缓冲区
     */
    private PengderMessage currMsg = null;
    private ResponeConfiredList queueMsg = new ResponeConfiredList();

    /**
     * 默认构造函数
     */
    public Appliance() {
        // TODO Auto-generated constructor stub
        arraySyncFlag = new SyncState[EUpdateType.maxIndex()];
        for (int i = 0; i < EUpdateType.maxIndex(); i++) {
            arraySyncFlag[i] = new SyncState(EUpdateType.indexOf(i));
        }
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    /**
     * 增加心跳间隔时间
     *
     * @param interval
     */
    public int addReadIdleTime(int interval) {
        return readIdleTime.addAndGet(interval);
    }

    /**
     * @return
     * @Description 增加心跳包的个数 如果大于Integer的最大值，则重置为0
     */
    public int addHeartbeatCount() {
        heartbeatCount.compareAndSet(Integer.MAX_VALUE, 0);
        return heartbeatCount.incrementAndGet();
    }

    /**
     * @return
     * @Description 重置心跳包的个数
     */
    public int resetHeartbeatCount() {
        return heartbeatCount.getAndSet(0);
    }

    /**
     * @return
     * @Description 得到当前心跳包的个数
     */
    public int getHeartbeatCount() {
        return heartbeatCount.get();
    }

    /**
     * 重置空闲时间  直接设置成0
     *
     * @return
     */
    public int resetReadIdleTime() {
        return readIdleTime.getAndSet(0);
    }

    /**
     * @return
     * @Description 得到当前的空闲时间
     */
    public int getReadIdleTime() {
        return readIdleTime.get();
    }

    /**
     * 客户端状态
     *
     * @return
     */
    public int getClientState() {
        return clientState;
    }

    /**
     * 设置客户端状态，心跳包调用
     *
     * @param clientState
     */
    public void setClientState(int clientState) {
        this.clientState = clientState;
    }

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p/>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "channel : " + channel.toString()
                + " applianceID : " + applianceID
                + " macAddress : " + macAddress
                + " isBinded : " + isBinded
                + " isSyncInitData: " + isSyncInitData
                + " version: " + version;
    }

    public Appliance(Channel c) {
        arraySyncFlag = new SyncState[EUpdateType.maxIndex()];
        for (int i = 0; i < EUpdateType.maxIndex(); i++) {
            arraySyncFlag[i] = new SyncState(EUpdateType.indexOf(i));
        }
        channel = c;
    }

    public int getApplianceID() {
        return applianceID;
    }

    public void setApplianceID(int applianceID) {
        this.applianceID = applianceID;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public boolean isBinded() {
        return isBinded;
    }

    public void setBinded(boolean binded) {
        isBinded = binded;
    }

    /**
     * 判断是否同步了初始化数据
     *
     * @return
     */
    public boolean isSyncInitData() {
        return isSyncInitData;
    }


    /**
     * 设置是否同步了初始化数据
     *
     * @param syncInitData
     */
    public void setSyncInitData(boolean syncInitData) {
        isSyncInitData = syncInitData;
    }

    /**
     * 获取对应数据类型的同步标识
     *
     * @param type
     * @return
     */
    public SyncState getSyncState(EUpdateType type) {
        return this.arraySyncFlag[type.getIndex()];
    }

    /**
     * @param msg
     * @description
     */
    public void send(Object msg) {
        PengderMessage m = (PengderMessage) msg;

        m.setAppliance(this);
        m.setVersion(this.getVersion());

        if (!m.isNeedReply()) {
            MessageType type = MessageType.valueOf(m.getMsgId());
            logger.debug("发送消息(不需要回复):" + type.toString() + "到" + applianceID);
            channel.write(m);
        } else {
            this.queueMsg.offer(m);
            send();
        }
    }

    /**
     * @description 重新发送当前的消息
     */
    public void resend(PengderMessage msg) {
        if (msg != null) {
            MessageType type = MessageType.valueOf(msg.getMsgId());
            logger.debug("发送消息(需要回复):" + type.toString() + "到" + applianceID);
            channel.write(msg);
            msg.addRepeatSendTimes();
        }
    }

    /**
     * @description 该函数发送的消息都需要返回
     */
    public void send() {
        PengderMessage sndMsg = nextMessage();
        if (sndMsg != null) {
            MessageType type = MessageType.valueOf(sndMsg.getMsgId());
            logger.debug("发送消息(需要回复):" + type.toString() + "到" + applianceID);
            channel.write(sndMsg);
            this.setCurrMsg(sndMsg);
        }
    }

    /**
     * @return
     * @description 下一个待处理消息
     */
    private synchronized PengderMessage nextMessage() {
        PengderMessage resMsg = null;
        if (this.currMsg == null) {
            resMsg = queueMsg.poll();
            if (resMsg != null) {
                return resMsg;
            }
        }
        return null;
    }

    /**
     * @return
     * @description 设置当前发送的消息
     */
    public synchronized PengderMessage getCurrMsg() {
        return this.currMsg;
    }

    /**
     * @param currMsg
     * @description 设置当前的发送的消息
     */
    public synchronized void setCurrMsg(PengderMessage currMsg) {
        this.currMsg = currMsg;
    }

}
