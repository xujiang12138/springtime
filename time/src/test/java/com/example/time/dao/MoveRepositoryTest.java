package com.example.time.dao;

import com.example.time.entity.Move;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by xuj on 2018/10/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MoveRepositoryTest {
    @Resource
    private MoveRepository moveRepository;
    @Test
    public void findMoves() throws Exception {
        List<Move> moves = moveRepository.findMoves();
        System.out.println(moves);
    }

    @Test
    public  void gtMove(){
        Move move = moveRepository.gtMove("1602753121");
        System.out.println(move);
    }



}