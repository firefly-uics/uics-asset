package com.uics.asset.facade.vo.impl;

import com.uics.asset.entity.Attribute;
import com.uics.asset.facade.vo.IType;

/**
 * Created by tom on 2016/12/29.
 */
public class StringType implements IType<String> {
    public static final String UNIQUE_NAME="xs:string";

    /**
     * 值
     */
    private String value = "";


    @Override
    public String getUniqueName() {
        return UNIQUE_NAME;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public IType<String> parse(Attribute value) {
        this.value = value.getValueAsString();
        return this;
    }
}
