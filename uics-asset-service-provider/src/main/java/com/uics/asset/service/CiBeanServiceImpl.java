package com.uics.asset.service;

import com.alibaba.fastjson.JSON;
import com.uics.asset.entity.Attribute;
import com.uics.asset.entity.Ci;
import com.uics.asset.facade.vo.CiBean;
import com.uics.asset.facade.vo.IAttributeBean;
import com.uics.asset.facade.vo.IAttributeBeanParse;
import com.uics.asset.facade.vo.IType;
import com.uics.asset.facade.vo.impl.*;
import com.uics.asset.repository.AttributeDao;
import com.uics.asset.repository.CiDao;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 *  配置信息
* Created by tom on 2016-12-27 13:42:04.
 */
public class CiBeanServiceImpl {
    private static final Logger LOGGER = LoggerFactory.getLogger(CiBeanServiceImpl.class);
    @Autowired
    private CiDao ciDao;

    @Autowired
    private AttributeDao attributeDao;

    public CiDao getCiDao() {
        return ciDao;
    }

    public void setCiDao(CiDao ciDao) {
        this.ciDao = ciDao;
    }

    public AttributeDao getAttributeDao() {
        return attributeDao;
    }

    public void setAttributeDao(AttributeDao attributeDao) {
        this.attributeDao = attributeDao;
    }

    private IAttributeBeanParse iAttributeBeanParse = new IAttributeBeanParse() {
        @Override
        public IAttributeBean parse(Attribute attribute) {
            LOGGER.debug("parse attribute:{}", JSON.toJSONString(attribute));
            IType type = null;
            if (attribute.getComplexValue() && StringUtils.isNoneEmpty(attribute.getValueAsString())){
                String targetId = attribute.getValueAsString().split("#")[1];
                Ci ciTarget = ciDao.findById(targetId);
                CiBean targetCibean = new CiBean(ciDao.findById(ciTarget.getTargetId()), this);
                Reference reference = new Reference(ciTarget.getSourceId(), ciTarget.getTargetId(),targetCibean);
                type = new ComplexType(reference);

            }else{
                type = TypeFactory.getInstanceByUniqueName(attribute.getTypeName()).parse(attribute);
            }

            return new AttributeBean(attribute.getDisplayName(), attribute.getAlias(), type);
        }
    };

    public CiBean getCiBeanTemplatesByAlias(final String alias){
        final Ci ci = ciDao.findByAliasAndIsBlueprint(alias, true);

        CiBean ciBean = new CiBean(ci, iAttributeBeanParse);

        return ciBean;
    }

    public List<CiBean> getCiBeanInstanceByAlias(String alias){
        Ci rootCi = ciDao.findByAliasAndIsBlueprint(alias, true);

        List<Ci> cis = ciDao.findByPathLikeAndIsBlueprint("%/" + rootCi.getId() + "/%",false);

        List<CiBean> ciBeans = new ArrayList<CiBean>();

        for (Ci ci: cis){
            ciBeans.add(new CiBean(ci, iAttributeBeanParse));
        }

        return ciBeans;
    }
}
