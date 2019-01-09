package com.qf.service;

import com.qf.entity.Food;
import com.qf.utils.JsonBean;
import com.qf.utils.ResultVo;

import java.util.List;

public interface FoodService {
    //删除食物
    ResultVo deleteByPrimaryKey(Integer id);
    //新增食物
    ResultVo insertSelective(Food record);
    //依据id查询食物
    ResultVo selectByPrimaryKey(Integer id);
    //更新食物
    ResultVo updateByPrimaryKeySelective(Food record);
    //查询所有的食物
    ResultVo findAll();
}
