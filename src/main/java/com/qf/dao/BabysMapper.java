package com.qf.dao;

import com.qf.entity.Babys;

import java.util.List;

public interface BabysMapper {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Babys record);

    Babys selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Babys record);
    //根据用户查询对应的宝贝
    List<Babys> findByUid(Integer uid);
}