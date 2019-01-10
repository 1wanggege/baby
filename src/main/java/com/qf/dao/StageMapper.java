package com.qf.dao;

import com.qf.entity.Stage;

import java.util.List;

public interface StageMapper {
    //新增食品三级菜单
    int insertSelective(Stage record);
    //依据二级菜单id查询三级菜单
    List<Stage> findBypId(Integer pid);
    //查询所有的三级菜单目录
    List<Stage> findAll();
}