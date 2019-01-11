package com.qf.dao;

import com.qf.entity.Vuser;

public interface VuserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Vuser record);

    int insertSelective(Vuser record);
    //根据用户id查询会员信息
    Vuser selectByPrimaryKey(Integer uid);
    //修改用户会员信息
    int updateByPrimaryKeySelective(Vuser record);

}