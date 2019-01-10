package com.qf.dao;

import com.qf.entity.Food;

import java.util.List;

public interface FoodMapper {
    //删除食物
    int deleteByPrimaryKey(Integer id);
    //新增食物
    int insertSelective(Food record);
    //依据id查询食物
    Food selectByPrimaryKey(Integer id);
    //更新食物
    int updateByPrimaryKeySelective(Food record);

    //查询所有的食物
    List<Food> findAll();


}