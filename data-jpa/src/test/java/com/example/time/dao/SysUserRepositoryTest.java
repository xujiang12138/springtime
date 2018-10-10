package com.example.time.dao;

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
public class SysUserRepositoryTest {
        @Resource
     private SysUserRepository sysUserRepository;

        @Test
    public  void addUser(){
            int[]fans = {1012,456,12340,1};
            String[] nickname ={"zhangsan","lisi","wangwu","laoliu"};
            String[] password ={"111","222","333","444"};

            for (int i=0 ;i<4;i++){
                SysUser sysUser = new SysUser(nickname[i],fans[i],password[i]);
                sysUserRepository.save(sysUser);
            }
        }
        @Test
    public  void findBynickname(){
        List<SysUser> sysUser = sysUserRepository.findByNickname("zhangsan");
            System.out.println(sysUser);
        }

        @Test
    public void findBytitle(){
        SysUser sysUser = sysUserRepository.findByNicknameStartingWith("zhang");
            System.out.println(sysUser);
        }

        @Test
    public void findNickname(){
        SysUser sysUser = sysUserRepository.findUser("zhangsan");
            System.out.println(sysUser);
        }
    @Test
    public void findUsers(){
        List<SysUser> sysUsers = sysUserRepository.findUsers("zhangsan");
        sysUsers.forEach(sysUser -> System.out.println(sysUser));
    }

    @Test
    public void findNick(){
        List<SysUser> sysUsers = sysUserRepository.findByNicknameLike("%zhang%");
        System.out.println(sysUsers);
    }

}