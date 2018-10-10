package com.example.time.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuj on 2018/10/9.
 */
@Entity
@Data
public class Myuser {
    @Id
    @GeneratedValue
    private Integer id;
    private String account ;
    private String password;
    private String avatar ;
    private String nickName ;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    @JoinColumn(name = "time_id")
    private List<Move> moves = new ArrayList<>();

    public Myuser() {
    }

    public Myuser(String account, String password, String avatar, String nickName) {
        this.account = account;
        this.password = password;
        this.avatar = avatar;
        this.nickName = nickName;
    }


}
