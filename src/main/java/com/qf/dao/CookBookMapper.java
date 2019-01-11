package com.qf.dao;

import com.qf.entity.CookBook;

import java.util.List;

public interface CookBookMapper {
    //根据菜单的id删除菜单
    int deleteByPrimaryKey(Integer id);
    //新增菜单食谱
    int insertSelective(CookBook record);
    //依据菜单id查询菜单
    CookBook selectByPrimaryKey(Integer id);
    //修改菜单
    int updateByPrimaryKeySelective(CookBook record);
    //根据三级菜单查询食谱
    List<CookBook> findByPid(Integer pid);
    //根据食品编号查询食谱
    List<CookBook> findByFid(Integer fid);
    //展示所有四级食谱
    List<CookBook> findAll();

}