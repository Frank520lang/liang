package com.liang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper extends BaseMapper<User> {
    //自定义的数据库操作
    String getUserName();

    void addUser(User user);

    void delUser(User user);

    void updateUser(User user);

    List likeUser(String stone);

    void pageUser();
}
