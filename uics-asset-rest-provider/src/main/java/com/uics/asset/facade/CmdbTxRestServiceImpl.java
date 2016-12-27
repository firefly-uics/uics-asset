package com.uics.asset.facade;

import com.uics.asset.entity.CmdbTx;
import org.dubbo.x.service.CURDService;
import org.dubbo.x.facade.RestServiceBase;
import com.uics.asset.service.CmdbTxService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 事务信息
* Created by tom on 2016-12-27 13:42:04.
 */
public class CmdbTxRestServiceImpl extends RestServiceBase<CmdbTx> implements CmdbTxRestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CmdbTxRestServiceImpl.class);

    private CmdbTxService cmdbTxService;

    public CmdbTxService getCmdbTxService() {
        return cmdbTxService;
    }

    public void setCmdbTxService(CmdbTxService cmdbTxService) {
        this.cmdbTxService = cmdbTxService;
    }

    @Override
    public CURDService<CmdbTx> getService() {
        return cmdbTxService;
    }

}
