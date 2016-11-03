package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Tuserintrainingsession;
import com.slark.pengder.mybatis.model.TuserintrainingsessionExample;
import com.slark.pengder.mybatis.model.TuserintrainingsessionKey;
import java.util.List;

public interface TuserintrainingsessionMapper {
    int countByExample(TuserintrainingsessionExample example);

    int deleteByPrimaryKey(TuserintrainingsessionKey key);

    int insert(Tuserintrainingsession record);

    int insertSelective(Tuserintrainingsession record);
    
    int replaceSelective(Tuserintrainingsession record);

    List<Tuserintrainingsession> selectByExample(TuserintrainingsessionExample example);

    Tuserintrainingsession selectByPrimaryKey(TuserintrainingsessionKey key);

    int updateByPrimaryKeySelective(Tuserintrainingsession record);

    int updateByPrimaryKey(Tuserintrainingsession record);
}