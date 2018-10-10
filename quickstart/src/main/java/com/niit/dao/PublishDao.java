package com.niit.dao;

import com.niit.test.Publisher;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 辣鸡徐江 on 2018/9/10.
 */
@Configuration
public class PublishDao {
    public List<Publisher> getPublisher(){

        Publisher[] publishers = {
                new Publisher("http://p9f10ih0f.bkt.clouddn.com/18-9-10/52798216.jpg","徐江","昨天","今天是个好日子，祝老师们节日快乐","教师节祝老师们节日快乐","http://p9f10ih0f.bkt.clouddn.com/18-9-10/62393853.jpg",109,20),
                new Publisher("http://p9f10ih0f.bkt.clouddn.com/18-9-10/52798216.jpg","徐江","昨天","今天是个好日子，祝老师们节日快乐","教师节祝老师们节日快乐","http://p9f10ih0f.bkt.clouddn.com/18-9-10/90415958.jpg",214,19),
                new Publisher("http://p9f10ih0f.bkt.clouddn.com/18-9-10/52798216.jpg","徐江","昨天","今天是个好日子，祝老师们节日快乐","教师节祝老师们节日快乐","http://p9f10ih0f.bkt.clouddn.com/18-9-10/95744032.jpg",146,25),
                new Publisher("http://p9f10ih0f.bkt.clouddn.com/18-9-10/52798216.jpg","徐江","昨天","今天是个好日子，祝老师们节日快乐","教师节祝老师们节日快乐","http://p9f10ih0f.bkt.clouddn.com/18-9-10/53000656.jpg",102,35),
        };
        List<Publisher> list = Arrays.asList(publishers);
        return list;
    }
}
