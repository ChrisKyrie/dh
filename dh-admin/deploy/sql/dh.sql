CREATE DATABASE IF NOT EXISTS `dh` DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

USE `dh`;

-- 人力资源-员工
CREATE TABLE IF NOT EXISTS `employee` (
    `id`              BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
    `name`            VARCHAR(10) NULL COMMENT '员工姓名',
    `gender`          VARCHAR(6) NULL COMMENT '性别',
    `birthday`        DATE NULL COMMENT '出生日期',
    `id_card`         CHAR(18) NULL COMMENT '身份证号',
    `wedlock`         VARCHAR(10) NULL COMMENT '婚姻状况',
    `nation_id`       INT(8) NULL COMMENT '民族',
    `native_place`    VARCHAR(20) NULL COMMENT '籍贯',
    `politic_id`      INT(8) NULL COMMENT '政治面貌',
    `email`           VARCHAR(20) NULL COMMENT '邮箱',
    `phone`           VARCHAR(11) NULL COMMENT '电话号码',
    `address`         VARCHAR(64) NULL COMMENT '联系地址',
    `department_id`   INT(11) NULL COMMENT '所属部门',
    `job_level_id`    INT(11) NULL COMMENT '职称ID',
    `position_id`     INT(11) NULL COMMENT '职位ID',
    `engage_form`     VARCHAR(10) NULL COMMENT '聘用形式',
    `degree`          VARCHAR(10) NULL COMMENT '最高学历',
    `specialty`       VARCHAR(32) NULL COMMENT '所属专业',
    `school`          VARCHAR(32) NULL COMMENT '毕业院校',
    `begin_date`      DATE NULL COMMENT '入职日期',
    `work_state`      VARCHAR(10) NULL DEFAULT 'IN' COMMENT '在职状态',
    `work_id`         CHAR(8) NULL COMMENT '工号',
    `contract_term`   DOUBLE NULL COMMENT '合同期限',
    `conversion_time` DATE NULL COMMENT '转正日期',
    `depart_date`    DATE NULL COMMENT '离职日期',
    `begin_contract`  DATE NULL COMMENT '合同起始日期',
    `end_contract`    DATE NULL COMMENT '合同终止日期',
    `work_age`        INT(11) NULL COMMENT '工龄',
    `create_time`     TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP() COMMENT '创建时间',
    `update_time`     TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP() ON UPDATE CURRENT_TIMESTAMP() COMMENT '更新时间',
    `enabled`         TINYINT(1) NOT NULL DEFAULT 1 COMMENT '有效标志',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT '人力资源-员工';