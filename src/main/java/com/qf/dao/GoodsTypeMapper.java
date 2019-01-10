package com.qf.dao;

import com.qf.entity.GoodsType;

import java.util.List;

public interface GoodsTypeMapper {
    int deleteByPrimaryKey(Integer typeid);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(Integer typeid);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);

    List<GoodsType> selectAll();
}