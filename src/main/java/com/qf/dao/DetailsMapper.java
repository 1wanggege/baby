package com.qf.dao;

import com.qf.entity.Details;

public interface DetailsMapper {
    //根据id删除对应的食品评论
    int deleteByPrimaryKey(Integer id);
    //新增食品评论
    int insertSelective(Details record);
    //根据食品id查询到对应的食品评论
    Details selectByPrimaryFoodId(Integer id);
    //根据食品详情的id修改对应的评论
    int updateByPrimaryKeySelective(Details record);

}