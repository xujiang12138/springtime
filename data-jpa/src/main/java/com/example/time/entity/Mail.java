package com.example.time.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by xuj on 2018/10/8.
 */
@Entity
@Data
public class Mail {
    @Id
    @GeneratedValue
    private Integer id;
    private String to;
    private String subject ;
    private String content ;

    public Mail() {
    }

    public Mail(String to, String subject, String content) {
        this.to = to;
        this.subject = subject;
        this.content = content;
    }
}
