package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Teventofuser;
import com.slark.pengder.mybatis.model.TeventofuserExample;
import com.slark.pengder.mybatis.model.TeventofuserKey;
import java.util.List;

public interface TeventofuserMapper {
    int countByExample(TeventofuserExample example);

    int deleteByPrimaryKey(TeventofuserKey key);

    int insert(Teventofuser record);

    int insertSelective(Teventofuser record);

    List<Teventofuser> selectByExample(TeventofuserExample example);

    Teventofuser selectByPrimaryKey(TeventofuserKey key);

    int updateByPrimaryKeySelective(Teventofuser record);

    int updateByPrimaryKey(Teventofuser record);
}