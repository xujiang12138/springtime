package com.example.time.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by xuj on 2018/9/20.
 */
@Entity
@Data
public class Writer {
    @GeneratedValue
    @Id
    private Integer id ;
    private String avatar;
    private String name ;

}
