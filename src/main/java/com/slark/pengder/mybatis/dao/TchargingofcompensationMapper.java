package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Tchargingofcompensation;
import com.slark.pengder.mybatis.model.TchargingofcompensationExample;
import com.slark.pengder.mybatis.model.TchargingofcompensationKey;
import java.util.List;

public interface TchargingofcompensationMapper {
    int countByExample(TchargingofcompensationExample example);

    int deleteByPrimaryKey(TchargingofcompensationKey key);

    int insert(Tchargingofcompensation record);

    int insertSelective(Tchargingofcompensation record);

    List<Tchargingofcompensation> selectByExample(TchargingofcompensationExample example);

    Tchargingofcompensation selectByPrimaryKey(TchargingofcompensationKey key);

    int updateByPrimaryKeySelective(Tchargingofcompensation record);

    int updateByPrimaryKey(Tchargingofcompensation record);
}