package com.liang.test;

import com.liang.mapper.OrdersCustomMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
//springboot測試需要這兩個註解
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestOrdersCustomMapper {
    @Resource
    private OrdersCustomMapper ordersCustomMapper;
    //测试接口对应的方法
    @Test
    public void TestFindOrdersUser(){
        //List list=ordersCustomMapper.findOrdersUser();
        List list=ordersCustomMapper.findUsers();
        System.out.println(list);

    }
    //
    @Test
    public void TestFindOrdersUserByResultMap(){
        //List list=ordersCustomMapper.findOrdersUser();
        List list=ordersCustomMapper.findOrdersUserByResultMap();
        System.out.println(list);

    }
}
