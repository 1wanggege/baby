package com.qf.service;

import com.qf.entity.Goods;
import com.qf.utils.VGoods;

import java.util.List;

public interface GoodsService {
    List<VGoods> selectAllGoods();
    List<VGoods> selectByName(String goodsname);
    List<Goods> selectByTypeId(Integer typeid);
}
