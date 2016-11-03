package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Tcalendar;
import com.slark.pengder.mybatis.model.TcalendarExample;
import java.util.Date;
import java.util.List;

public interface TcalendarMapper {
    int countByExample(TcalendarExample example);

    int deleteByPrimaryKey(Date calendar);

    int insert(Tcalendar record);

    int insertSelective(Tcalendar record);

    List<Tcalendar> selectByExample(TcalendarExample example);
    
    List<Tcalendar> select1Day();
    
    List<Tcalendar> selectSynDay(Integer targetInstrumentID);

    Tcalendar selectByPrimaryKey(Date calendar);

    int updateByPrimaryKeySelective(Tcalendar record);

    int updateByPrimaryKey(Tcalendar record);
}