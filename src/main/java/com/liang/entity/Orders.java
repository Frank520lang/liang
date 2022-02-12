package com.liang.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
public class Orders {
    private Integer id;
    //下单用户id
    private Integer userId;
    //用户信息
    private User user;
    private String number;
    private Date createtime;
    private String note;
    //订单详细
    private List<OrderDetail> orderDetails;
}
