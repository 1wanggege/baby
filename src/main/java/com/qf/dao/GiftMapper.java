package com.qf.dao;

import com.qf.entity.Gift;

import java.util.List;

public interface GiftMapper {

    int deleteByPrimaryKey(Integer id);
    //新增礼物
    int insertSelective(Gift record);
    //根据id查询礼物
    Gift selectByPrimaryKey(Integer id);
    //更新礼物信息
    int updateByPrimaryKeySelective(Gift record);
    //根据用户查询礼物信息
    List<Gift> findByuid(Integer uid);

}