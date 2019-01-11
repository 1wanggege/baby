package com.qf.dao;

import com.qf.entity.Article;
import com.qf.entity.UserAndArticle;

import java.util.List;

public interface UserAndArticleMapper {
    int deleteByPrimaryKey(Integer id);
    //根据用户id查询用户收藏的文章
    List<Article> findByuid(Integer uid);

    int insertSelective(UserAndArticle record);

    UserAndArticle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserAndArticle record);


}