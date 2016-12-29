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
 * 变更信息
 * <p>
* Created by tom on 2016-12-28 10:59:49.
 */
@Entity
@Table(name = "t_rfc")
@ApiModel("变更信息")
public class Rfc extends IdEntity {
    
    /**
     * 变更类型
     */
    @ApiModelProperty(value = "变更类型", required = false)
    
    @Column(columnDefinition = "变更类型")
    private String rfcType;
    public String getRfcType() {
        return rfcType;
    }
    public void setRfcType(String rfcType) {
        this.rfcType = rfcType;
    }
    
    /**
     * 父级id
     */
    @ApiModelProperty(value = "父级id", required = false)
    
    @Column(columnDefinition = "父级id")
    private Integer parentId;
    public Integer getParentId() {
        return parentId;
    }
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
    
    /**
     * 目标id
     */
    @ApiModelProperty(value = "目标id", required = false)
    
    @Column(columnDefinition = "目标id")
    private Integer targetId;
    public Integer getTargetId() {
        return targetId;
    }
    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }
    
    /**
     * 目标ci id
     */
    @ApiModelProperty(value = "目标ci id", required = false)
    
    @Column(columnDefinition = "目标ci id")
    private Integer targetCiId;
    public Integer getTargetCiId() {
        return targetCiId;
    }
    public void setTargetCiId(Integer targetCiId) {
        this.targetCiId = targetCiId;
    }
    
    /**
     * 目标 别名
     */
    @ApiModelProperty(value = "目标 别名", required = false)
    
    @Column(columnDefinition = "目标 别名")
    private String targetAlias;
    public String getTargetAlias() {
        return targetAlias;
    }
    public void setTargetAlias(String targetAlias) {
        this.targetAlias = targetAlias;
    }
    
    /**
     * 事务id
     */
    @ApiModelProperty(value = "事务id", required = false)
    
    @Column(columnDefinition = "事务id")
    private Integer txId;
    public Integer getTxId() {
        return txId;
    }
    public void setTxId(Integer txId) {
        this.txId = txId;
    }
    
    /**
     * id
     */
    @ApiModelProperty(value = "id", required = false)
    
    @Column(columnDefinition = "id")
    private String ts;
    public String getTs() {
        return ts;
    }
    public void setTs(String ts) {
        this.ts = ts;
    }
    
    /**
     * 销毁别名
     */
    @ApiModelProperty(value = "销毁别名", required = false)
    
    @Column(columnDefinition = "销毁别名")
    private String destroyedAlias;
    public String getDestroyedAlias() {
        return destroyedAlias;
    }
    public void setDestroyedAlias(String destroyedAlias) {
        this.destroyedAlias = destroyedAlias;
    }
    
    /**
     * 销毁id
     */
    @ApiModelProperty(value = "销毁id", required = false)
    
    @Column(columnDefinition = "销毁id")
    private Integer destroyedId;
    public Integer getDestroyedId() {
        return destroyedId;
    }
    public void setDestroyedId(Integer destroyedId) {
        this.destroyedId = destroyedId;
    }
    
    /**
     * 是否配置项
     */
    @ApiModelProperty(value = "是否配置项", required = false)
    
    @Column(columnDefinition = "是否配置项")
    private String wasCi;
    public String getWasCi() {
        return wasCi;
    }
    public void setWasCi(String wasCi) {
        this.wasCi = wasCi;
    }
    
    /**
     * 新别名
     */
    @ApiModelProperty(value = "新别名", required = false)
    
    @Column(columnDefinition = "新别名")
    private String newAlias;
    public String getNewAlias() {
        return newAlias;
    }
    public void setNewAlias(String newAlias) {
        this.newAlias = newAlias;
    }
    
    /**
     * 原别名
     */
    @ApiModelProperty(value = "原别名", required = false)
    
    @Column(columnDefinition = "原别名")
    private String oldAlias;
    public String getOldAlias() {
        return oldAlias;
    }
    public void setOldAlias(String oldAlias) {
        this.oldAlias = oldAlias;
    }
    
    /**
     * 新模版
     */
    @ApiModelProperty(value = "新模版", required = false)
    
    @Column(columnDefinition = "新模版")
    private String newTemplate;
    public String getNewTemplate() {
        return newTemplate;
    }
    public void setNewTemplate(String newTemplate) {
        this.newTemplate = newTemplate;
    }
    
    /**
     * 原摸版
     */
    @ApiModelProperty(value = "原摸版", required = false)
    
    @Column(columnDefinition = "原摸版")
    private String oldTemplate;
    public String getOldTemplate() {
        return oldTemplate;
    }
    public void setOldTemplate(String oldTemplate) {
        this.oldTemplate = oldTemplate;
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
     * 新显示名称表达式
     */
    @ApiModelProperty(value = "新显示名称表达式", required = false)
    
    @Column(columnDefinition = "新显示名称表达式")
    private String newDisplayNameExpression;
    public String getNewDisplayNameExpression() {
        return newDisplayNameExpression;
    }
    public void setNewDisplayNameExpression(String newDisplayNameExpression) {
        this.newDisplayNameExpression = newDisplayNameExpression;
    }
    
    /**
     * 原显示名称表达式
     */
    @ApiModelProperty(value = "原显示名称表达式", required = false)
    
    @Column(columnDefinition = "原显示名称表达式")
    private String oldDisplayNameExpression;
    public String getOldDisplayNameExpression() {
        return oldDisplayNameExpression;
    }
    public void setOldDisplayNameExpression(String oldDisplayNameExpression) {
        this.oldDisplayNameExpression = oldDisplayNameExpression;
    }
    
    /**
     * 源id
     */
    @ApiModelProperty(value = "源id", required = false)
    
    @Column(columnDefinition = "源id")
    private Integer fromId;
    public Integer getFromId() {
        return fromId;
    }
    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }
    
    /**
     * 目标id
     */
    @ApiModelProperty(value = "目标id", required = false)
    
    @Column(columnDefinition = "目标id")
    private Integer toId;
    public Integer getToId() {
        return toId;
    }
    public void setToId(Integer toId) {
        this.toId = toId;
    }
    
    /**
     * 目标别名
     */
    @ApiModelProperty(value = "目标别名", required = false)
    
    @Column(columnDefinition = "目标别名")
    private String toAlias;
    public String getToAlias() {
        return toAlias;
    }
    public void setToAlias(String toAlias) {
        this.toAlias = toAlias;
    }
    
    /**
     * 原引用类型别名
     */
    @ApiModelProperty(value = "原引用类型别名", required = false)
    
    @Column(columnDefinition = "原引用类型别名")
    private String oldReferenceTypeAlias;
    public String getOldReferenceTypeAlias() {
        return oldReferenceTypeAlias;
    }
    public void setOldReferenceTypeAlias(String oldReferenceTypeAlias) {
        this.oldReferenceTypeAlias = oldReferenceTypeAlias;
    }
    
    /**
     * 新引用类型名别
     */
    @ApiModelProperty(value = "新引用类型名别", required = false)
    
    @Column(columnDefinition = "新引用类型名别")
    private String newReferenceTypeAlias;
    public String getNewReferenceTypeAlias() {
        return newReferenceTypeAlias;
    }
    public void setNewReferenceTypeAlias(String newReferenceTypeAlias) {
        this.newReferenceTypeAlias = newReferenceTypeAlias;
    }
    
    /**
     * 原类型别名
     */
    @ApiModelProperty(value = "原类型别名", required = false)
    
    @Column(columnDefinition = "原类型别名")
    private String oldTypeAlias;
    public String getOldTypeAlias() {
        return oldTypeAlias;
    }
    public void setOldTypeAlias(String oldTypeAlias) {
        this.oldTypeAlias = oldTypeAlias;
    }
    
    /**
     * 新类型别名
     */
    @ApiModelProperty(value = "新类型别名", required = false)
    
    @Column(columnDefinition = "新类型别名")
    private String newTypeAlias;
    public String getNewTypeAlias() {
        return newTypeAlias;
    }
    public void setNewTypeAlias(String newTypeAlias) {
        this.newTypeAlias = newTypeAlias;
    }
    
    /**
     * 原长度
     */
    @ApiModelProperty(value = "原长度", required = false)
    
    @Column(columnDefinition = "原长度")
    private Integer oldMaxOccurs;
    public Integer getOldMaxOccurs() {
        return oldMaxOccurs;
    }
    public void setOldMaxOccurs(Integer oldMaxOccurs) {
        this.oldMaxOccurs = oldMaxOccurs;
    }
    
    /**
     * 新长度
     */
    @ApiModelProperty(value = "新长度", required = false)
    
    @Column(columnDefinition = "新长度")
    private Integer newMaxOccurs;
    public Integer getNewMaxOccurs() {
        return newMaxOccurs;
    }
    public void setNewMaxOccurs(Integer newMaxOccurs) {
        this.newMaxOccurs = newMaxOccurs;
    }
    
    /**
     * 原最短长度
     */
    @ApiModelProperty(value = "原最短长度", required = false)
    
    @Column(columnDefinition = "原最短长度")
    private Integer oldMinOccurs;
    public Integer getOldMinOccurs() {
        return oldMinOccurs;
    }
    public void setOldMinOccurs(Integer oldMinOccurs) {
        this.oldMinOccurs = oldMinOccurs;
    }
    
    /**
     * 新最长长度
     */
    @ApiModelProperty(value = "新最长长度", required = false)
    
    @Column(columnDefinition = "新最长长度")
    private Integer newMinOccurs;
    public Integer getNewMinOccurs() {
        return newMinOccurs;
    }
    public void setNewMinOccurs(Integer newMinOccurs) {
        this.newMinOccurs = newMinOccurs;
    }
    
    /**
     * 原值
     */
    @ApiModelProperty(value = "原值", required = false)
    
    @Column(columnDefinition = "原值")
    private String oldValue;
    public String getOldValue() {
        return oldValue;
    }
    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }
    
    /**
     * 新值
     */
    @ApiModelProperty(value = "新值", required = false)
    
    @Column(columnDefinition = "新值")
    private String newValue;
    public String getNewValue() {
        return newValue;
    }
    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }
    
    /**
     * 新值别名
     */
    @ApiModelProperty(value = "新值别名", required = false)
    
    @Column(columnDefinition = "新值别名")
    private String newValueAsAlias;
    public String getNewValueAsAlias() {
        return newValueAsAlias;
    }
    public void setNewValueAsAlias(String newValueAsAlias) {
        this.newValueAsAlias = newValueAsAlias;
    }
    
    /**
     * 当前值
     */
    @ApiModelProperty(value = "当前值", required = false)
    
    @Column(columnDefinition = "当前值")
    private String value;
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * 事务
     */
    @ApiModelProperty(value = "事务", required = false)
    
    @Column(columnDefinition = "事务")
    private Integer indx;
    public Integer getIndx() {
        return indx;
    }
    public void setIndx(Integer indx) {
        this.indx = indx;
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
     * 值别名
     */
    @ApiModelProperty(value = "值别名", required = false)
    
    @Column(columnDefinition = "值别名")
    private String valueAsAlias;
    public String getValueAsAlias() {
        return valueAsAlias;
    }
    public void setValueAsAlias(String valueAsAlias) {
        this.valueAsAlias = valueAsAlias;
    }
    
    /**
     * 原所有者
     */
    @ApiModelProperty(value = "原所有者", required = false)
    
    @Column(columnDefinition = "原所有者")
    private Integer oldOwnerId;
    public Integer getOldOwnerId() {
        return oldOwnerId;
    }
    public void setOldOwnerId(Integer oldOwnerId) {
        this.oldOwnerId = oldOwnerId;
    }
    
    /**
     * 新所有者
     */
    @ApiModelProperty(value = "新所有者", required = false)
    
    @Column(columnDefinition = "新所有者")
    private Integer newOwnerId;
    public Integer getNewOwnerId() {
        return newOwnerId;
    }
    public void setNewOwnerId(Integer newOwnerId) {
        this.newOwnerId = newOwnerId;
    }
    
    /**
     * 源附件id
     */
    @ApiModelProperty(value = "源附件id", required = false)
    
    @Column(columnDefinition = "源附件id")
    private Integer sourceAttributeId;
    public Integer getSourceAttributeId() {
        return sourceAttributeId;
    }
    public void setSourceAttributeId(Integer sourceAttributeId) {
        this.sourceAttributeId = sourceAttributeId;
    }
    
    /**
     * 应用目标
     */
    @ApiModelProperty(value = "应用目标", required = false)
    
    @Column(columnDefinition = "应用目标")
    private String referenceTarget;
    public String getReferenceTarget() {
        return referenceTarget;
    }
    public void setReferenceTarget(String referenceTarget) {
        this.referenceTarget = referenceTarget;
    }

}

