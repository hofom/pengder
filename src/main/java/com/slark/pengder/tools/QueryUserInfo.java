package com.slark.pengder.tools;

import com.slark.pengder.mybatis.dao.TuserMapper;
import com.slark.pengder.mybatis.model.Tuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by fengwei on 16/7/20.
 */
@Component("selectUserInfo")
public class QueryUserInfo {

    @Autowired
    private TuserMapper  tuserMapper;


    /**
     * @Description 查询用户信息
     * @param userId
     * @return
     */
    public Tuser  getUser(int userId){
        return tuserMapper.selectByPrimaryKey(userId);
    }
}
