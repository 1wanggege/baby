package com.qf.controller;

import com.qf.entity.SecondFood;
import com.qf.entity.Stage;
import com.qf.service.StageFoodService;
import com.qf.utils.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(value = "三级食品菜单Contrller",tags = "三级食品菜单模块接口")
@RestController
@CrossOrigin
public class StageFoodController {

    @Autowired
    private StageFoodService stageFoodService;

    @ApiOperation("根据二级菜单id查询三级菜单")
    @RequestMapping("findStageByPid.do")
    public ResultVo findStageByPid(@ApiParam(value = "传来二级菜单id") Integer pid){
        return stageFoodService.findBypId(pid);
    }

    @ApiOperation("查询所有三级菜单")
    @RequestMapping("findAllStage.do")
    public ResultVo findAllStage(Integer id){
        return stageFoodService.findAll();
    }

    @ApiOperation("新增三级菜单")
    @RequestMapping("addStageBy.do")
    public ResultVo addStageBy(@ApiParam(value = "传来三级菜单属性")Stage stage){
        return stageFoodService.insertSelective(stage);
    }





}
