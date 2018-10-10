package com.example.time.service;

import com.example.time.entity.SysUser;

import java.util.List;

/**
 * Created by xuj on 2018/9/27.
 */
public interface SysUserService {
    List<SysUser> getUsers();
    SysUser user(int id );
    //根据账号
    List<SysUser>getNickname(String nickname);
    //根据用户名开头查询
    List<SysUser>getNick(String name) ;

    List<SysUser> getUser(String name);
}
