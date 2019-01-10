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
import org.springframework.web.bind.annotation.RestController;
@Api(produces = "这是我们Java后台的接口文档",value = "接口文档")
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
    @ApiOperation(notes = "实现传递参数，响应用户的登录",tags = {"用户登录"},value = "获取用户名以及密码接口")
    @PostMapping("userLogin.do")
    @CrossOrigin
    public JsonBean login (@ApiParam(value = "用户名") String username,@ApiParam(value = "密码") String password){
        return userService.login(username,password);
    }

    /**
     * 新用户注册
     * @param users
     * @return
     */
    @ApiOperation(notes = "实现传递对象属性为参数，响应新用户的注册",tags = {"用户注册"}, value = "获取新用户对象属性的接口")
    @PostMapping("userResign.do")
    @CrossOrigin
    public JsonBean resign(@ApiParam(value = "新用户属性") Users users){
        return userService.resign(users);
    }
}
