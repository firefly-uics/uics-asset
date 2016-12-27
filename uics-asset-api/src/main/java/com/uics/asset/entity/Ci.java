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
 * 配置信息
 * <p>
* Created by tom on 2016-12-27 13:42:04.
 */
@Entity
@Table(name = "t_ci")
@ApiModel("配置信息")
public class Ci extends IdEntity {
    
}

