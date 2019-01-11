package com.qf.controller;

import com.qf.entity.Article;
import com.qf.service.ArticleService;
import com.qf.utils.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "文章Controller",tags = "文章模块接口")
@RestController
@CrossOrigin
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @ApiOperation("展示所有的文章")
    @RequestMapping("findAllArticle.do")
    public ResultVo findAllArticle(){
        return articleService.findAll();
    }

    @ApiOperation("新增文章")
    @RequestMapping("addArticle.do")
    public ResultVo addArticle(@ApiParam(value = "传来的文章属性对象")Article record){
        return articleService.insertSelective(record);
    }

    @ApiOperation("修改文章")
    @RequestMapping("updateArticle.do")
    public ResultVo updateArticle(@ApiParam(value = "传来的文章属性对象")Article record){
        return articleService.updateByPrimaryKeySelective(record);
    }

    @ApiOperation("删除文章")
    @RequestMapping("delArticle.do")
    public ResultVo delArticle(@ApiParam(value = "传来的文章id")Integer id){
        return articleService.deleteByPrimaryKey(id);
    }

    @ApiOperation("根据文章id查询对应的文章")
    @RequestMapping("findArticleById.do")
    public ResultVo findArticleById(@ApiParam(value = "传来的文章id")Integer id){
        return articleService.selectByPrimaryKey(id);
    }

}
