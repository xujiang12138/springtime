package com.example.time.Service.Imp;

import com.example.time.Service.MyUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by xuj on 2018/10/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyUserServiceImpTest {
    @Resource
    private MyUserService myUserService;
    @Test
    public void checkNumber() throws Exception {
        System.out.println(myUserService.checkNumber("1602753121","123456"));
    }

}