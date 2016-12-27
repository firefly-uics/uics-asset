package com.uics.asset.service;

import com.uics.asset.entity.CmdbTx;
import org.dubbo.x.repository.DaoBase;
import org.dubbo.x.service.CURDServiceBase;
import com.uics.asset.repository.CmdbTxDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *  事务信息
* Created by tom on 2016-12-27 13:42:04.
 */
public class CmdbTxServiceImpl extends CURDServiceBase<CmdbTx> implements CmdbTxService {
    @Autowired
    private CmdbTxDao cmdbTxDao;

    @Override
    public DaoBase<CmdbTx> getDao() {
        return cmdbTxDao;
    }
}
