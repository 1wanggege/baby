package com.qf.controller;

import com.qf.entity.GoodsType;
import com.qf.service.GoodsTypeService;
import com.qf.utils.ResultVo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsTypeController {

    @Autowired
    private GoodsTypeService gs;

    /**
     * 展示商品种类
     * @return
     */
    @RequestMapping("/selecTypeAll.do")
    @ResponseBody
    public List<GoodsType> selectAll(){
        return gs.selectAll();
    }
}
