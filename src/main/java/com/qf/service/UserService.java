package com.qf.service;
import com.qf.entity.Users;
import com.qf.utils.JsonBean;

public interface UserService {
    //新用户登录
    JsonBean login(String username, String password);
    //新用户注册
    JsonBean resign(Users users);
}
