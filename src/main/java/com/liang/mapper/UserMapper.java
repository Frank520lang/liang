package com.liang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liang.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper extends BaseMapper<User> {
    //自定义的数据库操作
    String getUserName();

    void addUser(User user);

    void delUser(User user);

    void updateUser(User user);

    List likeUser(String stone);

    //多个参数如何处理
//    1.不需要写parameter参数,#{接口中的参数},#{接口中的参数}
//    2.通过@Param("参数")，多个参数
//    3.将参数封装成map集合或者list集合
//    List<User> pageUser(@Param("startIndex") Integer startIndex, @Param("pageSize") Integer pageSize);
//    List<User> pageUser(Integer startIndex,Integer pageSize);
//    List<User> pageUser(Map map);
    List<User> pageUser(List list);
}
