package com.qf.service;

import com.qf.entity.Growthrecord;
import com.qf.utils.ResultVo;

public interface GrowthrecordService {
    //根据宝宝id查询对应的阶段信息
    ResultVo findByBid(Integer bid);
    //新增宝宝阶段信息
    ResultVo insertSelective(Growthrecord record);
}
