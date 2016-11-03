package com.slark.pengder.net;

import com.slark.pengder.comm.UtilCheck;
import com.slark.pengder.service.AbsSimpleService;

import io.netty.channel.Channel;
import io.netty.channel.ChannelId;
import io.netty.channel.ServerChannel;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;
import io.netty.util.internal.PlatformDependent;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by fengwei on 16/7/7.
 */
public class PengderChannelGroup extends DefaultChannelGroup {
    private static final Logger logger = Logger.getLogger(PengderChannelGroup.class);
    /**
     * 默认已经连到终端的
     * 组
     */
    public static final PengderChannelGroup defaultTerminalGroup = new PengderChannelGroup();
    /**
     * 存放所有的设备终端，是初始化成功后
     */
    private final ConcurrentMap<ChannelId, Appliance> appliances = PlatformDependent.newConcurrentHashMap();
    /**
     * 该字段记录一段时间内的设备离线个数。在这段时间除了设备离线外没有上线的设备
     */
    private AtomicInteger  offlineApps = new AtomicInteger(0);
    private Map<Integer,Date> mapOfflineIds = new ConcurrentHashMap<Integer,Date>();
    /**
     * 构造函数
     */
    private PengderChannelGroup() {
        super(GlobalEventExecutor.INSTANCE);
    }

    /**
     * 得到设备列表
     * @return
     */
    public ConcurrentMap<ChannelId, Appliance> getAppliances() {
        return appliances;
    }

    /**
     * @param ch
     * @return
     * @Description 得到连接进来的设备终端
     */
    public Appliance getAppliance(Channel ch) {
        return appliances.get(ch.id());
    }

    /**
     * @description 得到当前离线的设备个数
     * @return
     */
    public int getOfflineApps() {
        return offlineApps.get();
    }
    /**
     * @description 得到当前离线的设备ID的map，外部需要再次请求findApplianceByAppId确认
     * 				使用定时检查的方式不够精准,可能会漏发闪断消息（老代码处理逻辑也是如此）
     * @return
     */
    public Map getOfflineIds() {
    	return mapOfflineIds;
    }
    /**
     * 这个函数覆盖掉，
     *
     * @param channel
     * @return
     */
    @Override
    public boolean add(Channel channel) {
        //appliances.
        logger.debug("加入客户端 ： " + channel.toString());
        if (channel instanceof ServerChannel) {
            super.add(channel);
        } else {
            Appliance app = new Appliance(channel);
            appliances.putIfAbsent(channel.id(), app);
            offlineApps.set(0);
        }
        return super.add(channel);
    }

    
    
    @Override
    public boolean remove(Object o) {
        logger.debug("删除客户端 ： " + o.toString());
        Integer instId = null;
        if (o instanceof Appliance) {
            Appliance appliance = (Appliance) o;
            instId = appliance.getApplianceID();
            appliances.remove(appliance.getChannel().id());
            offlineApps.addAndGet(1);
            o = appliance.getChannel();
            //return super.remove(appliance.getChannel());
        } else if (o instanceof Channel) {
            Channel c = (Channel) o;
            instId = this.getAppliance(c).getApplianceID();
            appliances.remove(c.id());
            offlineApps.addAndGet(1);
            //return super.remove(o);
        } else if (o instanceof ChannelId) {
        	instId = this.appliances.get(o).getApplianceID();
            appliances.remove(o);
            offlineApps.addAndGet(1);
            //return super.remove(o);
        }
        
        if(instId != null){
        	//不便在这里调用NoticeService,只能使用定时任务了
        	mapOfflineIds.put(instId, new Date());
        }
        
        return super.remove(o);
    }

    /**
     * @return
     * @Description 得到所有的设备列表, 不管初始化还是没哟初始化
     */
    public List<Appliance> toApplianceList() {
        List<Appliance> apps = new ArrayList<Appliance>(appliances.size());
        apps.addAll(appliances.values());
        return apps;
    }

    /**
     * @description 根据设备id得到设备对象
     * @param id
     * @return
     */
    public Appliance findApplianceByAppId(long id) {
        for (Appliance app : appliances.values()) {
            long appId = app.getApplianceID();
            if (UtilCheck.checkTinstumentId((int) appId) > 0 && appId == id) {
                return app;
            }
        }
        return null;
    }

    /**
     * @return
     * @Description
     */
    public static PengderChannelGroup defaultTerminalGroup() {
        return defaultTerminalGroup;
    }

}
