package com.uics.asset.service;

import com.uics.asset.entity.Attribute;
import org.dubbo.x.repository.DaoBase;
import org.dubbo.x.service.CURDServiceBase;
import com.uics.asset.repository.AttributeDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *  属性信息
* Created by tom on 2016-12-27 13:42:04.
 */
public class AttributeServiceImpl extends CURDServiceBase<Attribute> implements AttributeService {
    @Autowired
    private AttributeDao attributeDao;

    @Override
    public DaoBase<Attribute> getDao() {
        return attributeDao;
    }
}
