package com.qf.dao;

import com.qf.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleMapper {
    //删除文章
    int deleteByPrimaryKey(Integer id);

    //新增文章
    int insertSelective(Article record);
    //通过文章的Id查询对应的文章
    Article selectByPrimaryKey(Integer id);
    //修改文章
    int updateByPrimaryKeySelective(Article record);
    //展示所有的文章
    List<Article> findAll();
    //设置文章的观看次数
    int updateById(@Param("id") Integer id,@Param("count") Integer count);


}