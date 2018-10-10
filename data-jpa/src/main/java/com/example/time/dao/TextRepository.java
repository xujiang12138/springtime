package com.example.time.dao;

import com.example.time.entity.Text;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xuj on 2018/9/20.
 * 数据持久层接口
 */
public interface TextRepository extends JpaRepository<Text,Integer> {
}
