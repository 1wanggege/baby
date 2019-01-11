package com.qf.serviceImpl;

import com.qf.dao.ArticleMapper;
import com.qf.entity.Article;
import com.qf.service.ArticleService;
import com.qf.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articledao;

    @Override
    public ResultVo deleteByPrimaryKey(Integer id) {
        if (id!=null){
            return ResultVo.setOK(articledao.deleteByPrimaryKey(id));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo insertSelective(Article record) {
       if (record!=null){
           return ResultVo.setOK(articledao.insertSelective(record));
       }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo selectByPrimaryKey(Integer id) {
        if (id!=null){
            return ResultVo.setOK(articledao.selectByPrimaryKey(id));
        }

        return ResultVo.setERROR();
    }

    @Override
    public ResultVo updateByPrimaryKeySelective(Article record) {
        if (record!=null){
            return ResultVo.setOK(articledao.updateByPrimaryKeySelective(record));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findAll() {
        try {
            return ResultVo.setOK(articledao.findAll());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResultVo.setERROR();
    }
}
