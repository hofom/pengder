package com.slark.pengder.test;

import com.slark.pengder.mybatis.dao.TrecordofuserMapper;
import com.slark.pengder.tools.QuerySyncDataOpr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by fengwei on 16/10/27.
 */
@Component("pengderTestUnit")
public class PengderTestUnit {
    @Autowired
    private QuerySyncDataOpr  opr;
    /**
     * @description
     */
    public  void testEntry(){
        opr.selectNormalUserSessionList(65640);
    }
}
