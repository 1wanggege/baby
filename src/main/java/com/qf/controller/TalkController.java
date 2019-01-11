package com.qf.controller;

import com.qf.service.TalkService;
import com.qf.utils.VTalk;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Api(value = "说说Controller", tags = "展示关注人说说的接口")
@Controller
public class TalkController {
    @Autowired
    private TalkService ts;

    @ApiOperation("通过userid查看用户关注的人发表的说说")
    @RequestMapping("/selectByFansId.do")
    @ResponseBody
    public List<VTalk> selectByFansId(@ApiParam(value = "传用户的id")Integer userid){
        return ts.selectTalk(userid);
    }
}
