package com.qf.controller;

import com.qf.entity.ParentFood;
import com.qf.service.ParentFoodService;
import com.qf.utils.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(value = "父类一级菜单Controller",tags = "食品父类一级食品菜单接口")
@RestController
@CrossOrigin
public class ParentFoodController {
    @Autowired
    private ParentFoodService parentFoodService;

    @ApiOperation("展示所有的父类一级菜单接口")
    @RequestMapping("findAllParent")
    public ResultVo findAllParentFood(){
        return parentFoodService.findAll();
    }

    @ApiOperation("传入父类菜单id删除菜单")
    @RequestMapping("delParentFoodById.do")
    public ResultVo delParentFoodById(Integer id){
        return parentFoodService.deleteByPrimaryKey(id);
    }

    @ApiOperation("添加父类菜单目录")
    @RequestMapping("addParentFood.do")
    public ResultVo addParentFood(ParentFood record){
        return parentFoodService.insertSelective(record);
    }

    @ApiOperation("修改父类一级菜单目录")
    @RequestMapping("updateParentFood.do")
    public ResultVo updateParentFood(ParentFood record){
        return parentFoodService.updateByPrimaryKeySelective(record);
    }

    @ApiOperation("根据父类一级菜单id查询目录")
    @RequestMapping("findParentFood.do")
    public ResultVo findParentFood(Integer id){
        return parentFoodService.selectByPrimaryKey(id);
    }









}
