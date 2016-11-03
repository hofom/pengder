package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Trecordofuser;
import com.slark.pengder.mybatis.model.TrecordofuserExample;
import java.util.List;

public interface TrecordofuserMapper {
    int countByExample(TrecordofuserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Trecordofuser record);

    int insertSelective(Trecordofuser record);

    List<Trecordofuser> selectByExample(TrecordofuserExample example);

    Trecordofuser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Trecordofuser record);

    int updateByPrimaryKey(Trecordofuser record);
}