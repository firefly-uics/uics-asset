package com.uics.asset.repository;

import com.uics.asset.entity.Rfc;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

import java.util.List;

/**
 * 变更信息
* Created by tom on 2016-12-27 13:43:22.
 */
@ContextConfiguration(locations = {"/META-INF/spring/applicationContext.xml"})
public class RfcDaoTest extends SpringTransactionalTestCase {

    @Autowired
    private RfcDao rfcDao;

    @Test
    public void findAll(){
        List<Rfc> rfcs = rfcDao.findAllBy();

        Assert.assertNotNull(rfcs);

        Assert.assertEquals(rfcs.size(), 0);
    }
}
