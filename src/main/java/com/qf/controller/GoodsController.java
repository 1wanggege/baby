package com.qf.controller;

import com.qf.service.GoodsService;
import com.qf.utils.VGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GoodsController {
    @Autowired
    private GoodsService gss;

    /**
     * 展示所有商品和评论
     * @return
     */
    @RequestMapping("/selectAllGoods.do")
    @ResponseBody
    public List<VGoods> selectAllGoods(){
        return gss.selectAllGoods();
    }
    /**
     * 根据商品名查找商品
     * @return
     */
    @RequestMapping("/selectByName.do")
    @ResponseBody
    public List<VGoods> selectByName(String goodsname){
        return  gss.selectByName(goodsname);
    }
}
