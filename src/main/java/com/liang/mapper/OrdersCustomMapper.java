package com.liang.mapper;

import com.liang.wrapper.OrdersCustom;
import com.liang.wrapper.Test;

import java.util.List;

public interface OrdersCustomMapper {
     List<OrdersCustom> findOrdersUser();
     List<Test> findUsers();

}
