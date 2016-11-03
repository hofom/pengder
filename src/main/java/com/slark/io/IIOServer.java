package com.slark.io;

import java.io.Closeable;

/**
 * Created by fengwei on 16/7/5.
 * @Description  IOServer 是一个借口对象。
 * 该节点对象扩展至
 */
public interface IIOServer extends Closeable{
    /**
     * @Description
     * 定义了一个serverLoop的循环入口
     */
    public   boolean  serverLoop();

}
