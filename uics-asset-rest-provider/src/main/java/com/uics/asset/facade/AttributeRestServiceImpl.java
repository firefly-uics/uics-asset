package com.uics.asset.facade;

import com.uics.asset.entity.Attribute;
import org.dubbo.x.service.CURDService;
import org.dubbo.x.facade.RestServiceBase;
import com.uics.asset.service.AttributeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 属性信息
* Created by tom on 2016-12-27 13:42:04.
 */
public class AttributeRestServiceImpl extends RestServiceBase<Attribute> implements AttributeRestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AttributeRestServiceImpl.class);

    private AttributeService attributeService;

    public AttributeService getAttributeService() {
        return attributeService;
    }

    public void setAttributeService(AttributeService attributeService) {
        this.attributeService = attributeService;
    }

    @Override
    public CURDService<Attribute> getService() {
        return attributeService;
    }

}
