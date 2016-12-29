package com.uics.asset.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.dubbo.x.entity.IdEntity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.Date;

/**
 * 属性信息
 * <p>
* Created by tom on 2016-12-28 10:59:49.
 */
@Entity
@Table(name = "t_attribute")
@ApiModel("属性信息")
public class Attribute extends IdEntity {
    
    /**
     * 继承id
     */
    @ApiModelProperty(value = "继承id", required = false)
    
    @Column(columnDefinition = "继承id")
    private String derivedFromId;
    public String getDerivedFromId() {
        return derivedFromId;
    }
    public void setDerivedFromId(String derivedFromId) {
        this.derivedFromId = derivedFromId;
    }
    
    /**
     * 显示名称
     */
    @ApiModelProperty(value = "显示名称", required = false)
    
    @Column(columnDefinition = "显示名称")
    private String displayName;
    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    
    /**
     * 别名
     */
    @ApiModelProperty(value = "别名", required = false)
    
    @Column(columnDefinition = "别名")
    private String alias;
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    /**
     * 复合
     */
    @ApiModelProperty(value = "复合", required = false)
    
    @Column(columnDefinition = "复合")
    private Boolean complexValue;
    public Boolean getComplexValue() {
        return complexValue;
    }
    public void setComplexValue(Boolean complexValue) {
        this.complexValue = complexValue;
    }
    
    /**
     * 大纲
     */
    @ApiModelProperty(value = "大纲", required = false)
    
    @Column(columnDefinition = "大纲")
    private Boolean isBlueprint;
    public Boolean getIsBlueprint() {
        return isBlueprint;
    }
    public void setIsBlueprint(Boolean isBlueprint) {
        this.isBlueprint = isBlueprint;
    }
    
    /**
     * 描述
     */
    @ApiModelProperty(value = "描述", required = false)
    
    @Column(columnDefinition = "描述")
    private String description;
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * 类型名
     */
    @ApiModelProperty(value = "类型名", required = false)
    
    @Column(columnDefinition = "类型名")
    private String typeName;
    public String getTypeName() {
        return typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    
    /**
     * 引用类型
     */
    @ApiModelProperty(value = "引用类型", required = false)
    
    @Column(columnDefinition = "引用类型")
    private String reftypename;
    public String getReftypename() {
        return reftypename;
    }
    public void setReftypename(String reftypename) {
        this.reftypename = reftypename;
    }
    
    /**
     * 字符串值
     */
    @ApiModelProperty(value = "字符串值", required = false)
    
    @Column(columnDefinition = "字符串值")
    private String valueAsString;
    public String getValueAsString() {
        return valueAsString;
    }
    public void setValueAsString(String valueAsString) {
        this.valueAsString = valueAsString;
    }
    
    /**
     * 长整型值
     */
    @ApiModelProperty(value = "长整型值", required = false)
    @Column(columnDefinition = "长整型值")
    private Long valueAsLong;
    public Long getValueAsLong() {
        return valueAsLong;
    }
    public void setValueAsLong(Long valueAsLong) {
        this.valueAsLong = valueAsLong;
    }
    
    /**
     * 日期类型值
     */
    @ApiModelProperty(value = "日期类型值", required = false)
    
    @Column(columnDefinition = "日期类型值")
    private String valueAsDate;
    public String getValueAsDate() {
        return valueAsDate;
    }
    public void setValueAsDate(String valueAsDate) {
        this.valueAsDate = valueAsDate;
    }
    
//    /**
//     * 所有者id
//     */
//    @ApiModelProperty(value = "所有者id", required = false)
//
//    @Column(columnDefinition = "所有者id")
//    private Integer ownerId;
//    public Integer getOwnerId() {
//        return ownerId;
//    }
//    public void setOwnerId(Integer ownerId) {
//        this.ownerId = ownerId;
//    }
    
    /**
     * 最长
     */
    @ApiModelProperty(value = "最长", required = false)
    
    @Column(columnDefinition = "最长")
    private Integer maxOccurs;
    public Integer getMaxOccurs() {
        return maxOccurs;
    }
    public void setMaxOccurs(Integer maxOccurs) {
        this.maxOccurs = maxOccurs;
    }
    
    /**
     * 最小
     */
    @ApiModelProperty(value = "最小", required = false)
    
    @Column(columnDefinition = "最小")
    private Integer minOccurs;
    public Integer getMinOccurs() {
        return minOccurs;
    }
    public void setMinOccurs(Integer minOccurs) {
        this.minOccurs = minOccurs;
    }
    
    /**
     * 最后修改时间
     */
    @ApiModelProperty(value = "最后修改时间", required = false)
    
    @Column(columnDefinition = "最后修改时间")
    private String lastModified;
    public String getLastModified() {
        return lastModified;
    }
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }
    
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", required = false)
    
    @Column(columnDefinition = "创建时间")
    private String createTime;
    public String getCreateTime() {
        return createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}

