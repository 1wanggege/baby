package com.qf.controller;

import com.qf.entity.Userphotos;
import com.qf.service.UserPhotosService;
import com.qf.utils.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "宝宝相册Controller",tags = "宝宝相册模块接口")
@RestController
@CrossOrigin
public class UserPhotosController {

    @Autowired
    private UserPhotosService userPhotosService;

    @ApiOperation("根据宝宝的id查询相册")
    @RequestMapping("findPhotoByBid.do")
    public ResultVo findPhotoByBid(@ApiParam(value = "用户传来的宝宝id值") Integer bid){
        return userPhotosService.findByBid(bid);

    }

    @ApiOperation("新增宝宝相册")
    @RequestMapping("addBBPhoto.do")
    public ResultVo addBBPhoto(@ApiParam(value = "用户传来的宝宝照片属性")Userphotos userphotos){
        return userPhotosService.insertSelective(userphotos);

    }

    @ApiOperation("根据宝宝的照片id查询照片详情")
    @RequestMapping("findPhotoByid.do")
    public ResultVo findPhotoByid(@ApiParam(value = "用户传来的宝宝照片id值") Integer id){
        return userPhotosService.selectByPrimaryKey(id);

    }

}
