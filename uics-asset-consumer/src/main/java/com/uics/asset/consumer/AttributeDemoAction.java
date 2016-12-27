package com.uics.asset.consumer;


import com.alibaba.fastjson.JSON;
import com.uics.asset.entity.Attribute;
import com.uics.asset.service.AttributeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
* Created by tom on 2016-12-27 13:42:04.
 */
public class AttributeDemoAction {
    private static final Logger LOGGER = LoggerFactory.getLogger(AttributeDemoAction.class);
    private AttributeService attributeService;

    public AttributeService getAttributeService() {
        return attributeService;
    }

    public void setAttributeService(AttributeService attributeService) {
        this.attributeService = attributeService;
    }

    public void start() throws Exception {
        List<Attribute> attributes = attributeService.listAll();
        assert(attributes != null);
        assert(attributes.size() == 1);

        LOGGER.info("list all:{}", JSON.toJSON(attributes));
    }
}
