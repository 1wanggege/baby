package com.qf.service;

import com.qf.entity.Comment;

import com.qf.utils.ResultVo;
import com.qf.utils.ResultVo1;
import com.qf.utils.VComment;

import java.util.List;

public interface CommentService {

    List<VComment> selectByGoodsId(Integer goodsid);

    ResultVo1 insertComment(Comment comment);
}
