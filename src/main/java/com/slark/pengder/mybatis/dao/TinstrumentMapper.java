package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Tinstrument;
import com.slark.pengder.mybatis.model.TinstrumentExample;
import java.util.List;

public interface TinstrumentMapper {
    int countByExample(TinstrumentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tinstrument record);

    int insertSelective(Tinstrument record);

    List<Tinstrument> selectByExample(TinstrumentExample example);
    
    List<Tinstrument> selectNewByExample(TinstrumentExample example);

    Tinstrument selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tinstrument record);

    int updateByPrimaryKey(Tinstrument record);
}