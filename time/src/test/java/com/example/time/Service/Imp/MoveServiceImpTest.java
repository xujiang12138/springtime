package com.example.time.Service.Imp;

import com.example.time.dao.MoveRepository;
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
public class MoveServiceImpTest {
    @Resource
    private MoveRepository moveRepository;
    @Test
    public void findToday() throws Exception {
        List<Move> moves = moveRepository.findMoves();
        System.out.println(moves);
    }


}