package com.qf.service;

import com.qf.entity.Details;
import com.qf.utils.ResultVo;

public interface DetailsService {
    //根据id删除对应的食品评论
    ResultVo deleteByPrimaryKey(Integer id);
    //新增食品评论
    ResultVo insertSelective(Details record);
    //根据食品id查询到对应的食品评论
    ResultVo selectByPrimaryFoodId(Integer id);
    //根据食品详情的id修改对应的评论
    ResultVo updateByPrimaryKeySelective(Details record);
}
