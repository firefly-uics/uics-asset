package com.uics.asset.consumer;


import com.alibaba.fastjson.JSON;
import com.uics.asset.entity.Ci;
import com.uics.asset.service.CiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
* Created by tom on 2016-12-27 13:42:03.
 */
public class CiDemoAction {
    private static final Logger LOGGER = LoggerFactory.getLogger(CiDemoAction.class);
    private CiService ciService;

    public CiService getCiService() {
        return ciService;
    }

    public void setCiService(CiService ciService) {
        this.ciService = ciService;
    }

    public void start() throws Exception {
        List<Ci> cis = ciService.listAll();
        assert(cis != null);
        assert(cis.size() == 1);

        LOGGER.info("list all:{}", JSON.toJSON(cis));
    }
}
