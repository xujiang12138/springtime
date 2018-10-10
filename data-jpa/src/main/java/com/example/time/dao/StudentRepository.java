package com.example.time.dao;

import com.example.time.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xuj on 2018/9/20.
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
