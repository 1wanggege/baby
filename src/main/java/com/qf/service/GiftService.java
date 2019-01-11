package com.qf.service;

import com.qf.entity.Gift;
import com.qf.utils.ResultVo;

import java.util.List;

public interface GiftService {

    ResultVo deleteByPrimaryKey(Integer id);
    //新增礼物
    ResultVo insertSelective(Gift record);
    //根据id查询礼物
    ResultVo selectByPrimaryKey(Integer id);
    //更新礼物信息
    ResultVo updateByPrimaryKeySelective(Gift record);
    //根据用户查询礼物信息
    ResultVo findByuid(Integer uid);

}
