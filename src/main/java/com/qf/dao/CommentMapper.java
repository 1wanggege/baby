package com.qf.dao;

import com.qf.entity.Comment;
import com.qf.utils.VComment;

import java.util.List;

public interface CommentMapper {


    List<VComment> selectByGoodsId(Integer goodsid);

    public void insertComment(Comment comment);
}