package com.uics.asset.facade.vo;

import com.uics.asset.entity.Attribute;

/**
 * 配置项属性实例对象
 * Created by tom on 2016/12/29.
 */
public interface IAttributeBeanParse{
    IAttributeBean parse(Attribute attribute);
}
