package com.liang.controller;

import com.liang.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/root")
public class UserController {
    @Resource
    private UserMapper userMapper;

    @GetMapping("/test")
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List userList = userMapper.selectList(null);
        System.out.println(userList);
    }
}
