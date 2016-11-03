package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Taccount;
import com.slark.pengder.mybatis.model.TaccountEvent;
import com.slark.pengder.mybatis.model.TaccountExample;

import java.util.List;

public interface TaccountMapper {
    int countByExample(TaccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Taccount record);

    int insertSelective(Taccount record);
    
    List<Taccount> selectByExample(TaccountExample example);

    List<Taccount> select312(Integer targetInstrumentID);

    List<Taccount> selectPayedAccount(Integer year);

    List<Taccount> selectWarnAccount();

    Taccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Taccount record);

    int updateByPrimaryKey(Taccount record);
}