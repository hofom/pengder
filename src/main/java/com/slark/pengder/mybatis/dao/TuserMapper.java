package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Tuser;
import com.slark.pengder.mybatis.model.TuserExample;
import java.util.List;

public interface TuserMapper {
    int countByExample(TuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tuser record);

    int insertSelective(Tuser record);

    List<Tuser> selectByExample(TuserExample example);
    
    List<Tuser> select104();
    
    List<Tuser> select311(Integer targetInstrumentId);
    
    List<Tuser> select171(Integer accountId);

    Tuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tuser record);

    int updateByPrimaryKey(Tuser record);
}