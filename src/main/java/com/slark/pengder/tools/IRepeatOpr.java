package com.slark.pengder.tools;

/**
 * Created by fengwei on 16/7/14.
 */
public interface IRepeatOpr<EleType extends com.google.protobuf.GeneratedMessageLite,TList extends com.google.protobuf.GeneratedMessageLite> {
    public UpdateYears  updateYears = null;
    /**
     * 得到元素的个数
     *
     * @return
     */
    public int getElementCount();

    /**
     * @Description 得到指定的element
     * @param i
     * @return
     */
    public EleType getElement(int i);

    /**
     * @Description
     * @param e
     */
    public void addElement(EleType e);

    /**
     * 清空list
     */
    public void clear();

    /**
     * 清空指定的元素
     */
    public void clearElements();

    /**
     *
     * @return
     */
    public TList build();

    /**
     * @Description 得到临时容器的个数
     * @return
     */
    public int getTemporyCount();
}
