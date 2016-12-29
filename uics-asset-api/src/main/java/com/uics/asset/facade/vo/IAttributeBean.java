package com.uics.asset.facade.vo;

/**
 * 配置项属性实例对象
 * Created by tom on 2016/12/29.
 */
public interface IAttributeBean<S, T extends IType<S>>{
    /**
     * 显示名称
     * @return
     */
    String getDisplayName();

    /**
     * 别名
     * @return
     */
    String getAlias();

    /**
     * 类型
     * @return
     */
    T getType();

    /**
     * 获取属性值
     *
     * @return
     */
    S getValue();
}
