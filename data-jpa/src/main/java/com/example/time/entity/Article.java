package com.example.time.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by xuj on 2018/9/27.
 */
@Entity
@Data
public class Article {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String content;

}
