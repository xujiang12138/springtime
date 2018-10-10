package com.example.time.Service;


import com.example.time.entity.Myuser;

/**
 * Created by xuj on 2018/10/8.
 */
public interface MyUserService {
    Myuser checkNumber(String account, String password);
}
