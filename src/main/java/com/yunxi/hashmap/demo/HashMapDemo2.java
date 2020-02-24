package com.yunxi.hashmap.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 无双老师【云析学院:http://yunxiedu.net QQ:3190976240 email:zhouguanya20@163.com】
 * @Date: 2020-02-24 20:30
 * @Description: HashMap测试类2
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        // 测试代码1
        test1();

        // 测试代码2
//        test2();

        // 测试代码3
//        test3();

        // 测试代码4
        test4();
    }

    /**
     * 测试代码1和测试代码2对比一下？？？
     */
    public static void test1() {
        // 创建云析学院4个老师
        Teacher wushuang = Teacher.of("无双老师", 35);
        Teacher xiaowu = Teacher.of("小五老师", 34);
        Teacher qingtian = Teacher.of("擎天老师", 35);
        Teacher lufei = Teacher.of("路飞老师", 36);
        // 创建容量为 8 的HashMap
        HashMap<Teacher, String> teacherCourseMap = new HashMap<>(8);
        teacherCourseMap.put(wushuang, "Spring");
        teacherCourseMap.put(xiaowu, "Mybatis");
        teacherCourseMap.put(qingtian, "JVM");
        teacherCourseMap.put(lufei, "Kafka");
        // ① 多少人能答对？
        System.out.println("teacherCourseMap的容量=" + teacherCourseMap.size());
        // ② 你猜猜这里面的元素分别是什么？
        // 多少人能答对？
//        System.out.println("teacherCourseMap的元素=" + teacherCourseMap);

    }

    /**
     * 测试代码2
     */
    public static void test2() {
        Map<String, String> map = new HashMap<>(4);
        map.put("1", "1");
        map.put("1", "2");
        // 有多少同学能答对？
        System.out.println("map中的元素是：" + map);
    }

    /**
     * 测试代码3——面试题：HashMap能不能存放null
     */
    public static void test3() {
        Map<Integer, Integer> map = new HashMap<>(4);
        map.put(null, 1);
        map.put(1, null);
        map.put(null, null);
        // 有多少同学能答对？
        System.out.println("map中的元素是：" + map);
    }

    /**
     * 测试代码4——换个hashCode方法玩一玩
     */
    public static void test4() {
        HashMap<Teacher, String> teacherCourseMap = new HashMap<>(4);
        Teacher wushuang1 = Teacher.of("无双老师", 35);
        Teacher qingtian = Teacher.of("擎天老师", 35);
        Teacher wushuang2 = Teacher.of("无双老师", 35);
        teacherCourseMap.put(wushuang1, "Spring");
        teacherCourseMap.put(qingtian, "JVM");
        teacherCourseMap.put(wushuang2, "Mybatis");
        // 有多少同学能答对？
        System.out.println("teacherCourseMap中的元素是：" + teacherCourseMap);
    }
}
