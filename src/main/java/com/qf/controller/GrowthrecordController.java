package com.qf.controller;

import com.qf.entity.Growthrecord;
import com.qf.service.GrowthrecordService;
import com.qf.utils.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "宝宝成长阶段Controller",tags = "宝宝成长阶段模块展示")
@CrossOrigin
public class GrowthrecordController {
    @Autowired
    private GrowthrecordService growthrecordService;

    @ApiOperation("根据宝宝id查询宝宝的阶段信息")
    @RequestMapping("findBaByBid.do")
    public ResultVo findBaByBid(@ApiParam(value = "传来的宝宝id") Integer bid){
        return growthrecordService.findByBid(bid);
    }

    @ApiOperation("新增宝宝的阶段信息")
    @RequestMapping("addBaByBid.do")
    public ResultVo addBaByBid(@ApiParam(value = "传来的宝宝阶段信息对象")Growthrecord growthrecord) {
        return growthrecordService.insertSelective(growthrecord);
    }

}
