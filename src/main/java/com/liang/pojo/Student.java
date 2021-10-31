package com.liang.pojo;

import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String name;

    //一对多
//    private Integer tid;

    //多对一
    //每个学生都必须关联一个老师
    private Teacher teacher;
}
