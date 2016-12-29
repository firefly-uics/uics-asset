package com.uics.asset.facade.vo.impl;

import com.uics.asset.entity.Attribute;
import com.uics.asset.facade.vo.IAttributeBean;
import com.uics.asset.facade.vo.IType;

/**
 * 配置项属性实例对象
 * Created by tom on 2016/12/29.
 */
public class AttributeBean<S> implements IAttributeBean {
    private String displayName;
    private String alias;
    private IType<S> type;

    public AttributeBean(String displayName, String alias, IType<S> type) {
        this.displayName = displayName;
        this.alias = alias;
        this.type = type;
    }

    @Override
    public String getDisplayName() {
        return this.displayName;
    }

    @Override
    public String getAlias() {
        return this.alias;
    }

    @Override
    public IType getType() {
        return type;
    }

    @Override
    public S getValue() {
        return type.getValue();
    }
}

