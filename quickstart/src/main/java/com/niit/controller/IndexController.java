package com.niit.controller;

import com.niit.test.Student;
import com.niit.test.Text;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 辣鸡徐江 on 2018/9/6.
 */
@Controller //模板开发
public class IndexController {
    //注入一个Student类的对象。被Spring容器托管--bean
    @Resource
    private Student student;
    @Resource
    private  List<Text> texts;

    //@RequestMapping(value = "/index",method = RequestMethod.GET)
    @GetMapping("/small")
    public String index(ModelMap map){
         texts= new ArrayList<>();
        Text text1 = new Text();
        Text text2 = new Text();
        Text text3 = new Text();
        Text text4 = new Text();
        text1.setTextOne("徐江");
        text1.setTextTwo("昵称");
        texts.add(text1);
        text2.setTextOne("登录密码");
        text2.setTextTwo("确认密码");
        texts.add(text2);
        text3.setTextOne("密码提示问题");
        text3.setTextTwo("密码提示答案");
        texts.add(text3);
        text4.setTextOne("手机号码");
        text4.setTextTwo("邮箱地址");
        texts.add(text4);
        map.addAttribute("list",texts);
//        map.put("student",student);//将模型数据加入视图
        return "small";  //返回的页面名字
    }
}
