package com.example.time.service.Impl;

import com.example.time.dao.StudentRepository;
import com.example.time.entity.Student;
import com.example.time.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xuj on 2018/9/20.
 */
@Service
public class StudentServiceImpl implements StudentService {
        @Resource
        private StudentRepository studentRepository ;
    @Override
    public Student save(Student myStudent) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getId(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {

    }
}
