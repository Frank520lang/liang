package com.liang.mapper;

import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void test() {
        List list = userMapper.selectList(null);
        System.out.println(list);
    }
}
