package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Tglobalconfig;
import com.slark.pengder.mybatis.model.TglobalconfigExample;
import java.util.List;

public interface TglobalconfigMapper {
    int countByExample(TglobalconfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tglobalconfig record);

    int insertSelective(Tglobalconfig record);

    List<Tglobalconfig> selectByExample(TglobalconfigExample example);

    Tglobalconfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tglobalconfig record);

    int updateByPrimaryKey(Tglobalconfig record);
}