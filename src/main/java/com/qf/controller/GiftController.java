package com.qf.controller;

import com.qf.entity.Gift;
import com.qf.service.GiftService;
import com.qf.utils.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(value = "礼物Controller",tags = "用户礼物模块接口")
@RestController
@CrossOrigin
public class GiftController {

    @Autowired
    private GiftService giftService;

    @ApiOperation("根据用户查询礼物")
    @RequestMapping("findGiftByuid.do")
    public ResultVo findGiftByuid(@ApiParam(value = "传来的用户id值") Integer uid) {
        return giftService.findByuid(uid);
    }

    @ApiOperation("新增用户礼物")
    @RequestMapping("addGift.do")
    public ResultVo addGift(@ApiParam(value = "传来的礼物属性") Gift gift) {
        return giftService.insertSelective(gift);
    }

    @ApiOperation("修改用户礼物")
    @RequestMapping("updateGift.do")
    public ResultVo updateGift(@ApiParam(value = "传来的礼物属性") Gift gift) {
        return giftService.updateByPrimaryKeySelective(gift);
    }

    @ApiOperation("根据礼物id查询礼物")
    @RequestMapping("findGiftByid.do")
    public ResultVo findGiftByid(@ApiParam(value = "传来的礼物id值") Integer id) {
        return giftService.selectByPrimaryKey(id);
    }
}