package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.TExperimentFile;
import com.slark.pengder.mybatis.model.TExperimentFileExample;
import java.util.List;

public interface TExperimentFileMapper {
    int countByExample(TExperimentFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TExperimentFile record);

    int insertSelective(TExperimentFile record);

    int replaceSelective(TExperimentFile record);

    List<TExperimentFile> selectByExample(TExperimentFileExample example);

    TExperimentFile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TExperimentFile record);

    int updateByPrimaryKey(TExperimentFile record);
}