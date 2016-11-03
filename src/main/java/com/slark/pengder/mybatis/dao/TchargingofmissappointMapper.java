package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Tchargingofmissappoint;
import com.slark.pengder.mybatis.model.TchargingofmissappointExample;
import java.util.List;

public interface TchargingofmissappointMapper {
    int countByExample(TchargingofmissappointExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tchargingofmissappoint record);

    int insertSelective(Tchargingofmissappoint record);

    List<Tchargingofmissappoint> selectByExample(TchargingofmissappointExample example);

    Tchargingofmissappoint selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tchargingofmissappoint record);

    int updateByPrimaryKey(Tchargingofmissappoint record);
}