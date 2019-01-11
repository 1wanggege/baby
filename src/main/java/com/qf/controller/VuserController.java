package com.qf.controller;

import com.qf.entity.Vuser;
import com.qf.service.VuserService;
import com.qf.utils.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "用户会员中心Controller ",tags = "用户会员中心信息")
@RestController
@CrossOrigin
public class VuserController {

    @Autowired
    private VuserService vuserService;


    @ApiOperation("根据用户id查询会员信息")
    @RequestMapping("showVuserByuid.do")
    public ResultVo showVuserByuid(@ApiParam(value = "用户id值")Integer uid){
        return vuserService.selectByPrimaryKey(uid);
    }

    @ApiOperation("修改用户会员信息")
    @RequestMapping("updateVuser.do")
    public ResultVo updateVuser(@ApiParam(value = "用户会员用户属性")Vuser vuser){
        return vuserService.updateByPrimaryKeySelective(vuser);
    }

}
