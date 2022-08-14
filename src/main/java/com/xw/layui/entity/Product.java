package com.xw.layui.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {

    private Integer id;

    private String name;

    private String description;

    private Float price;

    private Integer stock;

    private Integer categoryleveloneId;

    private Integer categoryleveltwoId;

    private Integer categorylevelthreeId;

    private String fileName;

}
