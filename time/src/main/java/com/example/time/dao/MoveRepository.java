package com.example.time.dao;

import com.example.time.entity.Move;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by xuj on 2018/10/9.
 */
public interface MoveRepository extends JpaRepository<Move,Integer> {
    @Query("from Move u WHERE DATEDIFF(u.date,NOW())=0 order by u.count  desc")
    List<Move> findMoves();
    @Query("from Move u where DATEDIFF(u.date,NOW())=0 and u.account = :account")
    Move gtMove(@Param("account")String account);








}
