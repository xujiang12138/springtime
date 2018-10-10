package com.example.time.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by xuj on 2018/9/27.
 */
@Entity
@Data
public class SysUser implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    private String nickname ;
    private Integer  fans ;
    private String password;

    public SysUser() {
    }

    public SysUser(String nickname, Integer fans, String password) {

        this.nickname = nickname;
        this.fans = fans;
        this.password = password;
    }
}
