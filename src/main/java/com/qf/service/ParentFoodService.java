package com.qf.service;

import com.qf.entity.ParentFood;
import com.qf.utils.ResultVo;

import java.util.List;

public interface ParentFoodService {

    //删除父类食品菜单目录
    ResultVo deleteByPrimaryKey(Integer id);
    //添加父类菜单目录
    ResultVo insertSelective(ParentFood record);
    //查询父类菜单目录
    ResultVo selectByPrimaryKey(Integer id);
    //修改父类菜单
    ResultVo updateByPrimaryKeySelective(ParentFood record);
    //展示所有的父类菜单
    ResultVo findAll();

}
