package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Tchangingofsupplies;
import com.slark.pengder.mybatis.model.TchangingofsuppliesExample;
import com.slark.pengder.mybatis.model.TchangingofsuppliesKey;
import java.util.List;

public interface TchangingofsuppliesMapper {
    int countByExample(TchangingofsuppliesExample example);

    int deleteByPrimaryKey(TchangingofsuppliesKey key);

    int insert(Tchangingofsupplies record);

    int insertSelective(Tchangingofsupplies record);

    List<Tchangingofsupplies> selectByExample(TchangingofsuppliesExample example);

    Tchangingofsupplies selectByPrimaryKey(TchangingofsuppliesKey key);

    int updateByPrimaryKeySelective(Tchangingofsupplies record);

    int updateByPrimaryKey(Tchangingofsupplies record);
}