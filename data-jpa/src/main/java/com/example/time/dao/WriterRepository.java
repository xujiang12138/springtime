package com.example.time.dao;

import com.example.time.entity.Writer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xuj on 2018/9/20.
 */
public interface WriterRepository extends JpaRepository<Writer,Integer> {
}
