package com.uics.asset.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.dubbo.x.entity.IdEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * 配置信息
 * <p>
* Created by tom on 2016-12-28 11:00:43.
 */
@Entity
@Table(name = "t_ci")
@ApiModel("配置信息")
public class Ci extends IdEntity {
    
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
     * 
     */
    @ApiModelProperty(value = "", required = false)
    
    @Column(columnDefinition = "")
    private Long gid;
    public Long getGid() {
        return gid;
    }
    public void setGid(Long gid) {
        this.gid = gid;
    }
    
    /**
     * id路径
     */
    @ApiModelProperty(value = "id路径", required = false)
    
    @Column(columnDefinition = "id路径")
    private String path;
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
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
     * 关联关系 源id
     */
    @ApiModelProperty(value = "源id", required = false)
    
    @Column(columnDefinition = "源id")
    private String sourceId;
    public String getSourceId() {
        return sourceId;
    }
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }
    
    /**
     * 源属性id
     */
    @ApiModelProperty(value = "源属性id", required = false)
    
    @Column(columnDefinition = "源属性id")
    private String sourceAttributeid;
    public String getSourceAttributeid() {
        return sourceAttributeid;
    }
    public void setSourceAttributeid(String sourceAttributeid) {
        this.sourceAttributeid = sourceAttributeid;
    }
    
    /**
     * 关联关系 目标id
     */
    @ApiModelProperty(value = "指标id", required = false)
    
    @Column(columnDefinition = "指标id")
    private String targetId;
    public String getTargetId() {
        return targetId;
    }
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }
    
    /**
     * 模版id
     */
    @ApiModelProperty(value = "模版id", required = false)
    
    @Column(columnDefinition = "模版id")
    private String sourceTemplatePath;
    public String getSourceTemplatePath() {
        return sourceTemplatePath;
    }
    public void setSourceTemplatePath(String sourceTemplatePath) {
        this.sourceTemplatePath = sourceTemplatePath;
    }
    
    /**
     * 指标模版id
     */
    @ApiModelProperty(value = "指标模版id", required = false)
    
    @Column(columnDefinition = "指标模版id")
    private String targetTemplatePath;
    public String getTargetTemplatePath() {
        return targetTemplatePath;
    }
    public void setTargetTemplatePath(String targetTemplatePath) {
        this.targetTemplatePath = targetTemplatePath;
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


    private Set<Attribute> attributes = new HashSet<Attribute>();

    @OneToMany
    @JoinColumn(name="owner_id")
    public Set<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(Set<Attribute> attributes) {
        this.attributes = attributes;
    }
}

