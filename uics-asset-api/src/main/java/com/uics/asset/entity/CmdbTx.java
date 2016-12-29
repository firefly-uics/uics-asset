package com.uics.asset.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.dubbo.x.entity.IdEntity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import java.util.Date;

/**
 * 事务信息
 * <p>
* Created by tom on 2016-12-28 10:59:49.
 */
@Entity
@Table(name = "t_cmdb_tx")
@ApiModel("事务信息")
public class CmdbTx extends IdEntity {
    
    /**
     * 名称
     */
    @ApiModelProperty(value = "名称", required = false)
    
    @Column(columnDefinition = "名称")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 发布者
     */
    @ApiModelProperty(value = "发布者", required = false)
    
    @Column(columnDefinition = "发布者")
    private String issuer;
    public String getIssuer() {
        return issuer;
    }
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }
    
    /**
     * 插入事务时间
     */
    @ApiModelProperty(value = "插入事务时间", required = false)
    
    @Column(columnDefinition = "插入事务时间")
    private String insertTs;
    public String getInsertTs() {
        return insertTs;
    }
    public void setInsertTs(String insertTs) {
        this.insertTs = insertTs;
    }
    
    /**
     * 事务开始时间
     */
    @ApiModelProperty(value = "事务开始时间", required = false)
    
    @Column(columnDefinition = "事务开始时间")
    private String beginTs;
    public String getBeginTs() {
        return beginTs;
    }
    public void setBeginTs(String beginTs) {
        this.beginTs = beginTs;
    }
    
    /**
     * 事务结束时间
     */
    @ApiModelProperty(value = "事务结束时间", required = false)
    
    @Column(columnDefinition = "事务结束时间")
    private String endTs;
    public String getEndTs() {
        return endTs;
    }
    public void setEndTs(String endTs) {
        this.endTs = endTs;
    }
    
    /**
     * 拒绝原因
     */
    @ApiModelProperty(value = "拒绝原因", required = false)
    
    @Column(columnDefinition = "拒绝原因")
    private String rejectCause;
    public String getRejectCause() {
        return rejectCause;
    }
    public void setRejectCause(String rejectCause) {
        this.rejectCause = rejectCause;
    }
    
    /**
     * 配置项修改
     */
    @ApiModelProperty(value = "配置项修改", required = false)
    
    @Column(columnDefinition = "配置项修改")
    private Integer ciModified;
    public Integer getCiModified() {
        return ciModified;
    }
    public void setCiModified(Integer ciModified) {
        this.ciModified = ciModified;
    }
    
    /**
     * 配置项添加
     */
    @ApiModelProperty(value = "配置项添加", required = false)
    
    @Column(columnDefinition = "配置项添加")
    private Integer ciAdded;
    public Integer getCiAdded() {
        return ciAdded;
    }
    public void setCiAdded(Integer ciAdded) {
        this.ciAdded = ciAdded;
    }
    
    /**
     * 配置项删除
     */
    @ApiModelProperty(value = "配置项删除", required = false)
    
    @Column(columnDefinition = "配置项删除")
    private Integer ciDeleted;
    public Integer getCiDeleted() {
        return ciDeleted;
    }
    public void setCiDeleted(Integer ciDeleted) {
        this.ciDeleted = ciDeleted;
    }
    

}

