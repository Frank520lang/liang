package com.liang.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private Integer id;
    private String name;
    //一对多
    //一个老师关联多个学生
//    private List<Student> students;
}
