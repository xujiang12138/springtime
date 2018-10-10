package com.example.time.Controller;

import com.example.time.Service.MoveService;
import com.example.time.Service.MyUserService;
import com.example.time.entity.Move;
import com.example.time.entity.Myuser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuj on 2018/10/9.
 */
@Controller
@RequestMapping(value ="/user")
public class MyUserController {
    @Resource
    private MyUserService myUserService;
    @Resource
    private MoveService moveService ;


    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/addlogin")
    public String userLogin(HttpServletRequest request, ModelMap modelMap){
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        Myuser myuser = myUserService.checkNumber(name,password);
        List<Move> moves = moveService.findToday();
        Move move = moveService.getMove(name);
        modelMap.addAttribute("myUser",moves);
        modelMap.addAttribute("name",move);
        modelMap.addAttribute("user",myuser);
        System.out.println(moves);
        System.out.println(move);
        return "moves";
    }

//    @RequestMapping("/loginPost")
//    public String login(HttpServletRequest request){
//
//    }
}
