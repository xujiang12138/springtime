package com.example.time.Service.Imp;

import com.example.time.Service.MyUserService;
import com.example.time.dao.MyUserRepository;
import com.example.time.entity.Myuser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xuj on 2018/10/8.
 */
@Service
public class MyUserServiceImp implements MyUserService {
    @Resource
    private MyUserRepository myUserRepository;
    @Override
    public Myuser checkNumber(String account, String password) {
        List<Myuser> users = myUserRepository.findAll();
        Myuser user = new Myuser();
        for (int i=0;i<users.size();i++){
            String name = users.get(i).getAccount();
            String pass = users.get(i).getPassword();
            if (name.equals(account)){
                if (pass.equals(password)){
                    user = users.get(i);
                }
            }
        }
        return user;
    }
}
