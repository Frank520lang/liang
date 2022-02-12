package com.liang.controller;

import com.liang.mapper.OrdersCustomMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@RestController
@RequestMapping("/get")
public class OrderController {
    @Resource
    private OrdersCustomMapper ordersCustomMapper;
    @GetMapping("/getOrdersCustom")
    public List getOrdersCustom(){
        List list =ordersCustomMapper.findOrdersUser();
        System.out.println(list);
        return list;
    }
    @GetMapping("/users")
    public List getUsers(){
        List list =ordersCustomMapper.findUsers();
        System.out.println(list);
        return list;
    }
}
