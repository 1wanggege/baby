package com.qf.service;

import com.qf.utils.VGoods;

import java.util.List;

public interface GoodsService {
    List<VGoods> selectAllGoods();
    List<VGoods> selectByName(String goodsname);
}
