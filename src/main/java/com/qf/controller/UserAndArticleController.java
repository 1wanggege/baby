package com.qf.controller;

import com.qf.service.UserAndArticleService;
import com.qf.utils.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "查询用户收藏Controller",tags = "查询用户收藏文章的接口")
@CrossOrigin
@RestController
public class UserAndArticleController {

    @Autowired
    private UserAndArticleService userAndArticleService;

    @ApiOperation("根据用户id查询用户收藏信息")
    @RequestMapping("findCollection.do")
    public ResultVo findCollection(@ApiParam(value = "传入的用户id值")Integer uid){
        return userAndArticleService.findByuid(uid);
    }

}
