package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Tusereventofterminal;
import com.slark.pengder.mybatis.model.TusereventofterminalExample;
import java.util.List;

public interface TusereventofterminalMapper {
    int countByExample(TusereventofterminalExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tusereventofterminal record);

    int insertSelective(Tusereventofterminal record);

    int replaceSelective(Tusereventofterminal record);

    List<Tusereventofterminal> selectByExample(TusereventofterminalExample example);

    Tusereventofterminal selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tusereventofterminal record);

    int updateByPrimaryKey(Tusereventofterminal record);
}