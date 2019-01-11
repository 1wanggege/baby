package com.qf.controller;

import com.qf.entity.CookBook;
import com.qf.service.CookBookService;
import com.qf.utils.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "四级菜单（食谱）Controller",tags = "四级菜单（食谱）模块接口")
@RestController
@CrossOrigin
public class CookBookController {

    @Autowired
    private CookBookService cookBookService;

    @ApiOperation("根据三级菜单编号展示四级食谱")
    @RequestMapping("findCookBookByPid.do")
    public ResultVo findCookBookByPid(@ApiParam(value = "传来的父类三级菜单id") Integer pid){
        return cookBookService.findByPid(pid);
    }

    @ApiOperation("根据食品编号展示对应的食谱")
    @RequestMapping("findCookBookByFid.do")
    public ResultVo findCookBookByFid(@ApiParam(value = "传来的食品id") Integer fid){
        return cookBookService.findByFid(fid);
    }

    @ApiOperation("展示所有的四级食谱")
    @RequestMapping("findAllCookBook.do")
    public ResultVo findAllCookBook(){
        return cookBookService.findAll();
    }

    @ApiOperation("修改返回的对应食谱")
    @RequestMapping("updateCookBook.do")
    public ResultVo updateCookBook(@ApiParam(value = "传来的食谱对象")CookBook cookBook){
        return cookBookService.updateByPrimaryKeySelective(cookBook);
    }

    @ApiOperation("新增食谱")
    @RequestMapping("addCookBook.do")
    public ResultVo addCookBook(@ApiParam(value = "传来的食谱对象")CookBook cookBook){
        return cookBookService.insertSelective(cookBook);
    }

    @ApiOperation("根据食谱编号删除对应的食谱")
    @RequestMapping("delCookBookByid.do")
    public ResultVo delCookBookByid(@ApiParam(value = "传来的食谱id") Integer id){
        return cookBookService.findByFid(id);
    }


}
