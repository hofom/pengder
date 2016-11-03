package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Trecordofmanager;
import com.slark.pengder.mybatis.model.TrecordofmanagerExample;
import java.util.List;

public interface TrecordofmanagerMapper {
    int countByExample(TrecordofmanagerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Trecordofmanager record);

    int insertSelective(Trecordofmanager record);

    int replaceSelective(Trecordofmanager record);

    List<Trecordofmanager> selectByExample(TrecordofmanagerExample example);

    Trecordofmanager selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Trecordofmanager record);

    int updateByPrimaryKey(Trecordofmanager record);
}