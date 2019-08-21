CREATE TABLE `manager-template`.`pub_menu`(  
  `id` BIGINT(32) NOT NULL COMMENT '主键',
  `has_child` TINYINT(2) COMMENT '是否有子节点',
  `icon` VARCHAR(128) COMMENT '图标',
  `parent_id` BIGINT(32) COMMENT '父级菜单',
  `path` VARCHAR(32) COMMENT '路径',
  `sort` TINYINT(3) NOT NULL DEFAULT 0 COMMENT '排序',
  `title` VARCHAR(32) NOT NULL,
  `is_show` TINYINT(2) DEFAULT 1 COMMENT '是否显示 1：显示 0 不显示',
  `remark` VARCHAR(255) COMMENT '备注',
  `node` TINYINT(1),
  PRIMARY KEY (`id`)
) ENGINE=INNODB CHARSET=utf8 COLLATE=utf8_general_ci;
