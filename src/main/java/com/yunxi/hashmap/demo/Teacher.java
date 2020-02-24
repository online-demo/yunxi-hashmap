package com.yunxi.hashmap.demo;

import lombok.*;

import java.util.Objects;

/**
 * @Author: 无双老师【云析学院:http://yunxiedu.net QQ:3190976240 email:zhouguanya20@163.com】
 * @Date: 2020-02-23 16:43
 * @Description: 教师类
 */
@Getter
@Setter
@RequiredArgsConstructor(staticName = "of")
@ToString
public class Teacher {
    /**
     * 姓名
     */
    @NonNull
    private String name;
    /**
     * 年龄
     */
    @NonNull
    private Integer age;


    @Override
    public int hashCode() {
        return age.hashCode();
//        return System.identityHashCode(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Teacher teacher = (Teacher) o;
//        return Objects.equals(age, teacher.age);
        return Objects.equals(name, teacher.name) &&
                Objects.equals(age, teacher.age);
    }

}
