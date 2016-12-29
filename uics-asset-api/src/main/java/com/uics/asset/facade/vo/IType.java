package com.uics.asset.facade.vo;

import com.uics.asset.entity.Attribute;

/**
 * Created by tom on 2016/12/29.
 */
public interface IType<T> {
    /**
     * 类型标示
     *
     * @return
     */
    String getUniqueName();

    T getValue();

    IType<T> parse(Attribute value);
}
