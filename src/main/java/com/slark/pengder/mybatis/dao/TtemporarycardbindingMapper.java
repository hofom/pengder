package com.slark.pengder.mybatis.dao;

import com.slark.pengder.mybatis.model.Ttemporarycardbinding;
import com.slark.pengder.mybatis.model.TtemporarycardbindingExample;
import java.util.List;

public interface TtemporarycardbindingMapper {
    int countByExample(TtemporarycardbindingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ttemporarycardbinding record);

    int insertSelective(Ttemporarycardbinding record);

    List<Ttemporarycardbinding> selectByExample(TtemporarycardbindingExample example);

    List<Ttemporarycardbinding> selectNewByExample(TtemporarycardbindingExample example);

    List<Ttemporarycardbinding> selectNewDisId();
    
    Ttemporarycardbinding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ttemporarycardbinding record);

    int updateByPrimaryKey(Ttemporarycardbinding record);
    
    int updateByEndtime();
    
    
}