package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Tinstrumentreservation;
import com.slark.pengder.mybatis.model.TinstrumentreservationExample;
import java.util.List;

public interface TinstrumentreservationMapper {
    int countByExample(TinstrumentreservationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tinstrumentreservation record);

    int insertSelective(Tinstrumentreservation record);

    int replaceSelective(Tinstrumentreservation record);

    List<Tinstrumentreservation> selectByExample(TinstrumentreservationExample example);
    
    List<Tinstrumentreservation> selectNewByExample(TinstrumentreservationExample example);

    Tinstrumentreservation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tinstrumentreservation record);

    int updateByPrimaryKey(Tinstrumentreservation record);
}