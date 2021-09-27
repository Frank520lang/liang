package com.liang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liang.pojo.User;

public interface UserMapper extends BaseMapper <User>{
     String getUserName();
}
