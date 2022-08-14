package com.xw.layui.vo;

import lombok.Data;

import java.util.List;

/**
 * Layui数据格式
 * @param <T>
 */
@Data
public class DataVO<T> {

    private Integer code;

    private String msg;

    private Long count;

    private List<T> data;

}
