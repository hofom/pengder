package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Tuserright;
import com.slark.pengder.mybatis.model.TuserrightExample;
import com.slark.pengder.mybatis.model.TuserrightKey;
import java.util.List;

public interface TuserrightMapper {
    int countByExample(TuserrightExample example);

    int deleteByPrimaryKey(TuserrightKey key);

    int insert(Tuserright record);

    int insertSelective(Tuserright record);

    List<Tuserright> selectByExample(TuserrightExample example);
    
    List<Tuserright> selectNewByExample(TuserrightExample example);
    
    List<Tuserright> selectNewDisId();

    Tuserright selectByPrimaryKey(TuserrightKey key);

    int updateByPrimaryKeySelective(Tuserright record);

    int updateByPrimaryKey(Tuserright record);
}