package com.liang.entity;

import lombok.Data;

@Data
public class OrderDetail {
    private Integer id;
    private Integer ordersId;
    private Integer itemsId;
    private Integer itemsNum;
    //对应的商品信息
    private Items items;
}
