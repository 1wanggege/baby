package com.qf.controller;

import com.qf.entity.SecondFood;
import com.qf.service.SecondFoodService;
import com.qf.utils.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(value = "二级菜单Controller",tags = "食品二级菜单模块接口")
@RestController
@CrossOrigin
public class SecondFoodController {

    @Autowired
    private SecondFoodService secondFoodService;

    @ApiOperation("展示所有的二级菜单")
    @RequestMapping("showAllSecondfood.do")
    public ResultVo showAllSecondfood(){
        return secondFoodService.findAll();
    }

    @ApiOperation("依据二级菜单id删除二级食品菜单")
    @RequestMapping("delSecondfood.do")
    public ResultVo delSecondfood(@ApiParam(value = "二级食品菜单id")Integer id){
        return secondFoodService.deleteByPrimaryKey(id);
    }

    @ApiOperation("添加二级菜单食品菜单")
    @RequestMapping("addSecondfood.do")
    public ResultVo addSecondfood(@ApiParam(value = "二级食品菜单对象")SecondFood secondFood){
        return secondFoodService.insertSelective(secondFood);

    }
    @ApiOperation("依据id查询对应的二级食品菜单")
    @RequestMapping("findSecondfoodById.do")
    public ResultVo findSecondfoodById(@ApiParam(value = "二级食品菜单id")Integer id){
        return secondFoodService.selectByPrimaryKey(id);
    }

    @ApiOperation("修改二级食品菜单")
    @RequestMapping("updateSecondfood.do")
    public ResultVo updateSecondfood(@ApiParam(value = "二级食品菜单对象") SecondFood secondFood){
        return secondFoodService.updateByPrimaryKeySelective(secondFood);
    }

    @ApiOperation("修改一级食品菜单id查询二级食品菜单")
    @RequestMapping("findSecondfoodByPid.do")
    public ResultVo findSecondfoodByPid(@ApiParam(value = "一级食品菜单id")Integer pid){
        return secondFoodService.findAllByPid(pid);
    }
}
