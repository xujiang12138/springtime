package com.example.time.service;

import com.example.time.entity.Student;

import java.util.List;

/**
 * Created by xuj on 2018/9/20.
 */
public interface StudentService {
    Student save(Student myStudent);
    List<Student> getAll();
    Student getId(int id) ;
    void delete(int id);
}
