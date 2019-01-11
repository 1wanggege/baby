package com.qf.dao;

import com.qf.entity.Growthrecord;

public interface GrowthrecordMapper {

    int deleteByPrimaryKey(Integer id);
    //根据宝宝id查询对应的阶段信息
    Growthrecord findByBid(Integer bid);
    //新增宝宝阶段信息
    int insertSelective(Growthrecord record);

    Growthrecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Growthrecord record);

}