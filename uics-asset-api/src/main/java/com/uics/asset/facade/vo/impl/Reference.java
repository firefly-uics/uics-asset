package com.uics.asset.facade.vo.impl;

import com.uics.asset.facade.vo.CiBean;
import com.uics.asset.facade.vo.IReference;

/**
 * Created by tom on 2016/12/29.
 */
public class Reference implements IReference{
    private String source;
    private String target;
    private CiBean targetBean;

    public Reference(String source, String target, CiBean targetBean) {
        this.source = source;
        this.target = target;
        this.targetBean = targetBean;
    }

    @Override
    public String getTypeName() {
        return "complexType";
    }

    @Override
    public String getSource() {
        return this.source;
    }

    @Override
    public String getTarget() {
        return this.target;
    }

    @Override
    public CiBean getTargetBean() {
        return targetBean;
    }
}
