package com.xw.layui.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
public class App {

    @TableId
    private    int      id 		          ;

    @TableField
    private    int      app_id 	          ;

    @TableField
    private    String   name 		        ;

    @TableField
    private    String   descr             ;

    @TableField
    private    String   data_source_type  ;

    @TableField
    private    String   db_name           ;

    @TableField
    private    String   table_name        ;

    @TableField
    private    String   schema 	          ;

    @TableField
    private    String   create_user       ;

    @TableField
    private    String   update_user       ;

    @TableField
    private    Date     create_time       ;

    @TableField
    private    Date     update_time       ;

    @TableField
    private    int      status	          ;
}
