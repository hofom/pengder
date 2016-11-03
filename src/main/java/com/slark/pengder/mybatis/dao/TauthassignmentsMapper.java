package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.TauthassignmentsExample;
import com.slark.pengder.mybatis.model.TauthassignmentsKey;
import com.slark.pengder.mybatis.model.TauthassignmentsWithBLOBs;
import java.util.List;

public interface TauthassignmentsMapper {
    int countByExample(TauthassignmentsExample example);

    int deleteByPrimaryKey(TauthassignmentsKey key);

    int insert(TauthassignmentsWithBLOBs record);

    int insertSelective(TauthassignmentsWithBLOBs record);

    List<TauthassignmentsWithBLOBs> selectByExampleWithBLOBs(TauthassignmentsExample example);

    List<TauthassignmentsKey> selectByExample(TauthassignmentsExample example);

    TauthassignmentsWithBLOBs selectByPrimaryKey(TauthassignmentsKey key);

    int updateByPrimaryKeySelective(TauthassignmentsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TauthassignmentsWithBLOBs record);
}