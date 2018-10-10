package com.example.time.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by xuj on 2018/10/8.
 */
@Entity
@Data
public class Move {
    @Id
    @GeneratedValue
    private Integer id;
    private Date date;
    private String account ;
    private Integer count ;

    public Move() {
    }

    public Move(String account, int count) {
        this.account = account;
        this.count = count;
    }
}
