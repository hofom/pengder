package com.slark.pengder.test;

import com.google.protobuf.InvalidProtocolBufferException;
import com.slark.pengder.protocol.MessageProtos.*;
import com.slark.util.system.ResourcePath;

import javax.net.ssl.X509TrustManager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Properties;
import java.util.Queue;
import java.util.zip.Adler32;

class ExpanClass {

}

// 数据缓存与数据解析维护类（IO线程内部类）
// // 暂存收到到字节数，调用解析函数解析数据包
class RecvByteBuffer {
    byte buffer[] = new byte[DataNodeBase.MaxDataByteSize * 5]; // 暂时采用单向队列存收到读数据
    private int bufferHead = 0; // 待处理首字节位置
    int bufferTail = 0; // 待写入字节位置

    // 消息解析
    // 检查buffer，若有新消息则返回返回，若无完整数据返回null，同时修改起始指针至未处理到有效帧头
    DataRecv check() {
        // 处理数据：找帧头，校验消息，若消息没有问题，则取消息ID，校验内容，校验成功即可得消息结构体
        // 找帧头
        while (bufferTail - bufferHead >= DataNodeBase.MinDataByteSize) {
            // Log.println("接收缓存内容：：");
            // Log.printBytes(buffer, bufferHead, bufferTail);
            if (DataCheck.checkDataHead(buffer, bufferHead, bufferTail
                    - bufferHead) == true) {
                break;
            }
            bufferHead++;
        }
        // 找到帧头，或数据太少不够一个最小包
        if (bufferTail - bufferHead >= DataNodeBase.MinDataByteSize) { // 找到帧头
            // Log.println("找到帧头，开始解析" + "--" + this.getClass().getName()); //
            // debug
            int dataLength = DataCheck.checkDataLength(buffer, bufferHead,
                    bufferTail - bufferHead);
            // 若长度不够则不修改bufferhead
            if (bufferTail - bufferHead >= dataLength) { // 剩余数据长度大于待内容检查消息长度
                // debug显示收到到数据
                // Log.println("消息：");
                // Log.printBytes(buffer, bufferHead, bufferTail -
                // bufferHead);

                DataRecv newDataNode = DataCheck.check(buffer, bufferHead,
                        dataLength);

                if (newDataNode != null) {
                    bufferHead += dataLength;
                    // Log.println("消息解析：有效包" + "--" +
                    // this.getClass().getName());// debug

                } else {
                    bufferHead++;
                    Log.println("消息解析：无效包" + "--" + this.getClass().getName());// debug
                }
                return newDataNode;
            }
        }
        return null;
    }

    int getFreeSize() {
        return (buffer.length - bufferTail);
    }

    void clean() {// 清除已处理字节及无效字节，将帧头移到首字节
        if (bufferHead > 0) {
            for (int i = 0; i < bufferTail - bufferHead; i++) {
                buffer[i] = buffer[bufferHead + i];
            }
            bufferTail = bufferTail - bufferHead;
            bufferHead = 0;
        }
    }

    void clear() { // debug
        bufferHead = 0;
        bufferTail = 0;
    }
}

abstract class DataNodeBase {
    static final int MaxDataByteSize = 100;
    static final int MinDataByteSize = 16; // 要求正好为空包时包长度
    static final byte dataHead1 = 0x7e; // ??待改
    static final byte dataHead2 = 0x3a;
    static final byte dataHead3 = 0x7e;
    static final byte dataHead4 = 0x3a;

    static final byte MaxMsgNumOfListMsg = 5;

    abstract int getDataID(); // 只提供非静态方法，静态方法不能被子类覆盖

    final static int getCheck32(byte[] buffer, int offset, int num) { // 求校验
        Adler32 check32 = new Adler32();
        check32.update(buffer, offset, num);
        return (int) (check32.getValue() & 0xffffffff);
    }

    final static int bytesToInt(byte[] buffer, int offset) { // bytes转int（低字节在前，内部保证数组不越界）
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

    final static void intToBytes(int num, byte[] buffer, int offset) { // int转bytes（低字节在前，内部保证数组不越界）
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
}

abstract class DataSend extends DataNodeBase { // 待发送的消息

    final byte[] encodeToByteArray() { // 消息编码，不可重载
        byte[] bufferMsg = this.getMsgBytes();
        int dataLength = bufferMsg.length + DataNodeBase.MinDataByteSize;
        byte[] buffer = new byte[dataLength];
        // 帧头
        buffer[0] = DataNodeBase.dataHead1; // 帧头1
        buffer[1] = DataNodeBase.dataHead2; // 帧头2
        buffer[2] = DataNodeBase.dataHead3; // 帧头3
        buffer[3] = DataNodeBase.dataHead4; // 帧头4

        DataNodeBase.intToBytes(dataLength - 4 * 2, buffer, 4 * 1);// 长度（4字节）
        // Log.println("长度：" + dataLength + "--DataSend.encodeToByteArray");
        // Log.printBytes(buffer, 4, 4);
        DataNodeBase.intToBytes(this.getDataID(), buffer, 4 * 2); // 消息ID（4字节）

        for (int i = 0; i < bufferMsg.length; i++) {// 内容
            buffer[4 * 3 + i] = bufferMsg[i];
        }

        int crcNum = DataNodeBase.getCheck32(buffer, 8, dataLength - 4 * 3);// 校验（4字节）
        // Log.println("校验：" + (long) (crcNum & 0xffffffff));// debug
        DataNodeBase.intToBytes(crcNum, buffer, dataLength - 4);
        // Log.printBytes(buffer, dataLength - 4, 4);
        return buffer;
    }

    abstract byte[] getMsgBytes(); // 获取消息编码

    // abstract void setUpdated(DBAccess aDBAccess); // 收到回复消息，标记已同步

}

abstract class DataRecv extends DataNodeBase { // 接受到的消息
    // abstract DataRecv getData(); //
    // DataSend getReplyData(DBAccess aDBAccess) { // 生成回复消息，若无回复消息则返回null
    // return null;
    // }
}

final class DataCheck {// 数据解析：将缓存中到byte数组解析为消息对象

    static boolean checkDataHead(final byte[] buffer, int dataHead, int length) { // 检查帧头
        if (buffer[dataHead] == DataNodeBase.dataHead1
                && buffer[dataHead + 1] == DataNodeBase.dataHead2
                && buffer[dataHead + 2] == DataNodeBase.dataHead3
                && buffer[dataHead + 3] == DataNodeBase.dataHead4) {
            return true;
        } else {
            return false;
        }
    }

    static int checkDataLength(final byte[] buffer, int dataHead, int length) { // 获取帧的总长度
        int dataLength = DataNodeBase.bytesToInt(buffer, dataHead + 4);
        dataLength += (DataNodeBase.MinDataByteSize - 8);
        // Log.println("帧的总长度" + dataLength); // debug
        return dataLength;
    }

    static DataRecv check(final byte[] buffer, int dataHead, int dataLength) { // dataLength为整个包长度
        // 检查校验
        int crcNum = DataNodeBase.getCheck32(buffer, dataHead + 8,
                dataLength - 12);
        int crcNumGet = DataNodeBase.bytesToInt(buffer, dataHead + dataLength
                - 4);
        // Log.println("校验检查：新" + crcNum + "原:" + crcNumGet);// debug
        if (crcNum == crcNumGet) {// ？检查校验
            // 检查内容

            //String str = "7E3A7E3AF80000000A0000000A120885BDA1920110FD0118FC0120D5BAF6B2050A1208D28384E30110FC0118FB012080E3FCF7040A120898B6B0F10110FF0118FF012080E3FCF7040A1208EEBA9D970210FC0118FB012080E3FCF7040A1208E9E38BD50210FB0118FB012080E3FCF7040A120887988DA30310FB0118FB012080E3FCF7040A1208A991D7E40310FD0118FB012080E3FCF7040A1208B2F789EF0310FD0118FB012080E3FCF7040A1208CFEEA9CA0410FB0118FB012080E3FCF7040A12088B8289830510FB0118FB012080E3FCF7040A1208F1FCBECF0510FE0118FB012080E3FCF7040A1208E4D7A7CA0610FD0118FB012080E3FCF7048B674CC3";
            //String str2 = "7E3A7E3A2C0000000A0000000A04081710010A04081810010A04081E10010A04081F10010A04080610010A04080710016E01E51C";
            int dataID = DataNodeBase.bytesToInt(buffer, dataHead + 8);
            // Log.println("消息ID：" + dataID + "DataCheck.check"); // debug
            /*if(Log.byte2hex(buffer,dataHead,dataLength).equals(str)){
                System.out.println("找到我想要的包");
            }
            if(Log.byte2hex(buffer,dataHead,dataLength).equals(str2)){
                System.out.println("找到我想要的包");
            }
            */
            byte[] bufferContent = Arrays.copyOfRange(buffer, dataHead + 3 * 4,
                    dataHead + dataLength - 1 * 4);
            try {
                return DataCheck.checkContent(dataID, bufferContent);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
                Log.println("消息格式有误，消息：" + "DataCheck.check");
                Log.printBytes(buffer, dataHead, dataLength); // debug
                return null;
            }
        } else {
            Log.println("消息校验有误" + "DataCheck.check"); // debug
            return null;
        }

    }

    private static DataRecv checkContent(int dataID, final byte[] buffer)
            throws InvalidProtocolBufferException { // 检查消息内容
        MessageType messageType = MessageType.valueOf(dataID);
        switch (messageType) {
            case HEARTBEAT: // 心跳包消息
                return DataHeartBeatRecv.checkContent(buffer);
            case COMMAND: // 通用指令消息
                return DataCommandRecv.checkContent(buffer);
            case INSTRUMENTLIST: // 仪器列表
                return DataInstrumentList.checkContent(buffer);
            case INSTRUMENTDETAIL: // 仪器详细信息
                return DataInstrumentDetail.checkContent(buffer);
            case USERLIST: // 用户列表
                return DataUserList.checkContent(buffer);
            case USERRIGHTLIST: // 用户资格列表
                return DataUserRightList.checkContent(buffer);
            case ACCOUNTLIST: // 账户列表
                return DataAccountList.checkContent(buffer);
            case RESERVATIONLIST: // 专享时间列表
                return DataReservationList.checkContent(buffer);
            case TEMPCARDBINDINGLIST: // 临时卡关联列表
                return DataTempCardBindingList.checkContent(buffer);
            case BOOKINGLIST: // 预约列表
                return DataBookingList.checkContent(buffer);
            case CALENDARLIST: // 日历列表
                return DataCalendarList.checkContent(buffer);
            case GLOBALCONFIG: // 全局配置
                return DataGlobalConfig.checkContent(buffer);
            case SESSIONLIST: // 使用记录列表
                return DataClientSessionListLast.checkContent(buffer);
            case SYSTEMEVENTLIST: // 系统事件列表
                return DataSystemEventListLast.checkContent(buffer);
            case USEREVENTLIST: // 用户事件列表
                return DataUserEventListLast.checkContent(buffer);
            default:
                Log.println("checkContent没有准备对应解析函数:" + messageType);
                return null;
        }
    }
}

// 以下为具体消息

// 心跳包
class DataHeartBeatRecv extends DataRecv {
    static final int dataID = MessageType.HEARTBEAT.getNumber();
    Heartbeat msg = null;

    DataHeartBeatRecv(Heartbeat msgHeartbeat) {
        this.msg = msgHeartbeat;
    }

    static DataRecv checkContent(final byte[] buffer)
            throws InvalidProtocolBufferException { // 解码
        // Log.println("心跳包检查 ");
        Heartbeat msgHeartbeat = Heartbeat.parseFrom(buffer);
        // Log.println("收到心跳包时间" + msgHeartbeat.getTimestamp());
        return new DataHeartBeatRecv(msgHeartbeat);
    }

    @Override
    int getDataID() { // 获取消息ID
        return dataID;
    }

    int getClientTimeStamp() {
        return this.msg.getClientTimestamp();
    }

    int getServerTimeStamp() {
        return this.msg.getServerTimestamp();
    }

    int getMsgInstrumentID() {
        if (true == this.msg.hasInstrumentId()) {
            return this.msg.getInstrumentId();
        } else {
            return -1;
        }

    }
}

// 心跳包
class DataHeartBeatSend extends DataSend { // 心跳包发送
    static final int dataID = MessageType.HEARTBEAT.getNumber();
    Heartbeat msg = null;

    DataHeartBeatSend(Heartbeat msgHeartbeat) {
        this.msg = msgHeartbeat;
    }

    static DataHeartBeatSend getInstance() {
        int timestamp = 0;//(int) (System.currentTimeMillis() / 1000);
        // Log.println("发送心跳包时间" + timestamp);
        int instrumentID = SSLClient.instrumentID;
        return new DataHeartBeatSend(Heartbeat.newBuilder()
                .setClientTimestamp(timestamp) //
                .setServerTimestamp(timestamp) //
                .setInstrumentId(instrumentID) //
                .setClientState(1)// 空闲状态
                .build()); // 心跳包设置
    }

    @Override
    int getDataID() { // 获取消息ID
        return dataID;
    }

    @Override
    byte[] getMsgBytes() {
        return msg.toByteArray();
    }

}

// 通用消息发
class DataCommandSend extends DataSend { // 通用指令
    static final int dataID = MessageType.COMMAND.getNumber();

    Command msgCommand = null;

    DataCommandSend(Command msgCommand) {
        this.msgCommand = msgCommand;
    }

    static DataCommandSend getReplyOK() {
        Command msgCommand = Command.newBuilder()
                .setOption(Command.Option.CLIENT_RECV_OK).build();
        return new DataCommandSend(msgCommand);
    }

    static DataCommandSend getInitReq() {
        Command msgCommand = Command.newBuilder()
                .setOption(Command.Option.CLIENT_INIT_REQ).build();
        return new DataCommandSend(msgCommand);
    }

    @Override
    int getDataID() {
        return dataID;
    }

    static DataCommandSend checkContent(final byte[] buffer)
            throws InvalidProtocolBufferException { // 解码
        Command msgCommand = Command.parseFrom(buffer);
        return new DataCommandSend(msgCommand);
    }

    @Override
    byte[] getMsgBytes() { // 获取消息编码，子类可重载
        return msgCommand.toByteArray();
    }

}

// 通用指令收
class DataCommandRecv extends DataRecv {
    static final int dataID = MessageType.COMMAND.getNumber();
    Command msg = null;
    private DataSend dataSendOfReply = null;

    DataCommandRecv(Command aMsg) {
        this.msg = aMsg;
    }

    static DataCommandRecv checkContent(final byte[] buffer)
            throws InvalidProtocolBufferException {// 解码
        // Log.println("收到command命令：" + "--DataCommandRecv.checkContent");
        // Log.printBytes(buffer, 0, buffer.length);
        // Log.println("--DataCommandRecv.checkContent");
        Command msg = Command.parseFrom(buffer);
        return new DataCommandRecv(msg);
    }

    @Override
    int getDataID() {
        return dataID;
    }

    void setDataSendOfReply(DataSend dataSendOfReply) {
        this.dataSendOfReply = dataSendOfReply;
    }

    DataSend getDataSendOfReply() {
        return this.dataSendOfReply;
    }

    boolean isReplyInitedDone() {
        if (Command.Option.SERVER_INIT_DONE == msg.getOption()) {
            return true;
        } else {
            return false;
        }

    }

    boolean isReplyOK() {
        // Log.println("通用消息检查");
        if (Command.Option.SERVER_RECV_OK == msg.getOption()) {
            return true;
        } else {
            return false;
        }
    }

    boolean isReplyERR() {
        if (Command.Option.SERVER_RECV_ERR == msg.getOption()) {
            return true;
        } else {
            return false;
        }
    }
}

// 仪器列表消息
class DataInstrumentList extends DataRecv {
    static final int dataID = MessageType.INSTRUMENTLIST.getNumber();
    InstrumentList msg = null;

    DataInstrumentList(InstrumentList aMsg) {
        this.msg = aMsg;
    }

    static DataInstrumentList checkContent(final byte[] buffer)
            throws InvalidProtocolBufferException {// 解码
        InstrumentList msg = InstrumentList.parseFrom(buffer);

        System.out.println("仪器列表条数：" + msg.getInstrumentCount());
        for (int i = 0; i < msg.getInstrumentCount(); i++) {
            System.out.println("仪器名称:" + msg.getInstrument(i).getName());
            System.out.println("仪器ID:" + msg.getInstrument(i).getId());
        }
        return new DataInstrumentList(msg);
    }

    @Override
    int getDataID() { // 获取消息ID
        return dataID;
    }

}

class DataInstrumentBinding extends DataSend { // 仪器绑定
    static final int dataID = MessageType.INSTRUMENTBINDING.getNumber();
    InstrumentBinding msg = null;

    DataInstrumentBinding(boolean aConfirm) {
        InstrumentBinding.Builder msgBuilder = InstrumentBinding.newBuilder();
        int instrumentID = SSLClient.instrumentID;
        InstrumentBinding.Option bindstate = InstrumentBinding.Option.REQUEST_BINDING;
        if (true == "true".equals(PropertyManager.getProtery("BindState", "true"))) {
            if (false == aConfirm) {
                bindstate = InstrumentBinding.Option.REQUEST_BINDING; // 请求绑定
            } else {
                bindstate = InstrumentBinding.Option.CONFIRM_BINDING; // 绑定
            }

        } else {
            bindstate = InstrumentBinding.Option.RELEASE_BINDING;// 解绑定
        }

        msg = msgBuilder.setInstrumentId(instrumentID).setClientMacAddr(SSLClient.MacAddr)
                .setClientModel(0).setClientVersion("v1.3").setOption(bindstate)
                .build();
    }

    DataInstrumentBinding(InstrumentBinding aMsg) {
        this.msg = aMsg;
    }

    static DataInstrumentBinding getInstance(boolean aConfirm) {
        return new DataInstrumentBinding(aConfirm);
    }

    @Override
    int getDataID() { // 获取消息ID
        return dataID;
    }

    byte[] getMsgBytes() { // 获取消息编码，子类可重载
        return msg.toByteArray();
    }

}

// 使用记录列表
class DataClientSessionList extends DataSend {
    static final int dataID = MessageType.SESSIONLIST.getNumber();
    SessionList msg = null;

    DataClientSessionList(SessionList aMsg) {
        this.msg = aMsg;
    }

    static DataClientSessionList getInstance() {
        SessionList.Builder msgBuilder = SessionList.newBuilder();
        for (int i = 0; i < 1; i++) {
            msgBuilder.addSession(Session
                    .newBuilder()
                    .setAccountId(74699489)
                    // .setBookingId(11)
                    .setCardSerial(1012214032).setUserRight(251)
                    .setEndTime(1355367600).setGroupId(74699489)
                    .setId(731313139).setInstrumentId(65539)
                    .setStartTime(1355360400).setType(201).setUserId(74699489)
                    .setPenaltyFlag(false));
        }
        return new DataClientSessionList(msgBuilder.build());
        /*
		 * // 服务端 // 写入数据库 CallableStatement statement = null; statement =
		 * iDbConnection .prepareCall(
		 * "{call Charge_NewRecordofuser_Proc(?,FROM_UNIXTIME(?),FROM_UNIXTIME(?),?,?,?,?,?,?,?,?,?,?,?,?)}"
		 * ); statement.setLong(1, (long)731313131); // id statement.setInt(2,
		 * 1355360400); // msg.getStartTime() statement.setInt(3,
		 * 1355367600);//msg.getEndTime() //statement.setInt(4, 11); //
		 * bookingID statement.setString(4, null);
		 * 
		 * statement.setInt(5, 74699489); //msg.getUserId() statement.setInt(6,
		 * 74699489); //msg.getAccountId() statement.setInt(7, 74699489); //
		 * msg.getGroupId() statement.setInt(8, 251);//msg.getUserRight()
		 * statement.setInt(9, 1012214032);// msg.getCardSerial()
		 * statement.setInt(10, 65537);//msg.getInstrumentId()
		 * statement.setInt(11, 0); statement.setInt(12, 1);
		 * statement.setInt(13, 0);
		 * 
		 * statement.setString(14, null); // 若其他地方 statement.setString(15,
		 * null);
		 */

    }

    @Override
    int getDataID() { // 获取消息ID
        return dataID;
    }

    @Override
    byte[] getMsgBytes() {
        return msg.toByteArray();
    }

}

// 使用记录列表——最近一条管理员使用记录，最近一条普通用户使用记录
class DataClientSessionListLast extends DataRecv {
    static final int dataID = MessageType.SESSIONLIST.getNumber();
    SessionList msg = null;

    DataClientSessionListLast(SessionList aMsg) {

        this.msg = aMsg;
    }

    static DataClientSessionListLast checkContent(final byte[] buffer)
            throws InvalidProtocolBufferException {// 解码
        SessionList msg = SessionList.parseFrom(buffer);
        System.out.println("最近使用记录，列表条数：" + msg.getSessionCount());
        return new DataClientSessionListLast(msg);
    }

    @Override
    int getDataID() { // 获取消息ID
        return dataID;
    }
}

// 培训用户列表
class DataUserInTrainingList extends DataSend {
    static final int dataID = MessageType.USERINTRAININGLIST.getNumber();
    UserInTrainingList msg = null;

    DataUserInTrainingList(UserInTrainingList aMsg) {
        this.msg = aMsg;
    }

    static DataUserInTrainingList getInstance() {
        UserInTrainingList.Builder msgBuilder = UserInTrainingList.newBuilder();
        return new DataUserInTrainingList(msgBuilder.addUserInTraining(
                UserInTraining.newBuilder().setCardSerial(1).setCheckInTime(9)
                        .setSessionId(9).setUserId(89)).build());
    }

    @Override
    int getDataID() { // 获取消息ID
        return dataID;
    }

    @Override
    byte[] getMsgBytes() {
        return msg.toByteArray();
    }

}

// 刷卡机用户事件列表
class DataUserEventList extends DataSend {
    static final int dataID = MessageType.USEREVENTLIST.getNumber();
    private UserEventList msg = null;

    private DataUserEventList(UserEventList aMsg) {
        this.msg = aMsg;
    }

    static DataUserEventList getInstance() {
        UserEventList.Builder msgBuilder = UserEventList.newBuilder();
        for (int i = 0; i < 1; i++) {
            msgBuilder.addUserEvent(UserEvent.newBuilder().setId(6)
                            .setInstrumentId(65538).setUserId(2).setCardSerial(3)
                            .setCardType(1).setActionType(1453).setActionResult(2)
                            .setCreateTime(1)
                    // .setGroupId(2)
            );

        }
        return new DataUserEventList(msgBuilder.build());

    }

    @Override
    int getDataID() { // 获取消息ID
        return dataID;
    }

    @Override
    byte[] getMsgBytes() {
        return msg.toByteArray();
    }

}

//刷卡机用户事件列表——最新一条
class DataUserEventListLast extends DataRecv {
    static final int dataID = MessageType.USEREVENTLIST.getNumber();
    UserEventList msg = null;

    DataUserEventListLast(UserEventList aMsg) {

        this.msg = aMsg;
    }

    static DataUserEventListLast checkContent(final byte[] buffer)
            throws InvalidProtocolBufferException {// 解码
        UserEventList msg = UserEventList.parseFrom(buffer);
        System.out.println("最近一条用户事件，列表条数：" + msg.getUserEventCount());
        return new DataUserEventListLast(msg);
    }

    @Override
    int getDataID() { // 获取消息ID
        return dataID;
    }
}

// 刷卡机系统事件列表
class DataSystemEventList extends DataSend {
    static final int dataID = MessageType.SYSTEMEVENTLIST.getNumber();
    private SystemEventList msg = null;

    private DataSystemEventList(SystemEventList aMsg) {
        this.msg = aMsg;
    }

    static DataSystemEventList getInstance() {
        SystemEventList.Builder msgBuilder = SystemEventList.newBuilder();
        for (int i = 0; i < 1; i++) {
            msgBuilder.addSystemEvent(SystemEvent.newBuilder().setCreateTime(0)
                    //.setEventContent(231).setEventType(1475) // 使用状态变更
                    //.setId((int)(System.currentTimeMillis()/1000)).setInstrumentId(SSLClient.instrumentID));
                    .setEventContent(281475125109827L).setEventType(1491) // 使用时间超长
                    .setId((int) (System.currentTimeMillis() / 1000)).setInstrumentId(SSLClient.instrumentID));
        }
        return new DataSystemEventList(msgBuilder.build());

    }

    @Override
    int getDataID() { // 获取消息ID
        return dataID;
    }

    @Override
    byte[] getMsgBytes() {
        return msg.toByteArray();
    }

}

//刷卡机系统事件列表——最新一条
class DataSystemEventListLast extends DataRecv {
    static final int dataID = MessageType.SYSTEMEVENTLIST.getNumber();
    SystemEventList msg = null;

    DataSystemEventListLast(SystemEventList aMsg) {

        this.msg = aMsg;
    }

    static DataSystemEventListLast checkContent(final byte[] buffer)
            throws InvalidProtocolBufferException {// 解码
        SystemEventList msg = SystemEventList.parseFrom(buffer);
        System.out.println("最近一条系统事件，列表条数：" + msg.getSystemEventCount());
        return new DataSystemEventListLast(msg);
    }

    @Override
    int getDataID() { // 获取消息ID
        return dataID;
    }
}

// 仪器详细参数
class DataInstrumentDetail extends DataRecv {
    static final int dataID = MessageType.INSTRUMENTDETAIL.getNumber();
    InstrumentDetail msg = null;

    DataInstrumentDetail(InstrumentDetail aMsg) {

        this.msg = aMsg;
    }

    static DataInstrumentDetail checkContent(final byte[] buffer)
            throws InvalidProtocolBufferException {// 解码
        InstrumentDetail msg = InstrumentDetail.parseFrom(buffer);
        System.out.println("仪器详细参数");
        return new DataInstrumentDetail(msg);
    }

    @Override
    int getDataID() {
        return dataID;
    }

}

// 仪器全局设置
class DataGlobalConfig extends DataRecv {
    static final int dataID = MessageType.GLOBALCONFIG.getNumber();
    GlobalConfig msg = null;

    DataGlobalConfig(GlobalConfig aMsg) {
        this.msg = aMsg;
    }

    static DataGlobalConfig checkContent(final byte[] buffer)
            throws InvalidProtocolBufferException {// 解码
        GlobalConfig msg = GlobalConfig.parseFrom(buffer);
        System.out.println("仪器全局设置");
        return new DataGlobalConfig(msg);
    }

    @Override
    int getDataID() {
        return dataID;
    }

}

// 仪器专享时间列表
class DataReservationList extends DataRecv {
    static final int dataID = MessageType.RESERVATIONLIST.getNumber();
    ReservationList msg = null;

    DataReservationList(ReservationList aMsg) {
        this.msg = aMsg;
    }

    static DataReservationList checkContent(final byte[] buffer)
            throws InvalidProtocolBufferException {// 解码
        ReservationList msg = ReservationList.parseFrom(buffer);
        System.out.println("仪器专享时间列表，条数：" + msg.getReservationCount());
        return new DataReservationList(msg);
    }

    @Override
    int getDataID() {
        return dataID;
    }

}

// 临时卡关联列表
class DataTempCardBindingList extends DataRecv {
    static final int dataID = MessageType.TEMPCARDBINDINGLIST.getNumber();
    TempCardBindingList msg = null;

    DataTempCardBindingList(TempCardBindingList aMsg) {
        this.msg = aMsg;

    }

    static DataTempCardBindingList checkContent(final byte[] buffer)
            throws InvalidProtocolBufferException {// 解码
        TempCardBindingList msg = TempCardBindingList.parseFrom(buffer);

        System.out.println("临时卡列表条数：" + msg.getTempCardBindingCount());
        for (int i = 0; i < msg.getTempCardBindingCount(); i++) {
            // System.out.println("临时卡卡号："
            // + msg.getTempCardBinding(i).getCardSerial());
        }
        return new DataTempCardBindingList(msg);
    }

    @Override
    int getDataID() {
        return dataID;
    }

}

// 用户列表
class DataUserList extends DataRecv {
    static final int dataID = MessageType.USERLIST.getNumber();
    UserList msg = null;

    DataUserList(UserList aMsg) {
        this.msg = aMsg;

    }

    static DataUserList checkContent(final byte[] buffer)
            throws InvalidProtocolBufferException {// 解码
        UserList msg = null;

        msg = UserList.parseFrom(buffer);

        System.out.println("用户列表条数：" + msg.getUserCount());
        for (int i = 0; i < msg.getUserCount(); i++) {
            System.out.println("用户ID：" + msg.getUser(i).getId()+"用户名称：" + msg.getUser(i).getFirstName() + msg.getUser(i).getLastName());
            System.out.println("------------------------------------------------------------------------------");
        }

        return new DataUserList(msg);
    }

    @Override
    int getDataID() {
        return dataID;
    }

}

// 资格列表
class DataUserRightList extends DataRecv {
    static final int dataID = MessageType.USERRIGHTLIST.getNumber();
    UserRightList msg = null;

    DataUserRightList(UserRightList aMsg) {
        this.msg = aMsg;

    }

    static DataUserRightList checkContent(final byte[] buffer)
            throws InvalidProtocolBufferException {// 解码
        UserRightList msg = UserRightList.parseFrom(buffer);

        System.out.println("资格列表条数：" + msg.getUserRightCount());
        for (int i = 0; i < msg.getUserRightCount(); i++) {
            // System.out.println("用户ID：" + msg.getUserRight(i).getUserId());
            // System.out.println("资格：" + msg.getUserRight(i).getRight());
        }
        return new DataUserRightList(msg);
    }

    @Override
    int getDataID() {
        return dataID;
    }

}

// 账户列表
class DataAccountList extends DataRecv {
    static final int dataID = MessageType.ACCOUNTLIST.getNumber();
    AccountList msg = null;

    private DataAccountList(AccountList aMsg) {
        this.msg = aMsg;
    }

    static DataAccountList checkContent(final byte[] buffer)
            throws InvalidProtocolBufferException {// 解码
        AccountList msg = AccountList.parseFrom(buffer);

        System.out.println("账户列表条数：" + msg.getAccoutCount());
        for (int i = 0; i < msg.getAccoutCount(); i++) {
            // System.out.println("账户ID：" + msg.getAccout(i).getId());
        }
        return new DataAccountList(msg);
    }

    @Override
    int getDataID() {
        return dataID;
    }

}

// 预约记录列表
class DataBookingList extends DataRecv {
    static final int dataID = MessageType.BOOKINGLIST.getNumber();
    BookingList msg = null;

    DataBookingList(BookingList aMsg) {
        this.msg = aMsg;

    }

    static DataBookingList checkContent(final byte[] buffer)
            throws InvalidProtocolBufferException {// 解码
        BookingList msg = BookingList.parseFrom(buffer);

        System.out.println("预约列表条数：" + msg.getBookingCount());
        for (int i = 0; i < msg.getBookingCount(); i++) {
            // System.out.println("预约ID：" + msg.getBooking(i).getId());
        }
        return new DataBookingList(msg);
    }

    @Override
    int getDataID() {
        return dataID;
    }

    void getMsgBookingID(Queue<Integer> aBookingIDList) {
        for (int i = 0; i < msg.getBookingCount(); i++) {
            aBookingIDList.offer(Integer.valueOf(msg.getBooking(i).getId()));
        }
    }

}

// 日历列表
class DataCalendarList extends DataRecv {
    static final int dataID = MessageType.CALENDARLIST.getNumber();
    CalendarList msg = null;

    DataCalendarList(CalendarList aMsg) {
        this.msg = aMsg;

    }

    static DataCalendarList checkContent(final byte[] buffer)
            throws InvalidProtocolBufferException {// 解码
        CalendarList msg = CalendarList.parseFrom(buffer);

        System.out.println("日历列表条数：" + msg.getCalendarCount());
        for (int i = 0; i < msg.getCalendarCount(); i++) {
            // System.out.println("日期：" + msg.getCalendar(i).getDay());
        }
        return new DataCalendarList(msg);
    }

    @Override
    int getDataID() {
        return dataID;
    }

}

class Log {
    // debug 输出一行string
    // // 正常运行时关闭
    public static void println(String str) {
        boolean state = true;
        // state = false;
        if (true == state) {
            SimpleDateFormat timeFormat = new SimpleDateFormat(
                    "yyyy-MM-dd HH:mm:ss SSS");
            String curTime = timeFormat.format(new java.util.Date());
            System.out.println(curTime + " " + str + "--" + getTraceInfo());

            // ??代码不安全，涉及并发可能会出问题
            // 获得文件大小可用file
			/*
			try {
				OutputStreamWriter fis = new OutputStreamWriter(
						new FileOutputStream("./log/Log-Client-" + SSLClient.instrumentID, true),
						PropertyManager.CharSet);
				fis.write(curTime + " " + str + "--" + getTraceInfo() + "\n");
				fis.close();
				fis = null;
			} catch (Exception e) {
				e.printStackTrace();
			}
			*/
        }

    }
    public static String byte2hex(byte[] b,int offset,int len) {
        String hs="";
        String stmp="";
        for (int n=offset;n<len;n++){
            stmp=(java.lang.Integer.toHexString(b[n] & 0XFF));
            if (stmp.length()==1)
                hs=hs+"0"+stmp;
            else hs=hs+stmp;
        }
        return hs.toUpperCase();
    }

    public static void printBytes(byte[] buffer, int offset, int length) {
        SimpleDateFormat timeFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss SSS");
        String curTime = timeFormat.format(new java.util.Date());
        String  info = byte2hex(buffer,offset,length);
        System.out.println(curTime + " Byte数组: " + info + "数据长度：" + length);
    }

    // 获取被调函数信息
    private static String getTraceInfo() { // 安全性有待验证？？
        StringBuffer sb = new StringBuffer();

        StackTraceElement[] stacks = new Throwable().getStackTrace();
        if (2 <= stacks.length) {
            StackTraceElement ste = stacks[2]; // 上上一个调用者的信息（不能直接被main调用）//
            // 有没有可能越界？？
            sb.append("--").append(ste.getClassName()).append(".")
                    .append(ste.getMethodName()).append("--")
                    .append(ste.getFileName()).append(":")
                    .append(ste.getLineNumber());
            return sb.toString();
        } else {
            return null;
        }

    }

}

class PropertyManager { // 配置文件管理
    final static String CharSet = "UTF-8"; // 服务器统一编码
    private static final String filePath = ResourcePath.getSlarkConfigureFile("config/Config.properties");

    static String getProtery(String key, String defaultValue) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Log.println(e.getMessage());
            Log.println("找不到文件:" + filePath);
            return defaultValue;
        }
        Properties p = new Properties();
        try {
            p.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            Log.println(e.getMessage());
            Log.println("打开配置文件失败");
            return defaultValue;
        }
        return p.getProperty(key, defaultValue);
    }

    static int getInt(final String aKey, final int aNum) {
        String strNum = PropertyManager.getProtery(aKey, Integer.toString(aNum));
        int newNum = aNum;
        try {
            newNum = Integer.parseInt(strNum);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            Log.println(e.getMessage());
            newNum = aNum;
        }
        return newNum;
    }

    static void setProtery(String aKey, String aDefaultValue) {
        PropertyManager.setProtery(aKey, aDefaultValue, PropertyManager.filePath);
    }

    static void setProtery(String aKey, String aDefaultValue, final String aFilePath) {
        try {
            Properties p = new Properties();
            // load
            FileInputStream inputStream = new FileInputStream(aFilePath);
            p.load(inputStream);
            inputStream.close();
            // set
            p.setProperty(aKey, aDefaultValue);
            // store
            FileOutputStream outputStream = new FileOutputStream(aFilePath);
            p.store(outputStream, null);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            Log.println(e.toString());
        }
    }
}

// 超时定时器
// //基于系统时间查询实现
class TimeOutTimer {
    final long IntervalMillis;
    long timeOutTimeMillis = 0;

    TimeOutTimer(final long aIntervalMillis) {
        this.IntervalMillis = aIntervalMillis;
        this.timeOutTimeMillis = System.currentTimeMillis()
                + this.IntervalMillis;
    }

    boolean getTimeOutState() {
        if (System.currentTimeMillis() > this.timeOutTimeMillis) {
            return true;
        } else {
            return false;
        }
    }

    void resetTimer() {
        this.timeOutTimeMillis = System.currentTimeMillis()
                + this.IntervalMillis;
    }
}

// 信任一切证书到类
class MyX509TrustManager implements X509TrustManager {
    public void checkClientTrusted(X509Certificate[] arg0, String arg1)
            throws CertificateException {
    }

    public void checkServerTrusted(X509Certificate[] arg0, String arg1)
            throws CertificateException {
    }

    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}

class Int32Num {
    private int value = 0;

    void setValue(int aNum) {
        this.value = aNum;
    }

    int getValue() {
        return this.value;
    }

}