package com.qf.controller;

import com.qf.entity.Details;
import com.qf.service.DetailsService;
import com.qf.utils.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "食品评论Controller", tags = "食品评论的问题及评论接口")
@RestController
@CrossOrigin
public class DetailsController {
    @Autowired
    DetailsService detailsService;

    /**
     * 根据食品的id查询到对应的食品问答和评论
     * @param fid
     * @return
     */
    @ApiOperation("根据食品的id查询到对应的食品问答和评论")
    @RequestMapping("findDetailsByFoodId.do")
    public ResultVo findByFid(@ApiParam(value = "食品ID(fid)") Integer fid){
        return detailsService.selectByPrimaryFoodId(fid);
    }

    /**
     * 根据传入的食品的id新增食品的问答和评论
     * @param detail
     * @return
     */
    @ApiOperation("根据传入的食品评论对应的食品id新增食品的问答和评论")
    @RequestMapping("addDetailByFid.do")
    public ResultVo addByFid(@ApiParam(value = "食品属性(fid)")Details detail){
        return detailsService.insertSelective(detail);
    }

    /**
     * 根据食品评论的id删除评论
     * @param id
     * @return
     */
    @ApiOperation("根据食品评论的id删除评论")
    @RequestMapping("delDetailById.do")
    public ResultVo delById(@ApiParam(value = "评论id") Integer id){
        return detailsService.deleteByPrimaryKey(id);
    }

    /**
     * 根据评论的id修改评论内容
     * @param detail
     * @return
     */
    @ApiOperation("根据评论的id修改评论内容")
    @RequestMapping("updateById.do")
    public ResultVo updateById(@ApiParam(value = "食品对应的评论")Details detail){
        return detailsService.updateByPrimaryKeySelective(detail);
    }
}
