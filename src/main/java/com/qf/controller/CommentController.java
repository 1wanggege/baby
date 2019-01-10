package com.qf.controller;

import com.qf.entity.Comment;
import com.qf.service.CommentService;
import com.qf.utils.ResultVo;
import com.qf.utils.ResultVo1;
import com.qf.utils.VComment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Api(value = "商品评论Controller", tags = "商品评论的接口")
@Controller
public class CommentController {
    @Autowired
    private CommentService cms;

    @ApiOperation("根据商品id展示评论")
    @RequestMapping("/selectByGoodsId.do")
    @ResponseBody
    public List<VComment> selectByGoodsId(@ApiParam(value = "传商品的id") Integer goodsid){
        return  cms.selectByGoodsId(goodsid);
    }

    @ApiOperation("增加评论")
    @RequestMapping("/insertComment.do")
    @ResponseBody
    public ResultVo1 insertComment(@ApiParam(value = "传对象")Comment comment) {
        return  cms.insertComment(comment);
    }


}
