package com.example.time.controller;

import com.example.time.service.TextService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by xuj on 2018/9/20.
 */
@Controller
@RequestMapping(value = "/text")
public class TextController {
    @Resource
    private TextService textService ;

    @GetMapping("/all")
    public String getTextList(ModelMap modelMap){
        modelMap.addAttribute("textlist",textService.getTexts());
        return "jianshu";
    }

    @GetMapping("/{id}")
    public String getText(@PathVariable Integer id,ModelMap modelMap){
       modelMap.addAttribute("text",textService.getText(id));
       return "detail";
    }
}
