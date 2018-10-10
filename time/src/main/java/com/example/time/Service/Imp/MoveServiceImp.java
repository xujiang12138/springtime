package com.example.time.Service.Imp;

import com.example.time.Service.MoveService;
import com.example.time.dao.MoveRepository;
import com.example.time.entity.Move;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xuj on 2018/10/9.
 */
@Service
public class MoveServiceImp implements MoveService {
    @Resource
    private MoveRepository moveRepository;
    @Override
    public List<Move> findToday() {
        return moveRepository.findMoves();
    }

    @Override
    public Move getMove(String account) {
        return moveRepository.gtMove(account);
    }
}
