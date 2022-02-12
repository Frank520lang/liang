package com.liang.entity;

import lombok.Data;

import java.util.Date;
//商品实体类
@Data
public class Items {
    private Integer id;
    private String itemsName;
    private Float price;
    private String detail;
    private String pic;
    private Date createTime;
}
