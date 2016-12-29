package com.uics.asset.facade.vo.impl;

import com.uics.asset.entity.Attribute;
import com.uics.asset.facade.vo.IReference;
import com.uics.asset.facade.vo.IType;

/**
 * Created by tom on 2016/12/29.
 */
public class ComplexType implements IType<IReference> {
    /**
     * 值
     */
    private IReference value;


    public ComplexType(IReference value) {
        this.value = value;
    }

    @Override
    public String getUniqueName() {
        return value.getTypeName();
    }

    @Override
    public IReference getValue() {
        return this.value;
    }

    @Override
    public IType<IReference> parse(Attribute value) {
        return this;
    }
}
