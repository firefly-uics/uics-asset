package com.uics.asset.entity;

import io.swagger.annotations.ApiModel;
import org.dubbo.x.entity.IdEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 变更信息
 * <p>
* Created by tom on 2016-12-27 13:42:04.
 */
@Entity
@Table(name = "t_rfc")
@ApiModel("变更信息")
public class Rfc extends IdEntity {
    
}

