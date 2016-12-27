package com.uics.asset.repository;

import com.uics.asset.entity.Ci;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

import java.util.List;

/**
 * 配置信息
* Created by tom on 2016-12-27 13:43:22.
 */
@ContextConfiguration(locations = {"/META-INF/spring/applicationContext.xml"})
public class CiDaoTest extends SpringTransactionalTestCase {

    @Autowired
    private CiDao ciDao;

    @Test
    public void findAll(){
        List<Ci> cis = ciDao.findAllBy();

        Assert.assertNotNull(cis);

        Assert.assertEquals(cis.size(), 0);
    }
}
