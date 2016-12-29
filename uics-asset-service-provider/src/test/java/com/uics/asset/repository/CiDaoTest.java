package com.uics.asset.repository;

import com.uics.asset.entity.Ci;
import org.dubbo.x.exception.ApiException;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger LOGGER = LoggerFactory.getLogger(CiDaoTest.class);
    @Autowired
    private CiDao ciDao;

    @Autowired
    private AttributeDao attributeDao ;
    @Test
    public void findAll(){
        List<Ci> cis = ciDao.findAllBy();

        Assert.assertNotNull(cis);

        Assert.assertEquals(cis.size(), 0);

    }

    @Test
    public void findRoot(){
        Ci ci = ciDao.findByAlias("Ci");
        Assert.assertNotNull(ci);
    }

    @Test
    public void findByDeviceFrom() throws ApiException {
        List<Ci> cis = findByDeviceFromAlias("CI");

        Assert.assertNotNull(cis);
    }

    public List<Ci> findByDeviceFromAlias(String alias) throws ApiException {
        Ci ci = ciDao.findByAliasAndIsBlueprint(alias, true);
        if (null == ci){
            throw new ApiException(String.format("通过别名:%s,未找到模版!", alias));
        }

        List<Ci> cis = ciDao.findByDerivedFromIdAndIsBlueprint(ci.getId(),true);
        for (Ci cii: cis){
            LOGGER.debug("cii:{}", cii.getDisplayName());
        }

        return cis;
    }

    @Test
    public void findByPathLikeAndIsBlueprint() throws ApiException {
        String alias = "OS";
        Ci ci = ciDao.findByAliasAndIsBlueprint(alias, true);
        if (null == ci){
            throw new ApiException(String.format("通过别名:%s,未找到模版!", alias));
        }

        List<Ci> cis = ciDao.findByPathLikeAndIsBlueprint("%/" + ci.getId() + "/%",false);
        for (Ci cii: cis){
            LOGGER.debug("cii:{}", cii.getDisplayName());
        }
    }
}
