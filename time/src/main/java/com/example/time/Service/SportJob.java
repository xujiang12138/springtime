package com.example.time.Service;

import com.example.time.dao.MoveRepository;
import com.example.time.entity.Move;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by xuj on 2018/10/9.
 */
@Slf4j
@Component
public class SportJob  {
    @Resource
    private MoveRepository moveRepository;
    @Scheduled(cron = "0 40 0 * * ?")
    public void execute() throws Exception{
        Move move = new Move();
        move.setAccount("1602753121");
        move.setDate(new Date());
        move.setCount(45624);
        Move move1 = new Move();
        move1.setAccount("1602753122");
        move1.setDate(new Date());
        move1.setCount(4444);
        Move move2 = new Move();
        move2.setAccount("1602753133");
        move2.setDate(new Date());
        move2.setCount(3333);
        moveRepository.save(move);
        moveRepository.save(move1);
        moveRepository.save(move2);
    }
}
