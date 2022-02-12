package com.liang.wrapper;

import com.liang.entity.Orders;
import lombok.Data;

@Data
public class OrdersCustom extends Orders {
    // 添加用户的属性
    private String userName;
    private String sex;
    private String address;
}
