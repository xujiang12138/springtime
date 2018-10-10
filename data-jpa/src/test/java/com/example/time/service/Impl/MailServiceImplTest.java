package com.example.time.service.Impl;

import com.example.time.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by xuj on 2018/10/7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceImplTest {
    @Autowired
    private MailService mailService;
    @Test
    public void sendMail() throws Exception {
            mailService.sendMail("815835155@qq.com","简单邮件","spring实现邮件");
    }

}