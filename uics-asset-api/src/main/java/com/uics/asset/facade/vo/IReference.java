package com.uics.asset.facade.vo;

/**
 * 关联关系
 * Created by tom on 2016/12/29.
 */
public interface IReference {
    /**
     * 类型名称
     * @return
     */
    String getTypeName();

    /**
     * 源
     * @return
     */
    String getSource();

    /**
     * 目标
     * @return
     */
    String getTarget();

    /**
     * 目标对象
     * @return
     */
    CiBean getTargetBean();
}
