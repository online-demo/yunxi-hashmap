package com.yunxi.hashmap.demo;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 无双老师【云析学院:http://yunxiedu.net QQ:3190976240 email:zhouguanya20@163.com】
 * @Date: 2020-02-23 16:42
 * @Description: HashMap测试类1
 */
public class HashMapDemo1 {
    /**
     * 云析学院vip学员总人数
     */
    public static final int YUNXI_VIP_TOTAL_COUNT = 50;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // 测试场景1
        test1();
        // 测试场景2
//        test2();
        // 测试场景3
//        test3();
    }

    private static void test1() {
        Map<Student, Teacher> studentTeacherMap = new HashMap<>();
        Student zhangsan = new Student("张三", 20);
        Student lisi = new Student("李四", 21);
        Student wangwu = new Student("王五", 19);
        Teacher wushuang = Teacher.of("无双", 35);
        studentTeacherMap.put(zhangsan, wushuang);
        studentTeacherMap.put(lisi, wushuang);
        studentTeacherMap.put(wangwu, wushuang);
        System.out.println("studentTeacherMap的大小为：" + studentTeacherMap.size());
        System.out.println("studentTeacherMap的元素为：");
        for (Map.Entry<Student, Teacher> entry : studentTeacherMap.entrySet()) {
            System.out.print(entry.getKey());
            System.out.print("的老师为：");
            System.out.print(entry.getValue());
            System.out.println();
        }
    }

    /**
     * 这段代码有什么问题？？？
     */
    private static void test2() {
        Map<Student, Teacher> studentTeacherMap = getStudentTeacherHashMap();
        System.out.println("studentTeacherMap的大小为：" + studentTeacherMap.size());
    }

    /**
     * 证明test2()方法的结论
     */
    private static void test3() throws NoSuchFieldException, IllegalAccessException {

        HashMap<Student, Teacher> studentTeacherMap = getStudentTeacherHashMap();
        Field field = studentTeacherMap.getClass()
                .getDeclaredField("table");
        field.setAccessible(true);
        Class<?> tableClass = field.getType();
        System.out.println(tableClass);
        // debug查看
        System.out.println(field.get(studentTeacherMap));
    }

    /**
     * 初始化一个HashMap
     */
    private static HashMap<Student, Teacher> getStudentTeacherHashMap() {
        HashMap<Student, Teacher> studentTeacherMap = new HashMap<>();
        Teacher wushuang = Teacher.of("无双", 35);
        for (int i = 0; i < YUNXI_VIP_TOTAL_COUNT; i++) {
            String name = "云析学院vpi同学" + i;
            Integer age = 20 + i;
            Student student = new Student(name, age);
            studentTeacherMap.put(student, wushuang);
        }
        return studentTeacherMap;
    }
}
