package com.qf.service;

import com.qf.entity.Stage;
import com.qf.utils.ResultVo;

import java.util.List;

public interface StageFoodService {
    //新增食品三级菜单
    ResultVo insertSelective(Stage record);
    //依据二级菜单id查询三级菜单
    ResultVo findBypId(Integer pid);
    //查询所有的三级菜单目录
    ResultVo findAll();
}
