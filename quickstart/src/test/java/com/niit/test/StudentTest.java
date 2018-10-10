package com.niit.test;

import lombok.extern.java.Log;

import static org.junit.Assert.*;

/**
 * Created by 辣鸡徐江 on 2018/9/6.
 */
@Log
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(10);
        student.setMale("男");
        student.setName("gongjian");
        student.setStudentNo("2017");
        System.out.println(student.toString());

        Student student1 = new Student();
        student1.setAge(11);
        student1.setMale("女");
        student1.setName("jiangnan");
        student1.setStudentNo("2018");
        System.out.println(student.equals(student1));

        student1.setAge(10);
        student1.setMale("男");
        student1.setName("gongjian");
        student1.setStudentNo("2017");
        System.out.println(student.equals(student1));

        log.info("龚建二狗子");

    }



}