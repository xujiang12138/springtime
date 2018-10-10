package com.example.time.Service;

import com.example.time.entity.Move;

import java.util.List;

/**
 * Created by xuj on 2018/10/9.
 */
public interface MoveService {
    List<Move> findToday();
    Move getMove(String account);
}
