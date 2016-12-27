package com.uics.asset.facade;

import com.uics.asset.entity.Ci;
import org.dubbo.x.service.CURDService;
import org.dubbo.x.facade.RestServiceBase;
import com.uics.asset.service.CiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 配置信息
* Created by tom on 2016-12-27 13:42:04.
 */
public class CiRestServiceImpl extends RestServiceBase<Ci> implements CiRestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CiRestServiceImpl.class);

    private CiService ciService;

    public CiService getCiService() {
        return ciService;
    }

    public void setCiService(CiService ciService) {
        this.ciService = ciService;
    }

    @Override
    public CURDService<Ci> getService() {
        return ciService;
    }

}
