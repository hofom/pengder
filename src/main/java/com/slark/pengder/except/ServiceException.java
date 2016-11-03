package com.slark.pengder.except;

import com.slark.except.SlarkException;

import java.util.List;

/**
 * Created by fengwei on 16/7/18.
 */
public class ServiceException extends SlarkException{

    private List resp = null;

    public  ServiceException(int code,String msg){
        super(code,msg);
    }

    public ServiceException(int code,String msg,List resp){
        super(code,msg);
        setResp(resp);
    }

    /**
     * @description 在异常发生后。该接口将返回异常描述的消息报
     * @return
     */
    public List getResp() {
        return resp;
    }

    /**
     * @description 设置返回的消息列表
     * @param resp
     * @return
     */
    public ServiceException setResp(List resp) {
        this.resp = resp;
        return this;
    }
}
