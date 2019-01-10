package com.qf.controller;

import com.qf.service.GoodsService;
import com.qf.utils.VGoods;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Api(value = "商品Controller", tags = "商品的接口")
@Controller
public class GoodsController {
    @Autowired
    private GoodsService gss;

    /**
     * 展示所有商品和评论
     * @return
     */
    @ApiOperation("根据展示所有商品")
    @RequestMapping("/selectAllGoods.do")
    @ResponseBody
    public List<VGoods> selectAllGoods(){
        return gss.selectAllGoods();
    }
    /**
     * 根据商品名查找商品
     * @return
     */
    @ApiOperation("根据商品名字查询商品")
    @RequestMapping("/selectByName.do")
    @ResponseBody
    public List<VGoods> selectByName(@ApiParam(value = "传商品名")String goodsname){
        return  gss.selectByName(goodsname);
    }
}
