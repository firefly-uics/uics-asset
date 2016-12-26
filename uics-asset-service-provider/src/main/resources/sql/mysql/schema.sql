--CREATE DATABASE IF NOT EXISTS asset DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
DROP TABLE t_attribute;
CREATE TABLE t_attribute
(
    id BIGINT(20) PRIMARY KEY NOT NULL COMMENT 'id',
    derived_from_id BIGINT(20) COMMENT '继承id',
    display_name VARCHAR(255) COMMENT '显示名称',
    alias VARCHAR(255) COMMENT '别名',
    complex_value BIT(1) COMMENT '复合',
    is_blueprint BIT(1) COMMENT '大纲',
    description VARCHAR(1024) COMMENT '描述',
    type_name VARCHAR(255) COMMENT '类型名',
    reftypename VARCHAR(255) COMMENT '引用类型',
    value_as_string VARCHAR(1024) COMMENT '字符串值',
    value_as_long BIGINT(20) COMMENT '长整型值',
    value_as_date DATETIME COMMENT '日期类型值',
    owner_id BIGINT(20) COMMENT '所有者id',
    max_occurs INT(11) COMMENT '最长',
    min_occurs INT(11) COMMENT '最小',
    last_modified DATETIME COMMENT '最后修改时间',
    create_time DATETIME COMMENT '创建时间'
)  COMMENT '属性';

CREATE INDEX alias_atr_idx ON t_attribute (alias);
CREATE INDEX derived_from_id_atr_idx ON t_attribute (derived_from_id);
CREATE INDEX ownerId_atr_idx ON t_attribute (owner_id);
CREATE INDEX value_as_long_atr_idx ON t_attribute (value_as_long);

DROP TABLE t_ci;
CREATE TABLE t_ci
(
    id BIGINT(20) PRIMARY KEY NOT NULL COMMENT 'id',
    derived_from_id BIGINT(20) COMMENT '继承id',
    display_name VARCHAR(255) COMMENT '显示名称',
    alias VARCHAR(255) COMMENT '别名',
    gid BIGINT(20) COMMENT '',
    path VARCHAR(1024) COMMENT 'id路径',
    is_blueprint BIT(1) COMMENT '大纲',
    description VARCHAR(1024) COMMENT '描述',
    source_id BIGINT(20) COMMENT '源id',
    source_attributeid BIGINT(20) COMMENT '源属性id',
    target_id BIGINT(20) COMMENT '指标id',
    source_template_path VARCHAR(1024) COMMENT '模版id',
    target_template_path VARCHAR(1024) COMMENT '指标模版id',
    last_modified DATETIME COMMENT '最后修改时间',
    create_time DATETIME COMMENT '创建时间'
) COMMENT '配置项';
CREATE INDEX alias_ci_idx ON t_ci (alias);
CREATE INDEX derived_from_id_ci_idx ON t_ci (derived_from_id);
CREATE INDEX gid_ci_idx ON t_ci (gid);

CREATE TABLE t_cmdb_tx
(
    id BIGINT(20) PRIMARY KEY NOT NULL COMMENT 'id',
    name VARCHAR(255) COMMENT '名称',
    status INT(11) COMMENT '状态',
    issuer VARCHAR(255) COMMENT '发布者',
    insert_ts DATETIME COMMENT '插入事务时间',
    begin_Ts DATETIME COMMENT '事务开始时间',
    endTs DATETIME COMMENT '事务结束时间',
    reject_Cause VARCHAR(255) COMMENT '拒绝原因',
    ciModified INT(11) COMMENT '配置项修改',
    ciAdded INT(11) COMMENT '配置项添加',
    ciDeleted INT(11) COMMENT '配置项删除'
) COMMENT '变更事务管理';

CREATE TABLE t_rfc
(
    id BIGINT(20) PRIMARY KEY NOT NULL COMMENT 'id',
    rfc_type VARCHAR(255) NOT NULL COMMENT '变更类型',
    parent_id BIGINT(20) COMMENT '父级id',
    target_id BIGINT(20) COMMENT '目标id',
    target_ci_id BIGINT(20) COMMENT '目标ci id',
    target_alias VARCHAR(255) COMMENT '目标 别名',
    tx_id BIGINT(20) COMMENT '事务id',
    ts DATETIME COMMENT 'id',
    destroyed_alias VARCHAR(255) COMMENT '销毁别名',
    destroyed_id BIGINT(20) COMMENT '销毁id',
    was_ci BIT(1) COMMENT '是否配置项',
    new_alias VARCHAR(255) COMMENT '新别名',
    old_alias VARCHAR(255) COMMENT '原别名',
    new_template BIT(1) COMMENT '新模版',
    old_template BIT(1) COMMENT '原摸版',
    description VARCHAR(1024) COMMENT '描述',
    new_display_name_expression VARCHAR(255) COMMENT '新显示名称表达式',
    old_display_name_expression VARCHAR(255) COMMENT '原显示名称表达式',
    from_id BIGINT(20) COMMENT '源id',
    to_id BIGINT(20) COMMENT '目标id',
    to_alias VARCHAR(255) COMMENT '目标别名',
    old_reference_type_alias VARCHAR(255) COMMENT '原引用类型别名',
    new_reference_type_alias VARCHAR(255) COMMENT '新引用类型名别',
    old_type_alias VARCHAR(255) COMMENT '原类型别名',
    new_type_alias VARCHAR(255) COMMENT '新类型别名',
    old_max_occurs INT(11) COMMENT '原长度',
    new_max_occurs INT(11) COMMENT '新长度',
    old_min_occurs INT(11) COMMENT '原最短长度',
    new_min_occurs INT(11) COMMENT '新最长长度',
    old_value VARCHAR(1024) COMMENT '原值',
    new_value VARCHAR(1024) COMMENT '新值',
    new_value_as_alias VARCHAR(255) COMMENT '新值别名',
    value VARCHAR(1024) COMMENT '当前值',
    indx INT(11) COMMENT '事务',
    alias VARCHAR(255) COMMENT '别名',
    value_as_alias VARCHAR(255) COMMENT '值别名',
    old_owner_id BIGINT(20) COMMENT '原所有者',
    new_owner_id BIGINT(20) COMMENT '新所有者',
    source_attribute_id BIGINT(20) COMMENT '源附件id',
    reference_target VARCHAR(255) COMMENT '应用目标'
) COMMENT '变更请求';