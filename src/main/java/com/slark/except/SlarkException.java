package com.slark.except;

import java.util.List;

/**
 * Created by fengwei on 16/7/18.
 */
public class SlarkException extends RuntimeException {
    /**
     * 错误代码
     */
    private int  code = 0;
    /**
     * 默认构造函数
     */
    public SlarkException(){
        super();
    }
    /**
     * @Description 构造函数
     * @param exceptStr
     */
    public SlarkException(String exceptStr){
        super(exceptStr);
    }

    /**
     * @description 构造函数
     * @param code
     * @param errmsg
     */
    public SlarkException(int code,String errmsg){
        super(errmsg);
        this.code = code;
    }

    public SlarkException(String str,Throwable r){
        super(str,r);
    }

    public SlarkException(int code,String str,Throwable r){
        super(str,r);
        this.code = code;
    }

    public SlarkException(int code){
        this.code = code;
    }

    public SlarkException(int code,Throwable r){
        super(r);
        this.code = code;
    }

    public SlarkException(Throwable r){
        super(r);
    }
    /**
     * @decription 得到错误信息
     * @return
     */
    public String  what(){
        return this.getMessage();
    }
    /**
     * @description 得到错误代码
     * @return
     */
    public int getCode(){
        return code;
    }
}
