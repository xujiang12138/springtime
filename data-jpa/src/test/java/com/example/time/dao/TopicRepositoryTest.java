package com.example.time.dao;

import com.example.time.entity.Topic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by xuj on 2018/9/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicRepositoryTest {
    @Resource
    private TopicRepository topicRepository;

    @Test
    public  void addTopic(){
        String[] name ={"aaa","vvv","ccc"};
        for (int i=0;i<3;i++){
            Topic topic = new Topic(name[i]);
            topicRepository.save(topic);
        }
    }
    @Test
    public void findByName() throws Exception {
        Topic topic = topicRepository.findByName("aaa");
        System.out.println(topic);
    }

}