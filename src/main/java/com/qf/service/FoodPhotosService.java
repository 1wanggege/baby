package com.qf.service;

import com.qf.entity.FoodPhotos;
import com.qf.utils.ResultVo;

import java.util.List;

public interface FoodPhotosService {

    //根据食物图片id删除图片
    ResultVo deleteByPrimaryKey(Integer id);
    //添加食品图片
    ResultVo insertSelective(FoodPhotos record);
    //根据食品图片id返回图片信息
    ResultVo selectByPrimaryKey(Integer id);
    //修改图片信息
    ResultVo updateByPrimaryKeySelective(FoodPhotos record);
    //根据食品Id查询图片
    ResultVo findByFid(Integer fid);
    //根据菜品id返回菜品图片
    ResultVo findByCid(Integer cid);
    //根据阶段id返回阶段展示图片
    ResultVo findBySid(Integer sid);
}
