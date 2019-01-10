package com.qf.serviceImpl;

import com.qf.dao.GoodsMapper;
import com.qf.service.GoodsService;
import com.qf.utils.ResultVo1;
import com.qf.utils.VGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    private ResultVo1 rv;
    @Autowired
    private GoodsMapper gm;


    @Override
    public List<VGoods> selectAllGoods() {
        List<VGoods> goods = null;
        try {
            goods = gm.selectAll();
            rv = ResultVo1.setOK(goods);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo1.setERROR(null);
        }
        return  goods;
    }

    @Override
    public List<VGoods> selectByName(String goodsname) {
        List<VGoods> g = null;
        try {
            g = gm.selectByName(goodsname);
            rv = ResultVo1.setOK(g);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo1.setERROR(null);
        }
        return g;
    }
}
