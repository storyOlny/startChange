CREATE TABLE `life`
(
    `id`          bigint (255) NOT NULL COMMENT '主键id',
    `description` varchar(255) CHARACTER SET `utf8` COLLATE `utf8_general_ci` NULL DEFAULT '' COMMENT '人生描述',
    PRIMARY KEY (`id`)
) COMMENT = "demo测试数据库" ENGINE = innodb DEFAULT CHARACTER SET = "utf8" COLLATE = "utf8_general_ci"

