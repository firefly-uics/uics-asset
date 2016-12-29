package com.uics.asset.facade.vo;

import java.util.List;

/**
 * 配置项实例对象
 * Created by tom on 2016/12/29.
 */
public interface ICiBean {
    /**
     * 显示名称
     * @return
     */
    String getDisplayName();

    /**
     * 显示名称 表达式
     * @return
     */
    String getDisplayNameExpression();

    /**
     * 继承模版名称
     * @return
     */
    String getDerivedFrom();

    /**
     * 别名
     * @return
     */
    String getAlias();

    /**
     * 获取模型属性实例
     * @return
     */
    List<IAttributeBean> getAttributeBeans();
}
