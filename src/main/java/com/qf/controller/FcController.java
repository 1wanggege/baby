package com.qf.controller;

import com.qf.entity.Fc;
import com.qf.service.FcService;
import com.qf.utils.ResultVo;
import com.sun.org.apache.regexp.internal.RE;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(value = "菜谱Controller",tags = "菜谱模块的接口")
@RestController
@CrossOrigin
public class FcController {

    @Autowired
    private FcService fcService;

    @ApiOperation("根据菜谱id删除菜谱")
    @PostMapping("delFcById.do")
    public ResultVo delFcById(@ApiParam(value = "传来的菜谱id")Integer id){
        return fcService.deleteByPrimaryKey(id);
    }

    @ApiOperation("新增菜谱")
    @PostMapping("addFc.do")
    public ResultVo add(@ApiParam(value = "传来的json格式菜谱对象属性")Fc fc){
        return fcService.insertSelective(fc);
    }

    @ApiOperation("根据id查询菜谱")
    @PostMapping("findById.do")
    public ResultVo findById(@ApiParam(value = "传来的菜谱id")Integer id){
        return fcService.selectByPrimaryKey(id);
    }

    @ApiOperation("根据传来的菜谱属性中的id值修改该菜谱")
    @PostMapping("updateFc.do")
    public ResultVo updateFc(@ApiParam(value = "传来的json格式菜谱对象") Fc fc){
        return fcService.updateByPrimaryKeySelective(fc);
    }

    @ApiOperation("展示所有的菜谱")
    @PostMapping("findAllFc.do")
    public ResultVo findALL(){
        return fcService.findAll();
    }

}
