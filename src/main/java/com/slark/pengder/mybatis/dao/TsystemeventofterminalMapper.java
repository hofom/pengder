package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Tsystemeventofterminal;
import com.slark.pengder.mybatis.model.TsystemeventofterminalExample;
import java.util.List;

public interface TsystemeventofterminalMapper {
    int countByExample(TsystemeventofterminalExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tsystemeventofterminal record);

    int insertSelective(Tsystemeventofterminal record);
    
    int replaceSelective(Tsystemeventofterminal record);

    List<Tsystemeventofterminal> selectByExample(TsystemeventofterminalExample example);

    Tsystemeventofterminal selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tsystemeventofterminal record);

    int updateByPrimaryKey(Tsystemeventofterminal record);
}