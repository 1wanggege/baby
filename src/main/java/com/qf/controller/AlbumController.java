package com.qf.controller;

import com.qf.entity.Album;
import com.qf.service.AlbumService;
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

@RestController
@Api(value = "相册Controller",tags = "制作相册模块接口")
@CrossOrigin
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @ApiOperation("展示所有的相册")
    @RequestMapping("findAllAlbum.do")
    public ResultVo findAllAlbum(){
        return albumService.findAll();
    }

    @ApiOperation("修改传来的相册")
    @RequestMapping("updateAlbum.do")
    public ResultVo updateAlbum(@ApiParam(value = "传来的相册属性对象")Album record){
        return albumService.updateByPrimaryKeySelective(record);
    }

    @ApiOperation("新增相册")
    @RequestMapping("addAlbum.do")
    public ResultVo addAlbum(@ApiParam(value = "新增传来的相册属性对象")Album record){
        return albumService.insertSelective(record);

        }

    }

