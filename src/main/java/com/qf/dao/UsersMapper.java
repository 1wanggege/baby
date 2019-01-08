package com.qf.dao;

import com.qf.entity.Users;

public interface UsersMapper {
    //根据Id清除用户
    int deleteByPrimaryKey(Integer userid);
    //用户注册
    int insertSelective(Users record);
    //根据id查询用户
    Users selectByPrimaryKey(Integer userid);
    //修改用户
    int updateByPrimaryKeySelective(Users record);
    //用户登录
    Users findByUsername(String name);

}