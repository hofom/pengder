package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Tbookingrecord;
import com.slark.pengder.mybatis.model.TbookingrecordExample;
import java.util.List;

public interface TbookingrecordMapper {
    int countByExample(TbookingrecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tbookingrecord record);

    int insertSelective(Tbookingrecord record);

    List<Tbookingrecord> selectByExample(TbookingrecordExample example);

    List<Tbookingrecord> selectNewByExample(TbookingrecordExample example);

    Tbookingrecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tbookingrecord record);

    int updateByPrimaryKey(Tbookingrecord record);
    
    int updateWithDev();
}