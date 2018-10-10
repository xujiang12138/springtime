package com.example.time.controller;

import com.example.time.entity.Writer;
import com.example.time.service.WriterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by xuj on 2018/9/20.
 */
@Controller
@RequestMapping(value = "/writer")
public class WriterController {
    @Resource
    private WriterService writerService;

    @GetMapping("/wri")
    public Writer getWriter(){
        return writerService.getWriter();
    }

    @GetMapping("/jiemian")
        public String getList(ModelMap modelMap){
        return "detail";
    }

}
