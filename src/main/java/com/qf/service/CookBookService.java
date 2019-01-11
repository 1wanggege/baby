package com.qf.service;

import com.qf.entity.CookBook;
import com.qf.utils.ResultVo;

import java.util.List;

public interface CookBookService {
    //根据菜单的id删除菜单
    ResultVo deleteByPrimaryKey(Integer id);
    //新增菜单食谱
    ResultVo insertSelective(CookBook record);
    //依据菜单id查询菜单
    ResultVo selectByPrimaryKey(Integer id);
    //修改菜单
    ResultVo updateByPrimaryKeySelective(CookBook record);
    //根据三级菜单查询食谱
    ResultVo findByPid(Integer pid);
    //根据食品编号查询食谱
    ResultVo findByFid(Integer fid);
    //展示所有四级食谱
    ResultVo findAll();
}
