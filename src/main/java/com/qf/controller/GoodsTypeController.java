package com.qf.controller;

import com.qf.entity.GoodsType;
import com.qf.service.GoodsTypeService;
import com.qf.utils.ResultVo1;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Api(value = "商品类型Controller", tags = "商品类型的接口")
@RestController
public class GoodsTypeController {

    @Autowired
    private GoodsTypeService gs;

    /**
     * 展示商品种类
     * @return
     */
    @ApiOperation("根据展示所有商品类型")
    @RequestMapping("/selecTypeAll.do")
    @ResponseBody
    public List<GoodsType> selectAll(){
        return gs.selectAll();
    }
}
