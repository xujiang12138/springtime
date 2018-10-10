package com.example.time.controller;

import com.example.time.entity.Student;
import com.example.time.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xuj on 2018/9/20.
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAll(){
        return  studentService.getAll();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Integer id){
        return  studentService.getId(id);
    }
}
