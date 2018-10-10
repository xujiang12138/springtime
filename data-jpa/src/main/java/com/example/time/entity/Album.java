package com.example.time.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by xuj on 2018/9/29.
 * 相册持久化类
 */
@Entity
@Data
public class Album {
    @Id
    @GeneratedValue
    private  Integer id;
    private  String  albumCover; //封面图
    private String albumTitle; //标题
    private  String  albumDescription; //描述
    private Integer likes ; //喜欢数量

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    @JoinColumn(name = "album_id")
    private List<Picture> pictures;

    public Album() {
    }

    public Album(String albumCover, String albumTitle, String albumDescription, Integer likes) {
        this.albumCover = albumCover;
        this.albumTitle = albumTitle;
        this.albumDescription = albumDescription;
        this.likes = likes;
    }
}
