create table template
(
    id          bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',


    status      char(1)     default '0' comment '帐号状态（0正常 1停用）',
    del_flag    char(1)     default '0' comment '删除标志（0代表存在 2代表删除）',
    create_by   varchar(64) default '' comment '创建者',
    create_time datetime comment '创建时间',
    update_by   varchar(64) default '' comment '更新者',
    update_time datetime comment '更新时间',
    primary key (id)
) comment '模板';

# 产品相关表
create table product_category
(
    id            bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
    code          varchar(20) comment '分类编码',
    name          varchar(20) comment '分类名称',
    icon          varchar(500) DEFAULT NULL COMMENT '分类图标',
    category_flag char(1) comment '1 表示手机分类，2 表示配件分类',

    status        char(1)      default '0' comment '状态（0正常 1停用）',
    del_flag      char(1)      default '0' comment '删除标志（0代表存在 2代表删除）',
    create_by     varchar(64)  default '' comment '创建者',
    create_time   datetime comment '创建时间',
    update_by     varchar(64)  default '' comment '更新者',
    update_time   datetime comment '更新时间',
    primary key (id)
) comment '分类表';

create table product
(
    id                 bigint(20)   NOT NULL AUTO_INCREMENT COMMENT '自增id',
    product_sn         varchar(64) comment '货号',
    name               varchar(64) comment '产品名称',
    pic                varchar(255) comment '封面图',
    title              varchar(250) not null comment '产品标题',
    subtitle           varchar(250) comment '副标题',
    product_price      decimal(10, 2) comment '产品价格',
    category_id        bigint(20) comment '分类ID',
    publish_status     int(1)       DEFAULT NULL COMMENT '上架状态：0->下架；1->上架',
    new_status         int(1)       DEFAULT NULL COMMENT '新品状态:0->不是新品；1->新品',
    sort               int(11)      DEFAULT NULL COMMENT '排序',
    sale               int(11)      DEFAULT NULL COMMENT '销量',
    detail_html        text COMMENT '产品详情内容',
    description        text comment '描述',
    album_pics         varchar(255) DEFAULT NULL COMMENT '产品图片限制为5张，以逗号分割',

    status             char(1)      default '0' comment '状态（0正常 1停用）',
    del_flag           char(1)      default '0' comment '删除标志（0代表存在 2代表删除）',
    create_by          varchar(64)  default '' comment '创建者',
    create_time        datetime comment '创建时间',
    update_by          varchar(64)  default '' comment '更新者',
    update_time        datetime comment '更新时间',
    primary key (id)
) comment '手机实体表';

create table product_parameter_category
(
    id          bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
    product_id  bigint(20) comment '产品id',
    name        varchar(20) comment '产品属性分类名称',

    status      char(1)     default '0' comment '状态（0正常 1停用）',
    del_flag    char(1)     default '0' comment '删除标志（0代表存在 2代表删除）',
    create_by   varchar(64) default '' comment '创建者',
    create_time datetime comment '创建时间',
    update_by   varchar(64) default '' comment '更新者',
    update_time datetime comment '更新时间',
    primary key (id)
) comment '产品参数分类表';

create table product_parameter
(
    id                    bigint(20)  NOT NULL AUTO_INCREMENT COMMENT '自增id',
    parameter_key         varchar(10) not null comment '产品属性key名称',
    parameter_value       varchar(20) not null comment '产品属性value值',
    parameter_category_id bigint(20) comment '产品参数分类ID',

    del_flag              char(1)     default '0' comment '删除标志（0代表存在 2代表删除）',
    create_by             varchar(64) default '' comment '创建者',
    create_time           datetime comment '创建时间',
    update_by             varchar(64) default '' comment '更新者',
    update_time           datetime comment '更新时间',
    primary key (id)
) comment '产品参数Key';

#==================================================================#

