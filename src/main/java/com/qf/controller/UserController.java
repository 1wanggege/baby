package com.qf.controller;

import com.qf.entity.Users;
import com.qf.service.UserService;
import com.qf.utils.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(value = "用户Controller",tags = "用户模块的接口文档")
@RestController
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    @ApiOperation("用户登录")
    @RequestMapping("userLogin.do")
    @CrossOrigin
    public JsonBean login (@ApiParam(value = "用户名") String username,@ApiParam(value = "密码") String password){
        return userService.login(username,password);
    }

    /**
     * 新用户注册
     * @param users
     * @return
     */
    @ApiOperation("用户注册")
    @RequestMapping("userResign.do")
    @CrossOrigin
    public JsonBean resign(@ApiParam(name = "传入的新用户",value = "新用户Json格式属性属性") Users users){
        return userService.resign(users);
    }
}
