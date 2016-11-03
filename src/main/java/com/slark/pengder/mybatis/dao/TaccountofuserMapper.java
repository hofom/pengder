package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Taccountofuser;
import com.slark.pengder.mybatis.model.TaccountofuserExample;
import com.slark.pengder.mybatis.model.TaccountofuserKey;
import java.util.List;

public interface TaccountofuserMapper {
    int countByExample(TaccountofuserExample example);

    int deleteByPrimaryKey(TaccountofuserKey key);

    int insert(Taccountofuser record);

    int insertSelective(Taccountofuser record);

    List<Taccountofuser> selectByExample(TaccountofuserExample example);

    Taccountofuser selectByPrimaryKey(TaccountofuserKey key);

    int updateByPrimaryKeySelective(Taccountofuser record);

    int updateByPrimaryKey(Taccountofuser record);
}