package com.liang.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;
//自动生成setter和getter方法
@Data
public class User {
    private Integer id;
    private String userName;
    private Date birthday;
    private String sex;
    private String address;
    //用户创建的订单列表
    private List<Orders> orderList;
}
