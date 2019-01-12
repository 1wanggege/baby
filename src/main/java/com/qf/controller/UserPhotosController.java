package com.qf.controller;

import com.qf.entity.Album;
import com.qf.entity.Userphotos;
import com.qf.service.UserPhotosService;
import com.qf.utils.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;
import java.util.UUID;

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
