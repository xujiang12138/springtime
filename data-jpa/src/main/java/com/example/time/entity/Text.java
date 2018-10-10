package com.example.time.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by xuj on 2018/9/20.
 */
@Entity//实现对象持久化，可生成表
@Data  //lombok框架
public class Text {
    @Id  //定义主键
    @GeneratedValue//指定主键策略，mysql默认自增
    private Integer id ;
    @Column(nullable =false)
    private String title;
    private String content ;
    private String avatar;
}
