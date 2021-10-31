package com.liang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liang.pojo.Teacher;

import java.util.List;

public interface TeacherMapper extends BaseMapper {
    //一对多（集合）
    public List<Teacher> oneToMany();
}
