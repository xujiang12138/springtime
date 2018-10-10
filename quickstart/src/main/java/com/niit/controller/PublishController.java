package com.niit.controller;

import com.niit.dao.PublishDao;
import com.niit.dao.TitleDao;
import com.niit.test.Publisher;
import com.niit.test.Title;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.net.MalformedURLException;
import java.util.List;

/**
 * Created by 辣鸡徐江 on 2018/9/10.
 */
@Controller
public class PublishController {
    @Resource
    private PublishDao publishDao;
    @Resource
    private TitleDao titleDao ;

    @GetMapping("publish")
    public String getAll(ModelMap map) throws MalformedURLException {
        List<Publisher> list = publishDao.getPublisher();
        List<Title> titles = titleDao.getTitle();
        map.addAttribute("publishers",list);
        map.addAttribute("titles",titles);
        return "small";
    }
}
