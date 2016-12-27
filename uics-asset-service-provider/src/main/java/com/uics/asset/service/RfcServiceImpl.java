package com.uics.asset.service;

import com.uics.asset.entity.Rfc;
import org.dubbo.x.repository.DaoBase;
import org.dubbo.x.service.CURDServiceBase;
import com.uics.asset.repository.RfcDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *  变更信息
* Created by tom on 2016-12-27 13:42:04.
 */
public class RfcServiceImpl extends CURDServiceBase<Rfc> implements RfcService {
    @Autowired
    private RfcDao rfcDao;

    @Override
    public DaoBase<Rfc> getDao() {
        return rfcDao;
    }
}
