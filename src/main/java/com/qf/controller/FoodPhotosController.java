package com.qf.controller;

import com.qf.entity.FoodPhotos;
import com.qf.service.FoodPhotosService;
import com.qf.utils.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(value = "食物照片Controller",tags = "食物照片模块接口")
@RestController
@CrossOrigin
public class FoodPhotosController {

    @Autowired
    private FoodPhotosService foodPhotosService;

    @ApiOperation("根据食品的id查询对应食品照片")
    @RequestMapping("findPhotosByFid.do")
    public ResultVo findPhotosByFid(@ApiParam(value = "食品id") Integer fid) {
        return foodPhotosService.findByFid(fid);
    }

    @ApiOperation("根据食谱的id查询对应食谱照片")
    @RequestMapping("findPhotosByCid.do")
    public ResultVo findPhotosByCid(@ApiParam(value = "食谱菜品id") Integer cid) {
        return foodPhotosService.findByCid(cid);
    }

    @ApiOperation("根据所处阶段的id查询对应阶段展示照片")
    @RequestMapping("findPhotosBySid.do")
    public ResultVo findPhotosBySid(@ApiParam(value = "用户所处阶段id") Integer sid) {
        return foodPhotosService.findBySid(sid);
    }

    @ApiOperation("根据食物图片id删除展示照片")
    @RequestMapping("delPhotosByid.do")
    public ResultVo deleteByKey(@ApiParam(value = "用户所处阶段id") Integer id) {
        return foodPhotosService.deleteByPrimaryKey(id);
    }

    @ApiOperation("根据食品图片id返回图片信息")
    @RequestMapping("findPhotosByid.do")
    public ResultVo findPhotosid(@ApiParam(value = "用户所处阶段id") Integer id) {
        return foodPhotosService.selectByPrimaryKey(id);
    }

    @ApiOperation("修改图片信息")
    @RequestMapping("updatePhotos.do")
    public ResultVo updatePhotos(@ApiParam(value = "用户所处阶段id") FoodPhotos record) {
        return foodPhotosService.updateByPrimaryKeySelective(record);

    }

    @ApiOperation("食品模块图片添加接口")
    @RequestMapping("addPhotos.do")
    public ResultVo addPhotos(@ApiParam(value = "用户所处阶段id") FoodPhotos record) {
        return foodPhotosService.insertSelective(record);

    }

}