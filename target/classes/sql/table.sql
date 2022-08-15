DROP TABLE IF EXISTS `data_set`;
CREATE TABLE `data_set`(
`id` 		      BIGINT 		UNSIGNED     NOT NULL AUTO_INCREMENT 	               COMMENT 'id',
`app_id` 		  BIGINT 		UNSIGNED DEFAULT NULL 	 		                           COMMENT '项目id',
`name` 		             VARCHAR(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '数据集名称',
`descr` 	            	VARCHAR(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '数据集描述',
`data_source_type`     VARCHAR(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '数据源类型',
`db_name`             	VARCHAR(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '数据库名称',
`table_name`           VARCHAR(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '表名',
`schema` 		TEXT 		   				      DEFAULT NULL COMMENT '表的元信息',
`create_user`         	VARCHAR(50)  CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '创建人',
`update_user`         VARCHAR(50)  CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '修改人',
`create_time` 	BIGINT						    DEFAULT '0'  COMMENT '创建时间',
`update_time` 	BIGINT 						    DEFAULT '0'  COMMENT '修改时间',
`status` 		INT 					        	  DEFAULT '0'  COMMENT '是否删除0-否1-是',
PRIMARY KEY (`id`),KEY `idx_app_id` (`app_id`))
ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci  COMMENT='数据集表';