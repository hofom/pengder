package com.slark.pengder.task;

import com.slark.SlarkContext;
import com.slark.pengder.net.Appliance;
import com.slark.pengder.net.PengderChannelGroup;
import com.slark.pengder.protocol.PengderMessage;
import com.slark.pengder.service.AbsSimpleService;
import com.slark.pengder.tools.EState;
import com.slark.pengder.tools.EUpdateType;
import com.slark.pengder.tools.QuerySyncDataOpr;
import com.slark.pengder.tools.SyncDataTaskList;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 检查数据同步,定时发送数据同步
 * 后台定时任务
 *
 * @author HeHao
 */
@Component(value = "syncTask")
public class SyncDataTask {
    private static final Logger logger = Logger.getLogger(SyncDataTask.class);

    private ExecutorService executorService = Executors.newCachedThreadPool();

    @Autowired
    private SyncDataTaskList syncList;

    /**
     * 检查内存中数据同步任务，该任务一般有webservice、db、event等触发产生
     * 同步数据到设备,直接写通道
     */
    public void sync() {
        List<Appliance> listApp = PengderChannelGroup.defaultTerminalGroup().toApplianceList();
        for (Appliance app : listApp) {
            EUpdateType type = syncList.poll(app);
            if (type != null) {
                logger.debug("同步数据资料到设备" + app.getApplianceID() + ",数据类型为:" + type.toString());
                executorService.execute(new SyncDataThread(app, type));
            }
        }
    }

    @Autowired
    @Qualifier("dbSyncDataService")
    AbsSimpleService dbSyncDataService;

    /**
     * 检查数据库中待同步任务，加入到内存中待同步任务列表
     */
    public void checkDb() {
        logger.debug("检查数据库是否需要同步资料到设备");
        try {
            dbSyncDataService.doService(null);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }
}

/**
 * 内部类，资料同步线程
 *
 * @author HeHao
 */
class SyncDataThread implements Runnable {
    private static final Logger logger = Logger.getLogger(SyncDataThread.class);
    private Appliance app;
    private EUpdateType type;

    public SyncDataThread(Appliance app, EUpdateType type) {
        this.app = app;
        this.type = type;
    }

    public void run() {
        // TODO Auto-generated method stub
        try {
            QuerySyncDataOpr dataOpr = SlarkContext.getApplicationContext()
                    .getBean(QuerySyncDataOpr.class);
            List<PengderMessage> listMsg = dataOpr.getDataList(type, app);
            if (listMsg != null) {
                if (!listMsg.isEmpty()) {
                    logger.debug("同步资料" + this.type.toString() + "到"
                            + app.getApplianceID());
                    for (PengderMessage msg : listMsg) {
                        msg.setNeedReply(true);
                        msg.setAppliance(app);
                        app.send(msg);
                    }
                    return;
                }
            }
            logger.debug("无同步资料" + this.type.toString() + "到"
                    + app.getApplianceID());
            app.getSyncState(type).setState(EState.None);
        } catch (Exception e) {
            app.getSyncState(type).setState(EState.None);
            logger.error(e.getMessage(), e);
        }
        return;
    }
}
