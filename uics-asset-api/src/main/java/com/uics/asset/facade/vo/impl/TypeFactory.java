package com.uics.asset.facade.vo.impl;

import com.uics.asset.entity.Attribute;
import com.uics.asset.facade.vo.IType;

/**
 * Created by tom on 2016/12/29.
 */
public class TypeFactory {
    public static IType getInstanceByUniqueName(String uniqueName){
        if (uniqueName.equalsIgnoreCase(StringType.UNIQUE_NAME)){
            return new StringType();
        }else{
            return new StringType();
        }
    }
}
