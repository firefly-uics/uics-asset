package com.uics.asset.consumer;


import com.alibaba.fastjson.JSON;
import com.uics.asset.entity.CmdbTx;
import com.uics.asset.service.CmdbTxService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
* Created by tom on 2016-12-27 13:42:04.
 */
public class CmdbTxDemoAction {
    private static final Logger LOGGER = LoggerFactory.getLogger(CmdbTxDemoAction.class);
    private CmdbTxService cmdbTxService;

    public CmdbTxService getCmdbTxService() {
        return cmdbTxService;
    }

    public void setCmdbTxService(CmdbTxService cmdbTxService) {
        this.cmdbTxService = cmdbTxService;
    }

    public void start() throws Exception {
        List<CmdbTx> cmdbTxs = cmdbTxService.listAll();
        assert(cmdbTxs != null);
        assert(cmdbTxs.size() == 1);

        LOGGER.info("list all:{}", JSON.toJSON(cmdbTxs));
    }
}
