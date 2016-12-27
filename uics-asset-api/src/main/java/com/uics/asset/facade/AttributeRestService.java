package com.uics.asset.facade;

import org.dubbo.x.facade.CURDRestService;
import org.dubbo.x.facade.RestResult;
import org.dubbo.x.util.ConstantVariable;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.uics.asset.entity.Attribute;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * 属性信息 接口
 *
* Created by tom on 2016-12-27 13:42:04.
 */

@Path("attributes")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({ContentType.APPLICATION_JSON_UTF_8})
@Api(value="attributes", description = "属性信息接口")
public interface AttributeRestService extends CURDRestService<Attribute>{
    /**
     * 属性信息
     * @return
     */
    @GET
    @Path("")
    @ApiOperation(value = "属性信息",
            notes = "属性信息列表.")
    RestResult<List<Attribute>> list(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token);

    /**
     * 属性信息 详细信息
     *
     * @return
     */
    @GET
    @Path("/{id}")
    @ApiOperation(value = "详细信息",
            notes = "属性信息详细信息.")
    RestResult<Attribute> detail(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token, @ApiParam("id") @PathParam("id") String uuid);

    @POST
    @Path("")
    @ApiOperation(value = "添加/修改属性信息", notes = "添加/修改属性信息")
    RestResult<Attribute> create(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token,Attribute attribute);

    @DELETE
    @Path("/{id}")
    @ApiOperation(value = "删除属性信息", notes = "删除属性信息")
    RestResult<String> delete(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token, @ApiParam("id") @PathParam("id") String uuid);
}
