package com.uics.asset.facade.vo;

import com.uics.asset.entity.Attribute;
import com.uics.asset.entity.Ci;
import com.uics.asset.facade.vo.impl.AttributeBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tom on 2016/12/29.
 */
public class CiBean implements ICiBean{
    /**
     * 配置模版
     */
    private Ci ci;
    /**
     * 模版属性信息
     */
    private List<IAttributeBean> attributeBeens;

    public CiBean(Ci ci, IAttributeBeanParse iAttributeBeanParse) {
        this.ci = ci;
        attributeBeens = new ArrayList<IAttributeBean>();

        for (Attribute attribute:ci.getAttributes()){
            attributeBeens.add(iAttributeBeanParse.parse(attribute));
        }
    }

    @Override
    public String getDisplayName() {
        return ci.getDisplayName();
    }

    @Override
    public String getDisplayNameExpression() {
        return ci.getDisplayName();
    }

    @Override
    public String getDerivedFrom() {
        return ci.getDerivedFromId();
    }

    @Override
    public String getAlias() {
        return ci.getAlias();
    }

    @Override
    public List<IAttributeBean> getAttributeBeans() {
        return attributeBeens;
    }
}
