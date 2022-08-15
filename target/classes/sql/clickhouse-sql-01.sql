 CREATE TABLE test01.data_set(
 `id` 		          UInt64   ,
 `app_id` 	      	 UInt64   ,
 `name` 		         String,
 `descr`            String,
 `data_source_type` String,
 `db_name`          String,
 `table_name`       String,
 `schema` 	        String,
 `create_user`     	String,
 `update_user`      String,
 `create_time`    	Date						  ,
 `update_time`    	Date 	 ,
 `status`	int)ENGINE = MergeTree()   ORDER BY app_id ;