package com.example.time.service.Impl;

import com.example.time.dao.TextRepository;
import com.example.time.entity.Text;
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
public class TextServiceImplTest {
    @Resource
    private TextRepository textRepository ;
    @Test
    public void addText() throws Exception {
        String []title = {"Git的安装和使用","devtools热部署","thymeleaf模板的使用","学习lombok"};
        String []content = {"Git安装和基本操作\n" +
                " Git的安装与进入\n" +
                "\n" +
                "第一步： 首先去官网上现在git安装程序\n" +
                "\n" +
                "第二步 然后进git->bash进行git的安装（两段命令行）","什么是热部署?\n" +
                "\n" +
                "简单点说，就是当你对应用程序更新修改、任务改变的时候，不需要重启程序就实现了更新的功能。\n" +
                "什么是spring-boot-devtools?\n" +
                "\n" +
                "spring-boot-devtools是一个开发者服务的模块，其最主要的功能就是把项目更新的细节实时的传递到APP上面。","什么是thymeleaf模板\n" +
                "\n" +
                "Thymeleaf是一个用于服务器端的java模板引擎，它使用简单但功能强大，目前可以处理的模板类型包括：HTML、XML、TEXT、JavaScript、CSS等。\n" +
                "为什么要使用thymeleaf模板\n" +
                "\n" +
                "一：thymeleaf原型即页面（会用的情况下）\n" +
                "\n" +
                "二：基于HTML开发\n" +
                "在这之前怎么做的？\n" +
                "\n" +
                "在这之前我们要写四个层面，dao,service,controller，api。四个层面层层递进，每个层面测通了才能往下进行，然后给前端调用。","为什么要用lombok?\n" +
                "\n" +
                "通过@Data注解的方式省去了我们平时开发定义JavaBean之后，生成其属性的构造器、getter、setter、equals、hashcode、toString方法；但是，在编译时会自动生成这些方法，在.class文件中。\n" +
                " 没有之前我们怎么用?\n" +
                "\n" +
                "使用alt+insert快捷方式，自动生成get和set等方法\n" +
                " 该怎么使用？\n" +
                "\n" +
                " 步骤一：点击file→setting→plugin里面下载lombok插件，然后关闭idea重启"};
        String[] avatar ={"http://p9f10ih0f.bkt.clouddn.com/18-9-6/84242213.jpg","http://p9f10ih0f.bkt.clouddn.com/18-9-6/15518660.jpg","http://p9f10ih0f.bkt.clouddn.com/18-9-7/42024003.jpg","http://p9f10ih0f.bkt.clouddn.com/18-9-7/63120389.jpg"};
        for (int i = 0 ;i<4;i++){
            Text text = new Text();
            text.setTitle(title[i]);
            text.setContent(content[i]);
            text.setAvatar(avatar[i]);
            textRepository.save(text);
        }
    }

    @Test
    public void getTexts() throws Exception {
    }

    @Test
    public void getText() throws Exception {

    }

}