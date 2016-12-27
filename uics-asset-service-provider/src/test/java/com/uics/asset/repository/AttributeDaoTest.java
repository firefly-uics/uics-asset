package com.uics.asset.repository;

import com.uics.asset.entity.Attribute;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

import java.util.List;

/**
 * 属性信息
* Created by tom on 2016-12-27 13:43:22.
 */
@ContextConfiguration(locations = {"/META-INF/spring/applicationContext.xml"})
public class AttributeDaoTest extends SpringTransactionalTestCase {

    @Autowired
    private AttributeDao attributeDao;

    @Test
    public void findAll(){
        List<Attribute> attributes = attributeDao.findAllBy();

        Assert.assertNotNull(attributes);

        Assert.assertEquals(attributes.size(), 0);
    }
}
