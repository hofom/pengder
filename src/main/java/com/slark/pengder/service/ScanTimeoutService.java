package com.slark.pengder.service;

import com.slark.pengder.comm.UtilCheck;
import com.slark.pengder.net.Appliance;
import com.slark.pengder.protocol.PengderMessage;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by fengwei on 16/7/26.
 */
@Service("timeoutService")
public class ScanTimeoutService extends AbsSimpleService {
    private static final Logger  logger = Logger.getLogger(ScanTimeoutService.class);
    /**
     * @description :心跳间隔时间
     */
    @Value("${pengder.commServer.heartbeat.interval:3}")
    private int heartBeatInterval = 3;
    /**
     * 发送超时时间
     */
    @Value("${pengder.commServer.sendTimeout.maxVal:3}")
    private final int maxSendTimeout = 3;
    /**
     * 发送
     */
    @Value("${pengder.commServer.resendTimes.maxVal:10}")
    private final int maxResendTimes = 10;

    /**
     * @param param
     * @return
     * @Description 重新定义这个接口
     */
    @Override
    public List doService(Object param) {
        /**
         * 判断参数
         */
        if (param instanceof Appliance) {
            Appliance app = (Appliance) param;
            PengderMessage msg = app.getCurrMsg();

            if (msg != null && app.isSyncInitData()) {

                if (msg.isNeedReply()) {
                    /*消息的重发次数如果大于最大次数。则直接关闭链接*/
                    if (msg.getRepeatSendTimes() > maxResendTimes) {
                        logger.error("当前设备[ID:" + app.getApplianceID()
                                    + "]重发次数大于最大重发次数，该设备的链接将被抛弃,Message:" + msg );
                        app.getChannel().close();
                        msg.resetRepeatSendTimes();
                        return null;
                    }

                    final int currSecond = UtilCheck.caseToSecond(new Date());
                    final int sndTime = UtilCheck.caseToSecond(msg.getSndTime());

                    if (currSecond - sndTime > maxSendTimeout * heartBeatInterval) {
                        app.resend(msg);
                    }
                }
            }else if(msg == null  && app.isSyncInitData()){
                final  int idleSecond = app.getReadIdleTime();
                if(idleSecond > maxSendTimeout * heartBeatInterval * (maxResendTimes /2)){
                    logger.error("设备ID : " + app.getApplianceID()
                            + "已经初始化完毕，但是"
                            +idleSecond + "秒没有发送心跳数据，该设备的连接将被关闭");
                    app.getChannel().close();
                    return null;
                }
            }
        }

        return null;
    }


}
