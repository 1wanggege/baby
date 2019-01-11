package com.qf.controller;

import com.qf.service.BabysService;
import com.qf.utils.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "BabyController",tags = "baby模块接口（根据用户查询孩子信息）")
@CrossOrigin
public class BabyController {

    @Autowired
    private BabysService babysService;

    @ApiOperation("根据用户查询孩子信息")
    @RequestMapping("findBabyByUid.do")
    public ResultVo findBabyByUid(Integer uid){
        return babysService.findByUid(uid);
    }



}
