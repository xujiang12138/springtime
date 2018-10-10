package com.example.time.controller;

import com.example.time.entity.SysUser;
import com.example.time.service.SysUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xuj on 2018/9/27.
 */
@RestController
@RequestMapping(value = "/find")
public class SysUserController {
    @Resource
    private SysUserService sysUserService ;

    @GetMapping("/all")
    public List<SysUser> users(){
        return  sysUserService.getUsers();
    }

    @GetMapping("/{id}")
    private SysUser user(@PathVariable Integer id){
        return  sysUserService.user(id);
    }

    @GetMapping("/nick/{nickname}")
    private List<SysUser> getUser(@PathVariable String nickname){
        return  sysUserService.getNickname(nickname);
    }

    @GetMapping("/name/{name}")
    private List<SysUser> getUsers(@PathVariable String name){
        return  sysUserService.getUser(name);

    }

    @GetMapping("/nickname/{nickname}")
    private List<SysUser> getNick(@PathVariable String nickname){
        return  sysUserService.getNick("%"+nickname+"%");
    }
}
