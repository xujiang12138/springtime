package com.example.time.dao;

import com.example.time.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xuj on 2018/9/27.
 */
public interface TopicRepository extends JpaRepository<Topic,Integer> {
    Topic findByName(String name);
}
