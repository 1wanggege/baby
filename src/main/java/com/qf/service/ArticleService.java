package com.qf.service;

import com.qf.entity.Article;
import com.qf.utils.ResultVo;

import java.util.List;

public interface ArticleService {
    //删除文章
    ResultVo deleteByPrimaryKey(Integer id);
    //新增文章
    ResultVo insertSelective(Article record);
    //通过文章的Id查询对应的文章
    ResultVo selectByPrimaryKey(Integer id);
    //修改文章
    ResultVo updateByPrimaryKeySelective(Article record);
    //展示所有的文章
    ResultVo findAll();

}
