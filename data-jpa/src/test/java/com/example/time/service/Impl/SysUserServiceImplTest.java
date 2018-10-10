package com.example.time.service.Impl;

import com.example.time.dao.SysUserRepository;
import com.example.time.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by xuj on 2018/9/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceImplTest {
    @Resource
    private SysUserRepository sysUserRepository;
    @Test
    public void getUsers() throws Exception {
        List<SysUser> sysUsers = sysUserRepository.findAll();
        System.out.println(sysUsers);
    }

    @Test
    public void user() throws Exception {
            SysUser sysUser = sysUserRepository.findById(21).get();
        System.out.println(sysUser);
    }

    @Test
    public void getNickname() throws Exception {
            List<SysUser> sysUsers = sysUserRepository.findByNickname("zhangsan");
        System.out.println(sysUsers);
    }

    @Test
    public void getUser() throws Exception {
     List<SysUser> sysUsers = sysUserRepository.findByNicknameLike("%zhang%");
        System.out.println(sysUsers);
    }

}