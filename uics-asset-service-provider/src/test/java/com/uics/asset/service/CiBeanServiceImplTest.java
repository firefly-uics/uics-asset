package com.uics.asset.service;

import com.alibaba.fastjson.JSON;
import com.uics.asset.facade.vo.CiBean;
import com.uics.asset.repository.AttributeDao;
import com.uics.asset.repository.CiDao;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

import java.util.List;

/**
 * Created by tom on 2016/12/29.
 */
@ContextConfiguration(locations = {"/META-INF/spring/applicationContext.xml"})
public class CiBeanServiceImplTest  extends SpringTransactionalTestCase {
    private static final Logger LOGGER = LoggerFactory.getLogger(CiBeanServiceImplTest.class);
    @Autowired
    private CiDao ciDao;
    @Autowired
    private AttributeDao attributeDao;

    private CiBeanServiceImpl ciBeanService;


    @Before
    public void setUp() throws Exception {
        if (null == ciBeanService){
            ciBeanService = new CiBeanServiceImpl();
            ciBeanService.setAttributeDao(attributeDao);
            ciBeanService.setCiDao(ciDao);
        }
    }

    @Test
    public void getCiBeanTemplatesByAlias(){
        String alias = "OS";
        CiBean ciBean = ciBeanService.getCiBeanTemplatesByAlias(alias);

        LOGGER.debug("alias:{}",JSON.toJSONString(ciBean));
    }

    @Test
    public void getCiBeanInstanceByAlias(){
        String alias = "OS";
        List<CiBean> ciBean = ciBeanService.getCiBeanInstanceByAlias(alias);

        LOGGER.debug("alias :{}, Instances:{}",alias, JSON.toJSONString(ciBean));
    }
}
