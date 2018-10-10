package com.niit.test;

import lombok.Data;

/**
 * Created by 辣鸡徐江 on 2018/9/10.
 */
@Data
public class Publisher {
    private  String avatar;
    private String name ;
    private String time ;
    private String title ;
    private String content ;
    private String picture ;
    private int math ;
    private  int math2 ;


    public Publisher(String avatar, String name, String time, String title, String content, String picture, int math, int math2) {
        this.avatar = avatar;
        this.name = name;
        this.time = time;
        this.title = title;
        this.content = content;
        this.picture = picture;
        this.math = math;
        this.math2 = math2;
    }
}
