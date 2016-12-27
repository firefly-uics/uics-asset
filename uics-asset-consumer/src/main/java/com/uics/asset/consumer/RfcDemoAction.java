package com.uics.asset.consumer;


import com.alibaba.fastjson.JSON;
import com.uics.asset.entity.Rfc;
import com.uics.asset.service.RfcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
* Created by tom on 2016-12-27 13:42:04.
 */
public class RfcDemoAction {
    private static final Logger LOGGER = LoggerFactory.getLogger(RfcDemoAction.class);
    private RfcService rfcService;

    public RfcService getRfcService() {
        return rfcService;
    }

    public void setRfcService(RfcService rfcService) {
        this.rfcService = rfcService;
    }

    public void start() throws Exception {
        List<Rfc> rfcs = rfcService.listAll();
        assert(rfcs != null);
        assert(rfcs.size() == 1);

        LOGGER.info("list all:{}", JSON.toJSON(rfcs));
    }
}
