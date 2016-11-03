package com.slark.pengder.ws;

import com.slark.pengder.protocol.PengderMessage;
import com.slark.pengder.service.AbsSimpleService;
import com.slark.pengder.service.receiver.AbsReceiverService;
import com.slark.pengder.tools.EUpdateType;
import com.slark.pengder.tools.SyncDataTaskList;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component("webServer")
@WebService(endpointInterface = "com.slark.pengder.ws.WebServer")
public class WebServerImpl implements WebServer {
    private static final Logger logger = Logger.getLogger(WebServerImpl.class);

    @Autowired
    @Qualifier("webInstStateService")
    private AbsSimpleService webInstStateService;

    @Autowired
    @Qualifier("webSyncDataService")
    private AbsSimpleService webSyncDataService;

    @Autowired
    @Qualifier("userDeplaneService")
    private AbsSimpleService userDeplaneService;

    @Autowired
    private SyncDataTaskList syncList;

    public Integer[] getInstrumentStateList() {
        // TODO Auto-generated method stub
        /**
         * 调用获取仪器状态的服务
         */
        try {
            List<Integer> list = webInstStateService.doService(null);
            return list.toArray(new Integer[0]);
        } catch (Exception e) {
            // TODO: handle exception
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    public void setNewUpdateReq(int aType, int aID1, int aID2) {
        // TODO Auto-generated method stub
        try {
            Map paramMap = new HashMap<String, Object>();
            EUpdateType type = EUpdateType.valueOf(aType);
            if (type == null) {
                logger.error("未知同步类型：" + aType);
            } else {

                // aID2没用，没有意义
                logger.info("web通知待同步，类型：" + type.toString() + " ID1:" + aID1 + " ID2:" + aID2);
                paramMap.put("type", type);
                paramMap.put("instId", aID1);
                /**
                 * 调用web发起同步请求服务，还是增加了service，保持整齐
                 */
                webSyncDataService.doService(paramMap);
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        logger.info("web通知返回");
    }

    /**
     * @param id  t_remote_shutdown_record.id
     * @return 返回Success 表明设备下机命令已经下发
     * 返回其他的字符串，描述的是错误原因
     * @description 远程操作设备下机
     */
    public String instrumentDeplane(int id) {
        String  resString = "Success";

        Integer  param = new Integer(id);
        /**
         * 调用服务处理方法
         */
        try {
            List res = userDeplaneService.doService(param);
            if (res == null) {
                return "发送远程下机命令失败";
            }
            resString = (String)res.get(0);
        }catch (Exception e){
            logger.error(e.getMessage(), e);
        }

        return resString;
    }
}
