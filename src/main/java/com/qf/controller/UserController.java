package com.qf.controller;

import com.qf.entity.Users;
import com.qf.service.UserService;
import com.qf.utils.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    @PostMapping("userLogin.do")
    @CrossOrigin
    JsonBean login (String username, String password){
        return userService.login(username,password);
    }

    /**
     * 新用户注册
     * @param users
     * @return
     */
    @PostMapping("userResign.do")
    @CrossOrigin
    JsonBean resign(Users users){
        return userService.resign(users);
    }
}
