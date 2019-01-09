package com.qf.dao;

import com.qf.entity.Fc;

import java.util.List;

public interface FcMapper {
    //根据食谱的id删除食谱
    int deleteByPrimaryKey(Integer id);
    //添加食谱
    int insertSelective(Fc fc);
    //根据id查询食谱
    Fc selectByPrimaryKey(Integer id);
    //修改食谱
    int updateByPrimaryKeySelective(Fc record);
    //查询全部食谱
    List<Fc> findAll();
}