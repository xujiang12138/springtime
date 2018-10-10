package com.niit.test;

import lombok.Data;

import java.net.URL;

/**
 * Created by 辣鸡徐江 on 2018/9/10.
 */
@Data
public class Title {
    private String url;
    private String title ;


    public Title(String url, String title) {
        this.url = url;
        this.title = title;
    }
}
