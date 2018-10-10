package com.example.time.dao;

import com.example.time.entity.Myuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by xuj on 2018/10/9.
 */
public interface MyUserRepository extends JpaRepository<Myuser,Integer> {

}
