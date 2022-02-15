package com.liang.mapper;

import com.liang.entity.Orders;
import com.liang.entity.User;
import com.liang.wrapper.OrdersCustom;
import com.liang.wrapper.Test;

import java.util.List;

public interface OrdersCustomMapper {
     List<Test> findUsers();
     List<OrdersCustom> findOrdersUser();
     List<OrdersCustom> findOrdersUserByResultMap();
     List<Orders> findOrdersAndOrderDetailResultMap();
     List<User> findUserAndItemsResultMap();
}
