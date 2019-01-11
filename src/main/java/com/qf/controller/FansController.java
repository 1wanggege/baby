package com.qf.controller;

import com.qf.dao.FansMapper;
import com.qf.utils.VFans;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Api(value = "粉丝Controller", tags = "粉丝列表的接口")
@Controller
public class FansController {
    @Autowired
    private FansMapper fansm;

    @ApiOperation("通过userid查看用户关注的人")
    @RequestMapping("/selectByFanId.do")
    @ResponseBody
    public List<VFans> selectByFanId(@ApiParam(value = "传用户的id")Integer userid){
        return fansm.selectByFansId(userid);
    }
}
