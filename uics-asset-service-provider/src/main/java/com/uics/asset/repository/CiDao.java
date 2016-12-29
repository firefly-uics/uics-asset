package com.uics.asset.repository;

import com.uics.asset.entity.Ci;
import org.dubbo.x.repository.DaoBase;

import java.util.List;

/**
 * 配置信息
* Created by tom on 2016-12-27 13:42:04.
 **/
public interface CiDao extends DaoBase<Ci> {
    Ci findByAlias(String alias);

    List<Ci> findByDerivedFromId(String id);

    Ci findByAliasAndIsBlueprint(String alias, boolean isBlueprint);

    List<Ci> findByDerivedFromIdAndIsBlueprint(String id, boolean isBlueprint);

    List<Ci> findByPathLikeAndIsBlueprint(String s, boolean b);

    Ci findById(String targetId);
}
