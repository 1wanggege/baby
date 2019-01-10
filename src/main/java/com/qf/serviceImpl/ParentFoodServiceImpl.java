package com.qf.serviceImpl;

import com.qf.dao.ParentFoodMapper;
import com.qf.entity.ParentFood;
import com.qf.service.ParentFoodService;
import com.qf.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentFoodServiceImpl implements ParentFoodService {
    @Autowired
    private ParentFoodMapper parentfooddao;

    @Override
    public ResultVo deleteByPrimaryKey(Integer id) {
        if (id!=null){
            ResultVo.setOK(parentfooddao.deleteByPrimaryKey(id));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo insertSelective(ParentFood record) {
        if (record!=null){
            return ResultVo.setOK(parentfooddao.insertSelective(record));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo selectByPrimaryKey(Integer id) {
        if (id!=null){
            return ResultVo.setOK(parentfooddao.selectByPrimaryKey(id));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo updateByPrimaryKeySelective(ParentFood record) {
        if (record!=null){
        return ResultVo.setOK(parentfooddao.updateByPrimaryKeySelective(record));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findAll() {
        try {
            return ResultVo.setOK(parentfooddao.findAll());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResultVo.setERROR();
    }
}
