package com.qf.dao;

import com.qf.entity.Goods;
import com.qf.utils.VGoods;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer goodsid);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer goodsid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    List<VGoods> selectAll();

    List<VGoods> selectByName(String goodsname);
}