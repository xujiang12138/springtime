package com.example.time.service.Impl;

import com.example.time.dao.SysUserRepository;
import com.example.time.entity.SysUser;
import com.example.time.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xuj on 2018/9/27.
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserRepository sysUserRepository;
    //自带查询所有
    @Override
    public List<SysUser> getUsers() {
        return sysUserRepository.findAll();
    }
//自带根据ID查询
    @Override
    public SysUser user(int id) {
        return sysUserRepository.findById(id).get();
    }

    @Override
    public List<SysUser> getNickname(String nickname) {
        return sysUserRepository.findByNickname(nickname);
    }

    @Override
    public List<SysUser> getNick(String name) {
        return sysUserRepository.findByNicknameLike(name);
    }

    @Override
    public List<SysUser> getUser(String name) {
        return sysUserRepository.findUsers(name);
    }
}
