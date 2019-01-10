package com.qf.dao;

import com.qf.entity.ParentFood;

import java.util.List;

public interface ParentFoodMapper {
    //删除父类食品菜单目录
    int deleteByPrimaryKey(Integer id);
    //添加父类菜单目录
    int insertSelective(ParentFood record);
    //查询父类菜单目录
    ParentFood selectByPrimaryKey(Integer id);
    //修改父类菜单
    int updateByPrimaryKeySelective(ParentFood record);
    //展示所有的父类菜单
    List<ParentFood> findAll();

}