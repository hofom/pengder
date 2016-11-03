package com.slark.pengder.protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.slark.pengder.net.Appliance;
import com.slark.pengder.tools.UpdateYears;
import org.apache.log4j.Logger;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import static com.slark.pengder.protocol.MessageProtos.*;

/**
 * Created by fengwei on 16/7/7.
 */
public class PengderMessage implements Serializable {
    private static final Logger logger = Logger.getLogger(PengderMessage.class);
    private GeneratedMessageLite msg = null;
    private Appliance appliance;
    private int msgId = -1;
    private boolean needReply = false;
    private Integer  updateNum = null;
    private UpdateYears  updateYears = null;
    private PengderMessage rqstMsg = null;
    /**
     * 默认的是二代机的包头
     */
    private int   version = 2;
    /**
     * 记录当前消息重发的次数
     */
    private AtomicInteger   repeatSendTimes = new AtomicInteger(0);
    /**
     * 消息的发送时间
     */
    private Date sndTime = null;
    /**
     *@Description 构造函数
     */
    public PengderMessage() {
        this(null, null, -1,false);
    }
    /**
     * @param msg
     * @param ch
     * @param msgId
     * @Description
     */
    public PengderMessage(GeneratedMessageLite msg, Appliance ch, int msgId,boolean confired) {
        this.msg = msg;
        this.appliance = ch;
        this.msgId = msgId;
        this.needReply = confired;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    /**
     * @description 增加重发次数
     * @return
     */
    public int addRepeatSendTimes(){
        return repeatSendTimes.addAndGet(1);
    }

    /**
     * @decription的到当前消息的重发次数
     * @return
     */
    public int getRepeatSendTimes(){
        return repeatSendTimes.get();
    }

    /**
     * @description 重置为0
     */
    public void resetRepeatSendTimes(){
        repeatSendTimes.set(0);
    }

    public Date getSndTime() {
        return sndTime;
    }

    public void setSndTime(Date sndTime) {
        this.sndTime = sndTime;
    }
    /**
     * 将发送时间更新为当前时间
     */
    public void updateSendTime(){
         setSndTime(new Date());
    }

    public PengderMessage getRqstMsg() {
        return rqstMsg;
    }

    public void setRqstMsg(PengderMessage rqstMsg) {
        this.rqstMsg = rqstMsg;
    }

    public UpdateYears getUpdateYears() {
        return updateYears;
    }

    public void setUpdateYears(UpdateYears updateYears) {
        this.updateYears = updateYears;
    }

    public Integer getUpdateNum() {
        return updateNum;
    }

    public void setUpdateNum(Integer updateNum) {
        this.updateNum = updateNum;
    }

    public boolean isNeedReply() {
        return needReply;
    }

    public void setNeedReply(boolean needReply) {
        this.needReply = needReply;
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
        return "protobuf-msg : " + msg.toString()
                + " appliance : " + appliance.toString()
                + " msgId : " + msgId;
    }


    public Appliance getAppliance() {
        return appliance;
    }

    public void setAppliance(Appliance appliance) {
        this.appliance = appliance;
    }

    public GeneratedMessageLite getMsg() {
        return msg;
    }

    public void setMsg(GeneratedMessageLite msg) {
        this.msg = msg;
    }


    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    /**
     * @param msgId
     * @param tmpbuf
     * @param idx
     * @param len
     * @return 成功返回PengderMessage对象，失败返回null
     * @Description 将字节流解析成PengderMessage对象
     */
    public static PengderMessage buildMessage(int msgId, byte[] tmpbuf, int idx, int len) {
        PengderMessage msg = null;
        MessageType messageType = MessageType.valueOf(msgId);
        byte []  buffer = new byte[len];
        System.arraycopy(tmpbuf,idx,buffer,0,buffer.length);

        try {
            switch (messageType) {
                case HEARTBEAT: // 心跳包消息
                    // Heartbeat.newBuilder().mergeFrom(buffer,idx,buffer.length).build()
                    Heartbeat hb = MessageProtos.Heartbeat.parseFrom(buffer);
                    if (hb.hasInstrumentId() && hb.hasClientState()) {
                        msg = new PengderMessage(hb, null, msgId,false);
                    } else {
                        logger.error("心跳消息格式非法...");
                    }
                    break;
                case COMMAND: // 通用指令消息
                    Command cmd = Command.parseFrom(buffer);
                    msg = new PengderMessage(cmd, null, msgId,false);
                    break;
                case INSTRUMENTBINDING: // 仪器绑定消息
                    InstrumentBinding ib = InstrumentBinding.parseFrom(buffer);
                    msg = new PengderMessage(ib, null, msgId,false);
                    break;
                case SESSIONLIST: // 使用记录消息
                    SessionList sl = SessionList.parseFrom(buffer);
                    msg = new PengderMessage(sl, null, msgId,false);
                    break;
                case USERINTRAININGLIST: // 用户培训消息
                    UserInTrainingList utl = UserInTrainingList.parseFrom(buffer);
                    msg = new PengderMessage(utl, null, msgId,false);
                    break;
                case USEREVENTLIST: // 刷卡机用户事件消息
                    UserEventList uel = UserEventList.parseFrom(buffer);
                    msg = new PengderMessage(uel, null, msgId,false);
                    break;
                case SYSTEMEVENTLIST: // 刷卡机系统事件消息
                    SystemEventList sel = SystemEventList.parseFrom(buffer);
                    msg = new PengderMessage(sel, null, msgId,false);
                    break;
                case FTPEVENTLIST:
                    FtpEventList fel = FtpEventList.parseFrom(buffer);
                    msg = new PengderMessage(fel,null,msgId,false);
                    break;
                case SESSION_OPERATION_REP_CMD:
                    SessionOpertaionRep rep = SessionOpertaionRep.parseFrom(buffer);
                    msg = new PengderMessage(rep,null,msgId,false);
                    break;
                default:
                    logger.warn("checkContent没有准备对应解析函数");
            }
        } catch (InvalidProtocolBufferException e) {
            logger.error("protobuf 解析失败。消息格式非法,msg : " + e.getMessage());
        }

        return msg;
    }

}
