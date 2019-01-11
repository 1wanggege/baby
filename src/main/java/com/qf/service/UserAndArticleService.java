package com.qf.service;

import com.qf.entity.Article;
import com.qf.utils.ResultVo;

import java.util.List;

public interface UserAndArticleService {

    //根据用户id查询用户收藏的文章
    ResultVo findByuid(Integer uid);
}
