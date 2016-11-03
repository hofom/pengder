package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Tneedsyndata;
import com.slark.pengder.mybatis.model.TneedsyndataExample;
import com.slark.pengder.mybatis.model.TneedsyndataKey;
import java.util.List;

public interface TneedsyndataMapper {
    int countByExample(TneedsyndataExample example);

    int deleteByPrimaryKey(TneedsyndataKey key);

    int insert(Tneedsyndata record);

    int insertSelective(Tneedsyndata record);

    List<Tneedsyndata> selectByExample(TneedsyndataExample example);

    List<Tneedsyndata> selectNewByExample(TneedsyndataExample example);

    Tneedsyndata selectByPrimaryKey(TneedsyndataKey key);

    int updateByPrimaryKeySelective(Tneedsyndata record);

    int updateByPrimaryKey(Tneedsyndata record);
}