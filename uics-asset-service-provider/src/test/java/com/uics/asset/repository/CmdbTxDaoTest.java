package com.uics.asset.repository;

import com.uics.asset.entity.CmdbTx;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

import java.util.List;

/**
 * 事务信息
* Created by tom on 2016-12-27 13:43:22.
 */
@ContextConfiguration(locations = {"/META-INF/spring/applicationContext.xml"})
public class CmdbTxDaoTest extends SpringTransactionalTestCase {

    @Autowired
    private CmdbTxDao cmdbTxDao;

    @Test
    public void findAll(){
        List<CmdbTx> cmdbTxs = cmdbTxDao.findAllBy();

        Assert.assertNotNull(cmdbTxs);

        Assert.assertEquals(cmdbTxs.size(), 0);
    }
}
