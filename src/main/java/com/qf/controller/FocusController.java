package com.qf.controller;

import com.qf.entity.Focus;
import com.qf.service.FocusService;
import com.qf.utils.ResultVo1;
import com.qf.utils.VFocus;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Api(value = "关注Controller", tags = "关注列表的接口")
@Controller
public class FocusController {
    @Autowired
    private FocusService fsc;

    @ApiOperation("通过userid查看用户关注的人")
    @RequestMapping("/selectByFocusId.do")
    @ResponseBody
    public List<VFocus> selectByFocusId(@ApiParam(value = "传用户的id") Integer userid){
        return fsc.selectByFocusId(userid);
    }
    @ApiOperation("添加关注")
    @RequestMapping("/insertFocus.do")
    @ResponseBody
    public ResultVo1 insertFocus(@ApiParam(value = "传Focus对象")Focus focus){
        return fsc.insertFocus(focus);
    }
}
