package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Teventofaccount;
import com.slark.pengder.mybatis.model.TeventofaccountExample;
import com.slark.pengder.mybatis.model.TeventofaccountKey;
import java.util.List;

public interface TeventofaccountMapper {
    int countByExample(TeventofaccountExample example);

    int deleteByPrimaryKey(TeventofaccountKey key);

    int insert(Teventofaccount record);

    int insertWithAccount(Teventofaccount record);

    int insertSelective(Teventofaccount record);

    List<Teventofaccount> selectByExample(TeventofaccountExample example);

    Teventofaccount selectByPrimaryKey(TeventofaccountKey key);

    int updateByPrimaryKeySelective(Teventofaccount record);

    int updateByPrimaryKey(Teventofaccount record);
}