package com.qf.service;

import com.qf.entity.Vuser;
import com.qf.utils.ResultVo;

public interface VuserService {
    //根据用户id查询会员信息
    ResultVo selectByPrimaryKey(Integer uid);
    //修改用户会员信息
    ResultVo updateByPrimaryKeySelective(Vuser record);

}
