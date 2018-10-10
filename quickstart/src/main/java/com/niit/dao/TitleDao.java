package com.niit.dao;

import com.niit.test.Text;
import com.niit.test.Title;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 辣鸡徐江 on 2018/9/10.
 */
@Configuration
public class TitleDao {
    public List<Title> getTitle() throws MalformedURLException {

        Title[] titles  = {
                new Title("http://p9f10ih0f.bkt.clouddn.com/18-9-10/69340119.jpg","跑步好搭档"),
                new Title("http://p9f10ih0f.bkt.clouddn.com/18-9-10/11938568.jpg","给现代人的护眼小技巧"),
                new Title("http://p9f10ih0f.bkt.clouddn.com/18-9-10/85835513.jpg","青年家居生活指南"),
                new Title("http://p9f10ih0f.bkt.clouddn.com/18-9-10/21578820.jpg","你应该知道的PPT小技巧")
        };

        List<Title> titles1 = Arrays.asList(titles);
        return  titles1;
    }
}
