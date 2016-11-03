package com.slark.pengder.service.receiver;

import com.slark.pengder.comm.UtilCheck;
import com.slark.pengder.mybatis.dao.ProcMapper;
import com.slark.pengder.mybatis.dao.TbookingrecordMapper;
import com.slark.pengder.mybatis.dao.TglobalconfigMapper;
import com.slark.pengder.mybatis.dao.TrecordofmanagerMapper;
import com.slark.pengder.mybatis.model.*;
import com.slark.pengder.protocol.MessageProtos;
import com.slark.pengder.protocol.PengderMessage;
import com.slark.pengder.tools.EUpdateType;
import com.slark.pengder.tools.QueryUserInfo;
import com.slark.pengder.tools.SyncDataTaskList;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created by fengwei on 16/7/20.
 */
@Service("sessionService")
public class TinSessionService extends AbsReceiverService {
    private static final Logger logger = Logger.getLogger(TinSessionService.class);

    @Autowired
    private ProcMapper procMapper;
    @Autowired
    private QueryUserInfo queryUserInfo;
    @Autowired
    private TglobalconfigMapper globalConfigMapper;
    @Autowired
    private SyncDataTaskList syncDataTaskList;
    @Autowired
    private TbookingrecordMapper bookRecordMapper;
    @Autowired
    private TrecordofmanagerMapper   mgrMapper;


    /**
     * @param msg
     * @return
     * @Description 重新定义这个接口
     */
    @Transactional
    public List<PengderMessage> doService(PengderMessage msg) {

        boolean res = updateClientSession(msg);

        if(res == false){
            return null;
        }
        /**
         * 返回数据
         */
        PengderMessage  resp = UtilCheck.newCommandMessage(MessageProtos.Command.Option.SERVER_RECV_OK.getNumber());
        /**
         * 直接发送这个消息
         */
        resp.setNeedReply(false);
        //resp.updateSendTime();
        resp.setAppliance(msg.getAppliance());
        msg.getAppliance().getChannel().writeAndFlush(resp);
        /**
         * 设置需要同步数据类型
         */
        syncDataTaskList.addEx(EUpdateType.AccountList,msg.getAppliance());
        syncDataTaskList.addEx(EUpdateType.UserList,msg.getAppliance());
        syncDataTaskList.addEx(EUpdateType.UserRightList,msg.getAppliance());
        return null;
    }


    /**
     * @param message
     * @return
     * @decription
     */
    protected boolean updateClientSession(PengderMessage message) {
        MessageProtos.SessionList sessionList = (MessageProtos.SessionList) message.getMsg();

        int cnt = sessionList.getSessionCount();

        for (int i = 0; i < cnt; i++) {
            MessageProtos.Session msg = sessionList.getSession(i);

            if (msg.getType() == 203) {
                if(!processMsgType203(msg)){
                    continue;
                }
            }
            if (msg.getType() == 201 || msg.getType() == 202 || msg.getType() == 204){
                Trecordofmanager  rmgr = new Trecordofmanager();
                rmgr.setId(msg.getId());
                rmgr.setStarttime(UtilCheck.castToDate(msg.getStartTime()));
                rmgr.setEndtime(UtilCheck.castToDate(msg.getEndTime()));
                rmgr.setBoottime((msg.getEndTime() - msg.getStartTime()) / 60);
                rmgr.setUserid(msg.getUserId());
                rmgr.setType((short)msg.getType());
                rmgr.setManualadd(false);
                rmgr.setCardid(msg.getCardSerial());
                rmgr.setInstrumentid(msg.getInstrumentId());
                rmgr.setConvertuserrecordid(null);

                Calendar  calen = Calendar.getInstance();
                Date  now = new Date();
                calen.setTime(now);
                int  year = calen.get(Calendar.YEAR);
                StringBuilder  sb = new StringBuilder();
                sb.append(year-2000);
                rmgr.setPartitionid(Byte.valueOf(sb.toString()));
                rmgr.setSyntime(now);
                rmgr.setCreatedid(1);
                rmgr.setCreatedtime(now);

                mgrMapper.replaceSelective(rmgr);
            }
        }



        return true;
    }

    /**
     * @description 出事messageType为203的消息
     * @param msg
     * @return
     */
    protected boolean processMsgType203(MessageProtos.Session msg){
        Tuser u = queryUserInfo.getUser(msg.getUserId());
/*        if (u != null) {
            logger.error("查询用户信息失败，用户id: " + msg.getUserId());
        }*/

        Map param = new HashMap();
        param.put("sessionId", msg.getId());
        param.put("startTime", msg.getStartTime());
        param.put("endTime", msg.getEndTime());
        if (msg.hasBookingId()) {
            param.put("bookingId", msg.getBookingId());
        } else {
            param.put("bookingId", null);
        }
        param.put("userId", msg.getUserId());
        param.put("accountId", msg.getAccountId());
        param.put("groupId", msg.getGroupId());
        param.put("userRight", msg.getUserRight());
        param.put("cardSerial", msg.getCardSerial());
        param.put("instrumentId", msg.getInstrumentId());
        procMapper.newRecordofuser(param);

        param.clear();

        int numSub = 0; // 待加信用分（负值表示减分）
        String strComment = " "; // 备注

        param.put("sessionId", msg.getId());
        param.put("minutes", (msg.getEndTime() - msg.getStartTime()) / 60);

        if (u != null && (121 == u.getAttritiontype() || 122 == u.getAttritiontype())) {
            //states.setInt(4, 0);// 是否需要开发票
            param.put("needInvoice", Integer.valueOf(0));
        } else {
            param.put("needInvoice", Integer.valueOf(1));
        }
                /**/
        Tglobalconfig globalConfig = null;
        if (msg.getPenaltyFlag() == true) {
            TglobalconfigExample example = new TglobalconfigExample();
            example.createCriteria().andStarttimeLessThanOrEqualTo(new Date());
            example.setOrderByClause("StartTime DESC LIMIT 0,1");

            List<Tglobalconfig> result = globalConfigMapper.selectByExample(example);
            if (result != null && result.size() >= 1) {
                globalConfig = result.get(0);
                numSub += globalConfig.getOccupydeductcredit();
            } else {
                logger.warn("查询挤占他人时间信用分扣到数额失败：" + "select OccupyDeductCredit from tglobalconfig where StartTime <=now() ORDER BY StartTime DESC LIMIT 0,1");
            }
        }
        /**
         *
         */
        if (msg.hasBookingId()) {
            Tbookingrecord book = bookRecordMapper.selectByPrimaryKey((long) msg.getBookingId());
            if (book == null) {
                logger.warn("查询查询预约时间信息失败，BookingID:" + msg.getBookingId());
            } else {
                final int dbEndTime =UtilCheck.caseToSecond(book.getEndtime());
                final int dbStartTime = UtilCheck.caseToSecond(book.getStarttime());

                final int timeUse = (dbEndTime < msg.getEndTime() ? dbEndTime : msg.getEndTime())
                        - (dbStartTime > msg.getStartTime() ? dbStartTime : msg.getStartTime()); // 使用时间与预约时间的匹配时长

                final float numRatio = ((float) (timeUse == 0? -1:timeUse)) / ((float) dbEndTime - (float) dbStartTime);

                if (globalConfig != null) {
                    if (numRatio < 0) {
                        // 失约扣分
                        strComment = "失约";
                        numSub = numSub + globalConfig.getDeductcreditmiss(); // 失约信用分
                    } else if (numRatio * 100 < globalConfig.getTimelowerlimit()) { // 匹配时长占预约时长比率小于使用时长过短阈值
                        // 使用时间过短
                        strComment = "使用时间过短";
                        numSub = numSub + (int) (globalConfig.getTimelowercredit() * (1 - numRatio) + 0.5); // 四舍五入 // 使用时间过短扣除信用分
                    } else {
                        // 正常操作，不扣分
                    }
                } else {
                    logger.warn("查询扣分数额失败：" + "select DeductCreditMiss,TimeLowerLimit,TimeLowerCredit " +
                            "from tglobalconfig where StartTime <=now() " +
                            "ORDER BY StartTime DESC LIMIT 0,1");
                }
            }
        }

        param.put("numSub", numSub);
        param.put("strComment", strComment);
        param.put("suppliesName",null);
        logger.debug("newCharginofusing param is : " + param.toString());
        procMapper.newChargingofusing(param);
        logger.info("使用记录触发计费");
        return true;
    }


}
