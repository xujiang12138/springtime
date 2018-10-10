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
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Student {
    @GeneratedValue
    @Id
    private Integer id;
    private String name ;
    private String nameAvatar;
}
