package com.qf.dao;

import com.qf.entity.Comment;
import com.qf.utils.VComment;

import java.util.List;

public interface CommentMapper {
    int deleteByPrimaryKey(Long commentid);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Long commentid);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    List<VComment> selectByGoodsId(Integer goodsid);

    void insertComment(Comment comment);
}