package com.yunxi.hashmap.demo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: 无双老师【云析学院:http://yunxiedu.net QQ:3190976240 email:zhouguanya20@163.com】
 * @Date: 2020-02-23 16:36
 * @Description: 学生类
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;

}
