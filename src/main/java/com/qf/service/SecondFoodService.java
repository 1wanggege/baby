package com.qf.service;

import com.qf.entity.SecondFood;
import com.qf.utils.ResultVo;

import java.util.List;

public interface SecondFoodService {

    //依据二级菜单id删除二级食品菜单
    ResultVo deleteByPrimaryKey(Integer id);
    //添加二级菜单食品菜单
    ResultVo insertSelective(SecondFood record);
    //依据id查询对应的二级食品菜单
    ResultVo selectByPrimaryKey(Integer id);
    //修改二级菜单
    ResultVo updateByPrimaryKeySelective(SecondFood record);
    //展示所有的二级菜单
    ResultVo findAll();
    //根据一级菜单查询二级菜单
    ResultVo findAllByPid(Integer pid);
}
