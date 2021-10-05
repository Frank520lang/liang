package com.liang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liang.pojo.Student;

import java.util.List;

public interface StudentMapper extends BaseMapper {
    public List<Student> getStudent();

}
