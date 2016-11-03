package com.slark.io;

//import io.netty.bootstrap.ServerBootstrap;

import java.io.IOException;

/**
 * Created by fengwei on 16/7/5.
 */
public abstract class AbstractIOServer implements IIOServer, Runnable {
    /**
     * @return
     * @Description 增加一个初始化接口
     */
    public abstract boolean start();
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p/>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    public void run() {
        this.serverLoop();
    }
}
