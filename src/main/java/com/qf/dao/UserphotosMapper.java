package com.qf.dao;

import com.qf.entity.Userphotos;

import java.util.List;

public interface UserphotosMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userphotos record);
    //新增用户宝宝相册
    int insertSelective(Userphotos record);
    //依据宝宝照片id查询宝宝照片
    Userphotos selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userphotos record);
    //依据宝宝id查询宝宝相册
    List<Userphotos> findByBid(Integer bid);
}