package com.qf.dao;

import com.qf.entity.SecondFood;

import java.util.List;

public interface SecondFoodMapper {
    //依据二级菜单id删除二级食品菜单
    int deleteByPrimaryKey(Integer id);
    //添加二级菜单食品菜单
    int insertSelective(SecondFood record);
    //依据id查询对应的二级食品菜单
    SecondFood selectByPrimaryKey(Integer id);
    //修改二级菜单
    int updateByPrimaryKeySelective(SecondFood record);
    //展示所有的二级菜单
    List<SecondFood> findAll();
    //根据一级菜单查询二级菜单
    List<SecondFood> findAllByPid(Integer pid);
}