drop table if exists t_user;
create table t_user (
    userId           bigint(20)      not null auto_increment        comment '用户id',
    username         varchar(20)     not null                       comment '用户名',
    password         varchar(64)     not null                       comment '密码',
    nickname         varchar(20)     default null                   comment '用户昵称',
    email            varchar(50)     default null                   comment '用户邮箱',
    phoneNumber      varchar(20)     default null                   comment '手机号码',
    sex              tinyint         default 1                      comment '用户性别（1男 0女 2未知）',
    avatarUrl        varchar(128)    default null                   comment '头像地址',
    type             tinyint         default 0                      comment '帐号状态（0正常 1停用）',
    status           tinyint         default 0                      comment '帐号状态（0正常 1停用）',
    tmCreate         timestamp       DEFAULT CURRENT_TIMESTAMP      comment '创建时间',
    tmUpdate         timestamp       DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
    primary key (userId)
) engine=innodb auto_increment=1000000000 comment = '用户信息表';


-- create table t_order(
--                         createUserId            bigint(20)     default ''                 comment '更新者',
--                         createUserName          varchar(64)     default ''                 comment '更新者',
--                         updateUserId         bigint(20)     default null                 comment '更新者',
--                         updateUserName         varchar(64)     default null                 comment '更新者',
-- ) comment = '订单信息表';