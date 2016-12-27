package com.uics.asset.service;

import com.uics.asset.entity.Ci;
import org.dubbo.x.repository.DaoBase;
import org.dubbo.x.service.CURDServiceBase;
import com.uics.asset.repository.CiDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *  配置信息
* Created by tom on 2016-12-27 13:42:04.
 */
public class CiServiceImpl extends CURDServiceBase<Ci> implements CiService {
    @Autowired
    private CiDao ciDao;

    @Override
    public DaoBase<Ci> getDao() {
        return ciDao;
    }
}
