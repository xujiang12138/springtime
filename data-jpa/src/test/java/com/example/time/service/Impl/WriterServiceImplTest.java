package com.example.time.service.Impl;

import com.example.time.dao.WriterRepository;
import com.example.time.entity.Writer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by xuj on 2018/9/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WriterServiceImplTest {
    @Resource
    private WriterRepository writerRepository;
    @Test
    public void addWriter() throws Exception {
        Writer writer = new Writer();
        writer.setName("徐江");
        writer.setAvatar("http://p9f10ih0f.bkt.clouddn.com/18-9-10/52798216.jpg");
        writerRepository.save(writer);
    }

}