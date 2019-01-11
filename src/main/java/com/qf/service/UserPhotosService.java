package com.qf.service;

import com.qf.entity.Userphotos;
import com.qf.utils.ResultVo;

import java.util.List;

public interface UserPhotosService {
    //新增用户宝宝相册
    ResultVo insertSelective(Userphotos record);
    //依据宝宝id查询宝宝相册
    ResultVo findByBid(Integer bid);
    //依据宝宝照片id查询宝宝照片
    ResultVo selectByPrimaryKey(Integer id);
}
