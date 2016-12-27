package com.uics.asset.facade;

import org.dubbo.x.facade.CURDRestService;
import org.dubbo.x.facade.RestResult;
import org.dubbo.x.util.ConstantVariable;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.uics.asset.entity.CmdbTx;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * 事务信息 接口
 *
* Created by tom on 2016-12-27 13:42:04.
 */

@Path("cmdbtxs")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({ContentType.APPLICATION_JSON_UTF_8})
@Api(value="cmdbtxs", description = "事务信息接口")
public interface CmdbTxRestService extends CURDRestService<CmdbTx>{
    /**
     * 事务信息
     * @return
     */
    @GET
    @Path("")
    @ApiOperation(value = "事务信息",
            notes = "事务信息列表.")
    RestResult<List<CmdbTx>> list(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token);

    /**
     * 事务信息 详细信息
     *
     * @return
     */
    @GET
    @Path("/{id}")
    @ApiOperation(value = "详细信息",
            notes = "事务信息详细信息.")
    RestResult<CmdbTx> detail(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token, @ApiParam("id") @PathParam("id") String uuid);

    @POST
    @Path("")
    @ApiOperation(value = "添加/修改事务信息", notes = "添加/修改事务信息")
    RestResult<CmdbTx> create(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token,CmdbTx cmdbTx);

    @DELETE
    @Path("/{id}")
    @ApiOperation(value = "删除事务信息", notes = "删除事务信息")
    RestResult<String> delete(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token, @ApiParam("id") @PathParam("id") String uuid);
}
