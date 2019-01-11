package com.qf.service;

import com.qf.entity.Babys;
import com.qf.utils.ResultVo;

import java.util.List;

public interface BabysService {
    //根据用户查询对应的宝贝
    ResultVo findByUid(Integer uid);
}
