package com.slark.pengder.tools;

import com.google.protobuf.GeneratedMessageLite;
import com.slark.SlarkContext;
import com.slark.pengder.comm.UtilCheck;
import com.slark.pengder.mybatis.dao.*;
import com.slark.pengder.mybatis.model.*;
import com.slark.pengder.net.Appliance;
import com.slark.pengder.protocol.MessageProtos;
import com.slark.pengder.protocol.PengderMessage;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by fengwei on 16/7/13.
 */
@Component("syncDataList")
public class QuerySyncDataOpr {

    private static final Logger logger = Logger.getLogger(QuerySyncDataOpr.class);

    @Autowired
    private TuserMapper userMapper;

    @Autowired
    private TaccountMapper accountMapper;

    @Autowired
    private TuserrightMapper userrMapper;

    @Autowired
    private TtemporarycardbindingMapper tempcarMapper;

    @Autowired
    private TinstrumentMapper tinsMapper;

    @Autowired
    private TinstrumentreservationMapper treservationMapper;

    @Autowired
    private TbookingrecordMapper   bookingMapper;

    @Autowired
    private TcalendarMapper calendarMapper;

    @Autowired
    private  TglobalconfigMapper  globalMapper;

    @Autowired
    private TneedsyndataMapper  needSyncMapper;

    @Autowired
    private TusereventofterminalMapper  userEventMapper;
    /**
     * @Description 构造函数
     */
    public QuerySyncDataOpr() {
    }

    public List<PengderMessage> getDataList(EUpdateType type,Appliance app){
        switch (type) {
        case UserList:
            return this.selectUserList(app.getApplianceID(),app.isSyncInitData()?false:true);
        case AccountList:
            return this.selectAccountList(app.getApplianceID(),app.isSyncInitData()?false:true);
        case UserRightList:
            return this.selectUserRightList(app.getApplianceID(),app.isSyncInitData()?false:true);
        case TempCardBindingList:
            return this.selectTempCardBindingList(app.getApplianceID(),app.isSyncInitData()?false:true);
        case InstrumentDetail:
            return this.selectInstrumentDetail(app.getApplianceID(),app.isSyncInitData()?false:true);
        case ReservationList:
            return this.selectReservationList(app.getApplianceID(),app.isSyncInitData()?false:true);
        case BookingList:
            return this.selectBookingList(app.getApplianceID(),app.isSyncInitData()?false:true);
        case CalendarList:
            return this.selectCalendarList(app.getApplianceID(),app.isSyncInitData()?false:true);
        case GlobalConfig:
            return this.selectGlobalConfig(app.getApplianceID(),app.isSyncInitData()?false:true,app);
        default:
            return null;
        }
    }
    
    /**
     * @param id
     * @param forInit
     * @return
     * @Description
     */
    public List<PengderMessage> selectUserList(long id, boolean forInit) {
        List<Tuser> result = null;
        List<PengderMessage> res = null;
        Integer newUpdateTick = UtilCheck.caseToSecond(new Date());
        MessageProtos.UserList.Builder msgList = MessageProtos.UserList.newBuilder();

        Subpackage<MessageProtos.User,
                MessageProtos.UserList,
                MessageProtos.UserList.Builder>  sub = null;
        /**
         * 查询
         */
        if (forInit) {
            result = userMapper.select104();
        } else {
            result = userMapper.select311((int) id);
        }
        /**
         * 如果是空的
         */
        if (result.isEmpty()) {
            return null;
        }

        for (Tuser u : result) {
        	
        	if(u == null){
                logger.warn("用户数据异常，user is null");
                continue;
        	}
        	
        	if(u.getId() == null){
                logger.warn("用户数据异常，Id is null");
                continue;
        	}
        	
            MessageProtos.User.Builder user = MessageProtos.User.newBuilder();

            user.setId(u.getId());
            user.setStatus(u.getUserstate());

            if (u.getFirstname() != null) {
                user.setFirstName(u.getFirstname());
            } else {
                logger.warn("用户数据异常，FirstName is null" + "用户id : " + u.getId());
                continue;
            }

            if (u.getLastname() != null) {
                user.setLastName(u.getLastname());
            } else {
                logger.warn("用户数据异常，Lastname is null" + "用户id : " + u.getId());
                continue;
            }

            if (u.getMobilephone1() != null) {
                user.setPhone(u.getMobilephone1());
            } else {
                logger.warn("用户数据异常，MobilePhone1 is null" + "用户id : " + u.getId());
                continue;
            }

            if (u.getCardid() != null) {
                user.setCardSerial(u.getCardid());
            }

            if (u.getActivedaccount() != null) {
                user.setAccountId(u.getActivedaccount());
            }

            user.setBlacklistExpireTime(UtilCheck.caseToSecond(u.getExpireofblack()));//(int) u.getExpireofblack().getTime());
            msgList.addUser(user);
        }



        final MessageProtos.UserList userList = msgList.build();
        final MessageProtos.UserList.Builder ulBuilder = MessageProtos.UserList.newBuilder();
        int msgNum = userList.getUserCount();
        int msgSize = userList.getSerializedSize();



        sub  = new Subpackage(msgList,new IRepeatOpr(){
            /**
             * 得到元素的个数
             *
             * @return
             */
            public int getElementCount() {
                return userList.getUserCount();
            }

            /**
             * @param i
             * @return
             * @Description 得到指定的element
             */
            public GeneratedMessageLite getElement(int i) {
                return userList.getUser(i);
            }

            /**
             * @param e
             * @Description
             */
            public void addElement(GeneratedMessageLite e) {
                ulBuilder.addUser((MessageProtos.User) e);
            }

            /**
             * 清空list
             */
            public void clear() {
                ulBuilder.clear();
            }

            /**
             *
             * @return
             */
            public GeneratedMessageLite build() {
                return ulBuilder.build();
            }

            /**
             * 清空指定的元素
             */
            public void clearElements() {
                ulBuilder.clearUser();
            }

            /**
             * @return
             * @Description 得到临时容器的个数
             */

            public int getTemporyCount() {
                return ulBuilder.getUserCount();
            }
        });
        /**
         * 做分包处理
         */
        res =  sub.splitPackage(newUpdateTick,MessageProtos.MessageType.USERLIST.getNumber());
        return res;
    }

    /**
     * @param id
     * @param forInit
     * @return
     * @Description
     */
    public List<PengderMessage> selectAccountList(long id, boolean forInit) {
        Integer newUpdateTick = UtilCheck.caseToSecond(new Date());
        MessageProtos.AccountList.Builder msgBuilder = MessageProtos.AccountList.newBuilder();
        List<Taccount> result = null;
        List<PengderMessage> res = new ArrayList<PengderMessage>();

        if (forInit) {
            TaccountExample acctex = new TaccountExample();
            //taccountExample.createCriteria().andAccounttypeEqualTo(Short.valueOf("152")).andStateEqualTo(Short.valueOf("161"));
			acctex.createCriteria()
					.andAccounttypeEqualTo(Integer.valueOf(152).shortValue())
					.andStateEqualTo(Integer.valueOf(161).shortValue());
            result = this.accountMapper.selectByExample(acctex);
        } else {
            result = accountMapper.select312((int) id);
        }

        if (result.isEmpty()) {
            return null;
        }
        /**
         *循环读出所有的数据
         */
        for (Taccount acct : result) {
            MessageProtos.Account.Builder account = MessageProtos.Account.newBuilder();
            account.setId(acct.getId())
                    .setStatus(acct.getState())
                    .setDeposit(acct.getMoney().intValue())
                    .setCredit(acct.getInitcredit().intValue())
                    .setCreditTemp(acct.getNewcredit().intValue())
                    .setCreditTempExpireTime(UtilCheck.caseToSecond(acct.getInspiretime()));//(int) acct.getInspiretime().getTime());

            Integer gid = acct.getResearchgroupid();
            if (gid == null) {
                logger.warn("*账户没有所属课题组，不发给客户端");
                continue;
            } else {
                account.setGroupId(gid.intValue());
            }
            msgBuilder.addAccout(account);
        }


        final MessageProtos.AccountList acctlist = msgBuilder.build();
        final MessageProtos.AccountList.Builder ulBuilder = MessageProtos.AccountList.newBuilder();

        Subpackage<MessageProtos.Account,
                MessageProtos.AccountList,
                MessageProtos.AccountList.Builder>  sub = null;

        sub  = new Subpackage(msgBuilder,new IRepeatOpr(){
            /**
             * 得到元素的个数
             *
             * @return
             */

            public int getElementCount() {
                return acctlist.getAccoutCount();
            }

            /**
             * @param i
             * @return
             * @Description 得到指定的element
             */

            public GeneratedMessageLite getElement(int i) {
                return acctlist.getAccout(i);
            }

            /**
             * @param e
             * @Description
             */

            public void addElement(GeneratedMessageLite e) {
                ulBuilder.addAccout((MessageProtos.Account)e);
            }

            /**
             * 清空list
             */

            public void clear() {
                ulBuilder.clear();
            }

            /**
             * 清空指定的元素
             */

            public void clearElements() {
                ulBuilder.clearAccout();
            }

            /**
             * @return
             */

            public GeneratedMessageLite build() {
                return ulBuilder.build();
            }

            /**
             * @return
             * @Description 得到临时容器的个数
             */

            public int getTemporyCount() {
                return ulBuilder.getAccoutCount();
            }
        });

        res  = sub.splitPackage(newUpdateTick,MessageProtos.MessageType.ACCOUNTLIST.getNumber());
        return res;
    }

    /**
     * @param id
     * @param forInit
     * @return
     * @Description
     */
    public List<PengderMessage> selectUserRightList(long id, boolean forInit) {
        Integer newUpdateTick = UtilCheck.caseToSecond(new Date());
        TuserrightExample  example = new TuserrightExample();
        example.createCriteria().andInstrumentidEqualTo((int)id);

        List<Tuserright>   result = null;
        if(forInit == true){
            result =this.userrMapper.selectByExample(example);
        }
        else {
            result = this.userrMapper.selectNewByExample(example);
        }

        /**
         * 判断一下
         */
        if(result == null || result.isEmpty()){
            logger.warn("查询userRight 列表失败。设备id : " + id);
            return null;
        }

        MessageProtos.UserRightList.Builder  urlBuilder = MessageProtos.UserRightList.newBuilder();


        for(Tuserright  ur : result){
            MessageProtos.UserRight.Builder  builder =  MessageProtos.UserRight.newBuilder();
            builder.setUserId(ur.getUserid())
                    .setRight(ur.getUserrightid())
                    .setRightTemp(ur.getTemporaryrightid())
                    .setRightTempExpireTime(UtilCheck.caseToSecond(ur.getExpiretime()));//(int)ur.getExpiretime().getTime());
            urlBuilder.addUserRight(builder);
        }

        final MessageProtos.UserRightList  urlist = urlBuilder.build();
        final MessageProtos.UserRightList.Builder tmpBuilder = MessageProtos.UserRightList.newBuilder();

        Subpackage<MessageProtos.UserRight,MessageProtos.UserRightList,MessageProtos.UserRightList.Builder>  sub = null;

        /**
         * 生成这个类
         */
        sub = new Subpackage(urlBuilder, new IRepeatOpr() {

            public int getElementCount() {
                return urlist.getUserRightCount();
            }


            public GeneratedMessageLite getElement(int i) {
                return urlist.getUserRight(i);
            }


            public void addElement(GeneratedMessageLite e) {
                tmpBuilder.addUserRight((MessageProtos.UserRight) e);
            }


            public void clear() {
                tmpBuilder.clear();
            }


            public void clearElements() {
                tmpBuilder.clearUserRight();
            }


            public GeneratedMessageLite build() {
                return tmpBuilder.build();
            }


            public int getTemporyCount() {
                return tmpBuilder.getUserRightCount();
            }
        });

        List<PengderMessage> res = sub.splitPackage(newUpdateTick, MessageProtos.MessageType.USERRIGHTLIST.getNumber());
        return res;
    }

    /**
     * @param id
     * @param forInit
     * @return
     * @Description
     */
    public List<PengderMessage> selectTempCardBindingList(long id, boolean forInit) {
        Integer newUpdateTick = UtilCheck.caseToSecond(new Date());

        TtemporarycardbindingExample  example = new TtemporarycardbindingExample();
        example.createCriteria().andInstrumentidEqualTo((int) id);
        List<Ttemporarycardbinding> result = null;

        if(forInit){
            result = this.tempcarMapper.selectByExample(example);
        }else {
            result = this.tempcarMapper.selectNewByExample(example);
        }

        if(result == null || result.isEmpty()){
            logger.warn("查询临时卡列表为空, 设备id : " + id);
            return null;
        }

        MessageProtos.TempCardBindingList.Builder msgBuilder = MessageProtos.TempCardBindingList.newBuilder();

        for(Ttemporarycardbinding  card : result){
            MessageProtos.TempCardBinding.Builder  cardBuilder = MessageProtos.TempCardBinding.newBuilder();
            cardBuilder.setUserId(card.getUserid())
                    .setActiveTime(UtilCheck.caseToSecond(card.getStarttime()))
                    .setExpireTime(UtilCheck.caseToSecond(card.getEndtime()))
                    .setCardSerial(card.getCardnumberid())
                    .setId(card.getId());
            msgBuilder.addTempCardBinding(cardBuilder);
        }

        final  MessageProtos.TempCardBindingList  cardList = msgBuilder.build();
        final  MessageProtos.TempCardBindingList.Builder tmpBuilder=MessageProtos.TempCardBindingList.newBuilder();


        Subpackage<MessageProtos.TempCardBinding,
                MessageProtos.TempCardBindingList,
                MessageProtos.TempCardBindingList.Builder> sub = null;

        sub = new Subpackage(msgBuilder, new IRepeatOpr() {

            public int getElementCount() {
                return cardList.getTempCardBindingCount();
            }


            public GeneratedMessageLite getElement(int i) {
                return cardList.getTempCardBinding(i);
            }


            public void addElement(GeneratedMessageLite e) {
                tmpBuilder.addTempCardBinding((MessageProtos.TempCardBinding)e);
            }


            public void clear() {
                tmpBuilder.clear();
            }


            public void clearElements() {
                tmpBuilder.clearTempCardBinding();
            }


            public GeneratedMessageLite build() {
                return tmpBuilder.build();
            }


            public int getTemporyCount() {
                return tmpBuilder.getTempCardBindingCount();
            }
        });

        List<PengderMessage> res = sub.splitPackage(newUpdateTick, MessageProtos.MessageType.TEMPCARDBINDINGLIST.getNumber());
        return res;
    }

    /**
     * @description 查询仪器列表
     * @return
     */
    public List<PengderMessage> selectInstrumentList(){
        MessageProtos.InstrumentList.Builder aMsgListBuilder = MessageProtos.InstrumentList.newBuilder();
        TinstrumentExample  example = new TinstrumentExample();
        example.createCriteria().andInstrumentstatusidEqualTo(Short.valueOf("231")).andTerminalmacEqualTo("00:00:00:00:00:00");

        List<Tinstrument>  result = tinsMapper.selectByExample(example);

        if(result == null){
            logger.error("查询仪器列表失败");
            return null;
        }

        for(Tinstrument tin : result) {
            aMsgListBuilder.addInstrument(MessageProtos.Instrument.newBuilder() //
                    .setId(tin.getId()) // 仪器ID
                    .setName(tin.getName())); // 仪器名称
        }

        List<PengderMessage>  res = new ArrayList<PengderMessage>();
        PengderMessage msg = new PengderMessage();
        msg.setMsgId(MessageProtos.MessageType.INSTRUMENTLIST.getNumber());
        msg.setMsg(aMsgListBuilder.build());
        msg.setNeedReply(false);
        res.add(msg);
        return res;
    }
    /**
     * @param id
     * @param forInit
     * @return
     * @Description
     */
    public List<PengderMessage> selectInstrumentDetail(long id, boolean forInit) {

        Integer newUpdateTick = UtilCheck.caseToSecond(new Date());
        MessageProtos.InstrumentDetail.Builder  builder = MessageProtos.InstrumentDetail.newBuilder();
        Tinstrument  tins = null;

        if(forInit == false) {
        	TinstrumentExample example = new TinstrumentExample();
        	example.createCriteria().andIdEqualTo((int)id);
        	List<Tinstrument> result= tinsMapper.selectNewByExample(example);
        	if(result == null || result.isEmpty()){
        		logger.warn("设备" + id + "不需要同步");
                return null;
            }
        	tins = result.get(0);
        }else{
        	tins = tinsMapper.selectByPrimaryKey((int)id);
        }

        if(tins == null){
            logger.warn("查询设备" + id + "详细资料失败");
            return null;
        }
        
        List<PengderMessage>   res = new ArrayList<PengderMessage>();
        PengderMessage  msg = new PengderMessage();

        builder.setId((int)id)
                .setName(tins.getName())
                .setStatus(tins.getInstrumentstatusid())
                .setMinInterval(tins.getMininterval())
                .setBookingHoldingTime(tins.getBookingholdingtime())
                .setAlertTime(tins.getAlerttime())
                .setOffDelayTime(tins.getOffdelaytime())
                .setMinOffTime(tins.getMinofftime())
                .setAlertCurrent(tins.getAlertcurrent().intValue());

        msg.setMsg(builder.build());
        msg.setMsgId(MessageProtos.MessageType.INSTRUMENTDETAIL.getNumber());
        msg.setUpdateNum(newUpdateTick);
        res.add(msg);

        return res;
    }

    /**
     * @param id
     * @param forInit
     * @return
     * @Description
     */
    public List<PengderMessage> selectReservationList(long id, boolean forInit) {
        Integer newUpdateTick = UtilCheck.caseToSecond(new Date());
        List<Tinstrumentreservation>   result = null;
        TinstrumentreservationExample   example  = new TinstrumentreservationExample();

        example.createCriteria().andInstrumentidEqualTo((int)id);

        if(forInit) {
            result = treservationMapper.selectByExample(example);
        }else {
            result = treservationMapper.selectNewByExample(example);
        }

        if(result == null || result.isEmpty()){
            logger.warn("查询ReservationList失败。设备标示: " + id);
            return null;
        }

        MessageProtos.ReservationList.Builder  msgBuilder = MessageProtos.ReservationList.newBuilder();

        for(Tinstrumentreservation  r : result){
            MessageProtos.Reservation.Builder rb = MessageProtos.Reservation.newBuilder();
            rb.setId(r.getId())
                    .setGroupId(r.getGroupid())
                    .setWeek(r.getDayofweek())
                    .setStartTime(UtilCheck.caseToSecond(r.getStarttime()))
                    .setEndTime(UtilCheck.caseToSecond(r.getEndtime()))
                    .setActiveTime(UtilCheck.caseToSecond(r.getActivetime()))
                    .setExpireTime(UtilCheck.caseToSecond(r.getExpiretime()));

            if(r.getDeletedtime() != null){
                rb.setDeleteTime(UtilCheck.caseToSecond(r.getDeletedtime()));
            }
            msgBuilder.addReservation(rb);
        }


        final MessageProtos.ReservationList.Builder tmpBuilder = MessageProtos.ReservationList.newBuilder();
        final MessageProtos.ReservationList  rlist = msgBuilder.build();


        Subpackage<MessageProtos.Reservation,
                MessageProtos.ReservationList,
                MessageProtos.ReservationList.Builder> sub = null;


        sub = new Subpackage(msgBuilder, new IRepeatOpr() {

            public int getElementCount() {
                return rlist.getReservationCount();
            }


            public GeneratedMessageLite getElement(int i) {
                return rlist.getReservation(i);
            }


            public void addElement(GeneratedMessageLite e) {
                tmpBuilder.addReservation((MessageProtos.Reservation) e);
            }


            public void clear() {
                tmpBuilder.clear();
            }


            public void clearElements() {
                tmpBuilder.clearReservation();
            }


            public GeneratedMessageLite build() {
                return tmpBuilder.build();
            }


            public int getTemporyCount() {
                return tmpBuilder.getReservationCount();
            }
        });

        List<PengderMessage> res = sub.splitPackage(newUpdateTick, MessageProtos.MessageType.RESERVATIONLIST.getNumber());
        return res;
    }

    /**
     * @param id
     * @param forInit
     * @return
     * @Description
     */
    public List<PengderMessage> selectBookingList(long id, boolean forInit) {
        Integer newUpdateTick = UtilCheck.caseToSecond(new Date());

        TbookingrecordExample example = new TbookingrecordExample();
        example.createCriteria().andInstrumentidEqualTo((int)id).andStarttimeIsNotNull();

        List<Tbookingrecord>   result = null;
        if(forInit){
            result = bookingMapper.selectByExample(example);
        }else {
            result = bookingMapper.selectNewByExample(example);
        }

        if(result == null || result.isEmpty()){
            logger.warn("设备id : " + id + " 没有对应的预约记录");
            return null;
        }

        MessageProtos.BookingList.Builder msgBuilder = MessageProtos.BookingList.newBuilder();
        for(Tbookingrecord r : result){
            MessageProtos.Booking.Builder  bb = MessageProtos.Booking.newBuilder();
            bb.setId(r.getId().intValue())
                    .setUserId(r.getUserid())
                    .setStartTime(UtilCheck.caseToSecond(r.getStarttime()))
                    .setEndTime(UtilCheck.caseToSecond(r.getEndtime()))
                    .setType(r.getSessiontypeid())
                    .setStatus(r.getBookingstatusid());
            msgBuilder.addBooking(bb);
        }

        final MessageProtos.BookingList.Builder tmpBuilder = MessageProtos.BookingList.newBuilder();
        final MessageProtos.BookingList blist = msgBuilder.build();


        Subpackage<MessageProtos.Booking,
                MessageProtos.BookingList,
                MessageProtos.BookingList.Builder> sub = null;


        sub = new Subpackage(msgBuilder,new IRepeatOpr(){

            /**
             * 得到元素的个数
             *
             * @return
             */

            public int getElementCount() {
                return blist.getBookingCount();
            }

            /**
             * @param i
             * @return
             * @Description 得到指定的element
             */

            public GeneratedMessageLite getElement(int i) {
                return blist.getBooking(i);
            }

            /**
             * @param e
             * @Description
             */

            public void addElement(GeneratedMessageLite e) {
                tmpBuilder.addBooking((MessageProtos.Booking) e);
            }

            /**
             * 清空list
             */

            public void clear() {
                tmpBuilder.clear();
            }

            /**
             * 清空指定的元素
             */

            public void clearElements() {
                tmpBuilder.clearBooking();
            }

            /**
             * @return
             */

            public GeneratedMessageLite build() {
                return tmpBuilder.build();
            }

            /**
             * @return
             * @Description 得到临时容器的个数
             */

            public int getTemporyCount() {
                return tmpBuilder.getBookingCount();
            }
        });

        List<PengderMessage> res = sub.splitPackage(newUpdateTick, MessageProtos.MessageType.BOOKINGLIST.getNumber());
        return res;
    }

    /**
     * @param id
     * @param forInit
     * @return
     * @Description
     */
    public List<PengderMessage> selectCalendarList(long id, boolean forInit) {
        Integer newUpdateTick = UtilCheck.caseToSecond(new Date());
        UpdateYears newUpdateYears = new UpdateYears();

        List<Tcalendar>  result = null;

        if(forInit){
            result = calendarMapper.select1Day();
        }else{
            result = calendarMapper.selectSynDay((int)id);
        }

        if(result == null || result.isEmpty()){
            logger.warn("设备id: " + id + "不存在时钟信息");
            return null;
        }


        MessageProtos.CalendarList.Builder msgBuilder = MessageProtos.CalendarList.newBuilder();

        for(Tcalendar c  : result){
            MessageProtos.Calendar.Builder  cb = MessageProtos.Calendar.newBuilder();
            java.util.Calendar  jc = java.util.Calendar.getInstance();
            jc.setTime(c.getCalendar());

            newUpdateYears.set(jc.get(Calendar.YEAR));

            cb.setDay(jc.get(Calendar.DAY_OF_MONTH))
                    .setIsHoliday(c.getIsholiday());
            msgBuilder.addCalendar(cb);
        }


        final MessageProtos.CalendarList clist = msgBuilder.build();
        final MessageProtos.CalendarList.Builder tmpBuilder= MessageProtos.CalendarList.newBuilder();

        Subpackage<MessageProtos.Calendar,
                MessageProtos.CalendarList,
                MessageProtos.CalendarList.Builder> sub = null;


        sub = new Subpackage(msgBuilder, new IRepeatOpr() {

            public int getElementCount() {
                return clist.getCalendarCount();
            }


            public GeneratedMessageLite getElement(int i) {
                return clist.getCalendar(i);
            }


            public void addElement(GeneratedMessageLite e) {
                tmpBuilder.addCalendar((MessageProtos.Calendar)e);
            }


            public void clear() {
                tmpBuilder.clear();
            }


            public void clearElements() {
                tmpBuilder.clearCalendar();
            }


            public GeneratedMessageLite build() {
                return tmpBuilder.build();
            }

            public int getTemporyCount() {
                return tmpBuilder.getCalendarCount();
            }
        });

        List<PengderMessage>  res = sub.splitPackage(newUpdateTick, MessageProtos.MessageType.CALENDARLIST.getNumber());

        if(res != null && !res.isEmpty()){
            for(PengderMessage msg : res){
                msg.setUpdateYears(newUpdateYears);
            }
        }

        return res;
    }

    /**
     * @param id
     * @param forInit
     * @return
     * @Description
     */
    public List<PengderMessage> selectGlobalConfig(long id, boolean forInit,Appliance app) {

        if(forInit == false) {
            TneedsyndataExample example = new TneedsyndataExample();
            example.createCriteria().andNeedsyndatatypeEqualTo(Short.valueOf("319")).andTargetinstrumentidEqualTo((int)id);
            example.setDistinct(true);
            List<Tneedsyndata> res = needSyncMapper.selectNewByExample(example);
            if(res == null || res.isEmpty()){
                logger.info("当前设备 [" + id + "]没有数据需要同步");
                return null;
            }
        }

        TglobalconfigExample  example = new TglobalconfigExample();
        example.createCriteria().andStarttimeLessThan(new Date());
        example.setOrderByClause("StartTime desc limit 1");

        List<Tglobalconfig>   result = globalMapper.selectByExample(example);
        if(result == null || result.isEmpty()){
            logger.warn("当前设备 : " + id + "不存在需要同步的全局配置数据");
            return null;
        }

        Integer newUpdateTick = UtilCheck.caseToSecond(new Date());
        List<PengderMessage>  res = new ArrayList<PengderMessage>();

        if(app.getVersion() == 3){
            /*三代机*/
            MessageProtos.GlobalConfig3.Builder msgBuilder3 = MessageProtos.GlobalConfig3.newBuilder();
            for(Tglobalconfig  g : result){
                msgBuilder3.setAccountDepositLimit(g.getAccountalert().intValue())
                        .setValidTrainingCheckInTime(g.getTrainingvalidtime())
                        .setWorkingTime(g.getWorktime());


                String url = g.getClientsoftwareupdateurl();
                if(url != null){
                    msgBuilder3.setClientSoftwareUpdateUrl(url);
                }

                Byte  b = g.getClientsoftwareautoupdate();
                if(b != null){
                    msgBuilder3.setClientSoftwareAutoUpdate(b.intValue());
                }
                break;
            }

            String  tmp = SlarkContext.getProperty("pengder.commServer.ftpHost","0.0.0.0");
            logger.debug("ftp 主机地址："  + tmp);
            msgBuilder3.setFtpHost(tmp);

            tmp = SlarkContext.getProperty("pengder.commServer.ftpPort","21");
            logger.debug("ftp 主机端口号："  + tmp);
            msgBuilder3.setFtpPort(tmp);

            tmp = SlarkContext.getProperty("pengder.commServer.ftpRootUrl","");
            logger.debug("ftp 服务器根目录为："  + tmp);
            msgBuilder3.setFtpRootUrl(tmp);

            tmp = SlarkContext.getProperty("pengder.commServer.ftpUserName","root");
            logger.debug("ftp 服务器用户名称为："  + tmp);
            msgBuilder3.setFtpUserName(tmp);

            tmp = SlarkContext.getProperty("pengder.commServer.ftpPassword","123456");
            logger.debug("ftp 服务器用户密码为："  + tmp);
            msgBuilder3.setFtpPasswd(tmp);


            PengderMessage msg = new PengderMessage();
            msg.setVersion(3);
            msg.setMsgId(MessageProtos.MessageType.GLOBALCONFIG3.getNumber());
            msg.setMsg(msgBuilder3.build());
            msg.setUpdateNum(newUpdateTick);

            res.add(msg);
        }else if(app.getVersion() == 2) {
            /*二代机*/
            MessageProtos.GlobalConfig.Builder msgBuilder = MessageProtos.GlobalConfig.newBuilder();
            for(Tglobalconfig  g : result){
                msgBuilder.setAccountDepositLimit(g.getAccountalert().intValue())
                        .setValidTrainingCheckInTime(g.getTrainingvalidtime())
                        .setWorkingTime(g.getWorktime());


                String url = g.getClientsoftwareupdateurl();
                if(url != null){
                    msgBuilder.setClientSoftwareUpdateUrl(url);
                }

                Byte  b = g.getClientsoftwareautoupdate();
                if(b != null){
                    msgBuilder.setClientSoftwareAutoUpdate(b.intValue());
                }
                break;
            }


            PengderMessage msg = new PengderMessage();
            msg.setVersion(2);
            msg.setMsgId(MessageProtos.MessageType.GLOBALCONFIG.getNumber());
            msg.setMsg(msgBuilder.build());
            msg.setUpdateNum(newUpdateTick);
            res.add(msg);
        }

        return res;
    }

    /**
     * @param id
     * @return
     * @Description
     */
    public List<PengderMessage> selectUserEventListLast(long id) {


        List<Tusereventofterminal> result = null;
        TusereventofterminalExample  example = new TusereventofterminalExample();

        example.createCriteria()
                .andInstrumentidEqualTo((int)id)
                .andCreatedtimeLessThanOrEqualTo(new Date());

        example.setOrderByClause("CreatedTime DESC LIMIT 0,1");


        result = userEventMapper.selectByExample(example);

        if(result == null || result.isEmpty()){
            logger.warn("当前没有用户事件列表，设备id : " + id);
            return null;
        }

        MessageProtos.UserEventList.Builder msgBuilder = MessageProtos.UserEventList.newBuilder();
        /**
         * 只打入一条记录就可以。老代码就是这样的
         */
        for(Tusereventofterminal u : result) {
            MessageProtos.UserEvent.Builder msg = MessageProtos.UserEvent.newBuilder() //
                    .setId(u.getId()) // 记录ID
                    .setUserId(u.getUserid()) // 用户ID
                    .setCardSerial(u.getCardserial()) // 卡号
                    .setCardType(u.getCardtype()) // 卡类型
                    .setActionType(u.getActiontypeid()) // 动作类型
                    .setActionResult(u.getActionresultid()) // 动作结果
                    .setCreateTime(UtilCheck.caseToSecond(u.getCreatedtime())) // 记录创建时间
                    .setInstrumentId((int)id); // 仪器ID;
            Integer v = u.getGroupid();
            if (v != null) {
                msg.setGroupId(v.intValue()); // 用户课题组ID
            }
            msgBuilder.addUserEvent(msg);
            break;
        }

        List<PengderMessage>   res = new ArrayList<PengderMessage>();
        PengderMessage  msg = new PengderMessage();
        msg.setMsgId(MessageProtos.MessageType.USEREVENTLIST.getNumber());
        msg.setMsg(msgBuilder.build());
        res.add(msg);
        return res;
    }

    @Autowired
    private TsystemeventofterminalMapper sysEventMapper;
    /**
     * @param id
     * @return
     * @Description
     */
    public List<PengderMessage> selectSystemEventListLast(long id) {
        TsystemeventofterminalExample  example = new TsystemeventofterminalExample();
        example.createCriteria().andInstrumentidEqualTo((int)id)
                                .andCreatedtimeLessThanOrEqualTo(new Date());
        example.setOrderByClause("CreatedTime DESC LIMIT 0,1");

        List<Tsystemeventofterminal> result =  sysEventMapper.selectByExample(example);
        if(result == null || result.isEmpty()){
            logger.warn("当前设备: " + id + ",没有系统事件");
        }

        MessageProtos.SystemEventList.Builder aMsgListBuilder = MessageProtos.SystemEventList.newBuilder();
        /**
         * 只打入一条记录就可以。老代码就是这样的
         */
        for(Tsystemeventofterminal sys : result){
            MessageProtos.SystemEvent.Builder msgBuilder = MessageProtos.SystemEvent.newBuilder() //
                    .setId(sys.getId()) // 记录ID
                    .setEventType(sys.getEventtypeid()) // 事件类型
                    .setCreateTime(UtilCheck.caseToSecond(sys.getCreatedtime())) // 记录创建时间
                    .setInstrumentId((int)id) // 仪器ID
                    ;
            Long  v = sys.getEventcontent();//resultset.getString(3);
            if (v != null) {
                msgBuilder.setEventContent(v.longValue());
            }
            aMsgListBuilder.addSystemEvent(msgBuilder);
            break;
        }

        List<PengderMessage>   res = new ArrayList<PengderMessage>();
        PengderMessage  msg = new PengderMessage();
        msg.setMsgId(MessageProtos.MessageType.SYSTEMEVENTLIST.getNumber());
        msg.setMsg(aMsgListBuilder.build());
        res.add(msg);

        return res;
    }

    /**
     * @param id
     * @return
     * @Description
     */
    public List<PengderMessage> selectClientSessionListLast(long id) {
        /**
         * 用户使用记录以及管理使用记录分成两个方法
         */
        logger.debug("查询设备id： "+ id + "的使用记录");
        List mgrList = selectManagerSessionList(id);
        List uList = selectNormalUserSessionList(id);

        List<PengderMessage> res = new ArrayList<PengderMessage>();

        if(mgrList != null){
            res.addAll(mgrList);
        }

        if(uList != null){
            res.addAll(uList);
        }

        return res;
    }

    @Autowired
    private  TrecordofmanagerMapper recordMgrMapper;
    /**
     * @Decription 查询管理员使用记录
     * @param id
     * @return
     */
    public List<PengderMessage>  selectManagerSessionList(long id){

        TrecordofmanagerExample example = new TrecordofmanagerExample();
        example.createCriteria()
                .andInstrumentidEqualTo((int)id)
                .andCreatedidEqualTo(1)
                .andCreatedtimeLessThanOrEqualTo(new Date());
        example.setOrderByClause("CreatedTime DESC LIMIT 0,1");
        List<Trecordofmanager> result = null;

        result = recordMgrMapper.selectByExample(example);
        if(result == null || result.isEmpty()){
            logger.warn(" 当前设备[" + id + "]没有管理员的使用记录");
            return null;
        }

        MessageProtos.SessionList.Builder aMsgListBuilder = MessageProtos.SessionList.newBuilder();
        for(Trecordofmanager r : result) {
            aMsgListBuilder.addSession(MessageProtos.Session.newBuilder() //
                    .setId(r.getId()) // 记录ID
                    .setStartTime(UtilCheck.caseToSecond(r.getStarttime())) // 开始时间
                    .setEndTime(UtilCheck.caseToSecond(r.getEndtime())) // 结束时间
                    .setType(r.getType()) // 使用类型
                    .setUserId(r.getUserid()) // 用户ID
                    .setCardSerial(r.getCardid()) // 卡号
                    .setUserRight(0) // 用户资格
                    .setAccountId(0) // 关联账户ID
                    .setGroupId(0) // 关联课题组ID
                    .setPenaltyFlag(false) // 是否需要惩罚
                    .setInstrumentId((int)id) // 仪器ID
            );
        }

        List<PengderMessage>   res = new ArrayList<PengderMessage>();
        PengderMessage  msg = new PengderMessage();
        msg.setMsgId(MessageProtos.MessageType.SESSIONLIST.getNumber());
        msg.setMsg(aMsgListBuilder.build());
        res.add(msg);

        return res;
    }

    @Autowired
    private TrecordofuserMapper recordUserMapper;
    /**
     * @description 查询普通用户使用记录
     * @param id
     * @return
     */
    public List<PengderMessage>  selectNormalUserSessionList(long id){
        TrecordofuserExample  example = new TrecordofuserExample();
        example.createCriteria()
                .andInstrumentidEqualTo((int)id)
                .andCreatedtimeLessThanOrEqualTo(new Date());
        example.setOrderByClause("CreatedTime DESC LIMIT 0,1");

        List<Trecordofuser>  result = recordUserMapper.selectByExample(example);
        if(result == null || result.isEmpty()){
            logger.warn("当前设备[" + id + "]没有普通用户的使用记录");
            return null;
        }
        MessageProtos.SessionList.Builder aMsgListBuilder = MessageProtos.SessionList.newBuilder();
        for(Trecordofuser r : result) {
            MessageProtos.Session.Builder msgBuilder = MessageProtos.Session.newBuilder() //
                    .setId(r.getId()) // 记录ID
                    .setStartTime(UtilCheck.caseToSecond(r.getStarttime())) // 开始时间
                    .setEndTime(UtilCheck.caseToSecond(r.getEndtime())) // 结束时间
                    .setType(0) // 使用类型
                    .setUserId(r.getUserid()) // 用户ID
                    .setCardSerial(r.getCardid()) // 卡号
                    .setUserRight(0) // 用户资格
                    .setAccountId(r.getAccountid()) // 关联账户ID
                    .setGroupId(r.getGroupid()) // 关联课题组ID
                    .setPenaltyFlag(false) // 是否需要惩罚
                    .setInstrumentId((int)id) // 仪器ID
                    ;

            msgBuilder.setBookingId(0); // 关联预约记录ID
            aMsgListBuilder.addSession(msgBuilder);
				/*
				 * required int64 id = 1; // 记录ID required int32 start_time = 2;
				 * // 开始时间 required int32 end_time = 3; // 结束时间 required int32
				 * type = 4; // 使用类型 required int32 user_id = 5; // 用户ID
				 * required int32 card_serial = 6; // 卡号 required int32
				 * user_right = 7; // 用户资格 required int32 account_id = 8; //
				 * 关联账户ID required int32 group_id = 9; // 关联课题组ID optional int32
				 * booking_id = 10; // 关联预约记录ID required bool penalty_flag = 11;
				 * // 是否需要惩罚 required int32 instrument_id = 12; // 仪器ID
				 */
        }

        List<PengderMessage>   res = new ArrayList<PengderMessage>();
        PengderMessage  msg = new PengderMessage();
        msg.setMsgId(MessageProtos.MessageType.SESSIONLIST.getNumber());
        msg.setMsg(aMsgListBuilder.build());
        res.add(msg);

        return res;
    }

}
