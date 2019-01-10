package com.qf.serviceImpl;

import com.qf.dao.CommentMapper;
import com.qf.entity.Comment;
import com.qf.service.CommentService;

import com.qf.utils.ResultVo;
import com.qf.utils.ResultVo1;
import com.qf.utils.VComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {
    private ResultVo1 rv;
    private ResultVo rv1;
    @Autowired
    private CommentMapper cm;
    @Override
    public List<VComment> selectByGoodsId(Integer goodsid) {
        List<VComment> id = null;
        try {
            id = cm.selectByGoodsId(goodsid);
            rv = ResultVo1.setOK(id);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo1.setERROR(null);
        }
        return id;
    }

    @Override
    public ResultVo1 insertComment(Comment comment) {
        try {
            cm.insertComment(comment);
            rv = ResultVo1.setOK(null);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo1.setERROR(1);
        }
        return  rv;
    }


}
