package com.qf.service;

import com.qf.entity.Fc;
import com.qf.utils.ResultVo;

import java.util.List;

public interface FcService {

    //根据食谱的id删除食谱
    ResultVo deleteByPrimaryKey(Integer id);
    //添加食谱
    ResultVo insertSelective(Fc record);
    //根据id查询食谱
    ResultVo selectByPrimaryKey(Integer id);
    //修改食谱
    ResultVo updateByPrimaryKeySelective(Fc record);
    //查询全部食谱
    ResultVo findAll();
}
