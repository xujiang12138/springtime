package com.example.time.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by xuj on 2018/9/29.
 */
@Entity
@Data
public class Picture {
    @Id
    @GeneratedValue
    private Integer id;
    private String pictureImg;
    private String pictureSrc;

    public Picture() {
    }

    public Picture(String pictureImg, String pictureSrc) {
        this.pictureImg = pictureImg;
        this.pictureSrc = pictureSrc;
    }
}
