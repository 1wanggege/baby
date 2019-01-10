package com.qf.dao;

import com.qf.entity.FoodPhotos;

import java.util.List;

public interface FoodPhotosMapper {
    //根据食物图片id删除图片
    int deleteByPrimaryKey(Integer id);
    //添加食品图片
    int insertSelective(FoodPhotos record);
    //根据食品图片id返回图片信息
    FoodPhotos selectByPrimaryKey(Integer id);
    //修改图片信息
    int updateByPrimaryKeySelective(FoodPhotos record);
    //根据食品Id查询图片
    List<FoodPhotos> findByFid(Integer fid);
    //根据菜品id返回菜品图片
    List<FoodPhotos> findByCid(Integer cid);
    //根据阶段id返回阶段展示图片
    List<FoodPhotos> findBySid(Integer sid);


}