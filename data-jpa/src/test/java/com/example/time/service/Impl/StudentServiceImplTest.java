package com.example.time.service.Impl;

import com.example.time.dao.StudentRepository;
import com.example.time.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;
import java.util.Random;

/**
 * Created by xuj on 2018/9/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceImplTest {
    @Resource
    private StudentRepository studentRepository ;

    @Test
    public void save() throws Exception {
        String[] name = {"a","v","c","d"};
        Random random = new Random();
        for (int i =0;i<4;i++){
            Student student = new Student();
            student.setName(name[i]);
            student.setNameAvatar(random.nextInt(30)+"");
            studentRepository.save(student);
        }
    }

    @Test
    public void getAll() throws Exception {
        List<Student>  students=studentRepository.findAll();
        System.out.println(students);
    }

    @Test
    public void getId() throws Exception {
            Student student = studentRepository.getOne(1);
        System.out.println( student);
    }

    @Test
    public void delete() throws Exception {

    }

}