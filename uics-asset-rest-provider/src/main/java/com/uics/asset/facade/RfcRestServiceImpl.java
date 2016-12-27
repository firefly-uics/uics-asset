package com.uics.asset.facade;

import com.uics.asset.entity.Rfc;
import org.dubbo.x.service.CURDService;
import org.dubbo.x.facade.RestServiceBase;
import com.uics.asset.service.RfcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 变更信息
* Created by tom on 2016-12-27 13:42:04.
 */
public class RfcRestServiceImpl extends RestServiceBase<Rfc> implements RfcRestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RfcRestServiceImpl.class);

    private RfcService rfcService;

    public RfcService getRfcService() {
        return rfcService;
    }

    public void setRfcService(RfcService rfcService) {
        this.rfcService = rfcService;
    }

    @Override
    public CURDService<Rfc> getService() {
        return rfcService;
    }

}
