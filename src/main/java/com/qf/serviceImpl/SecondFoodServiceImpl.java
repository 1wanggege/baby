package com.qf.serviceImpl;

import com.qf.dao.SecondFoodMapper;
import com.qf.entity.SecondFood;
import com.qf.service.SecondFoodService;
import com.qf.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecondFoodServiceImpl implements SecondFoodService {

    @Autowired
    private SecondFoodMapper secondFooddao;


    @Override
    public ResultVo deleteByPrimaryKey(Integer id) {
        if (id!=null){
            return ResultVo.setOK(secondFooddao.deleteByPrimaryKey(id));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo insertSelective(SecondFood record) {
        if (record!=null){
            return ResultVo.setOK(secondFooddao.insertSelective(record));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo selectByPrimaryKey(Integer id) {
        if (id!=null){
            return ResultVo.setOK(secondFooddao.selectByPrimaryKey(id));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo updateByPrimaryKeySelective(SecondFood record) {
        if (record!=null){
            return ResultVo.setOK(secondFooddao.updateByPrimaryKeySelective(record));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findAll() {
        try {
            return ResultVo.setOK(secondFooddao.findAll());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findAllByPid(Integer pid) {
       if (pid!=null){
           return ResultVo.setOK(secondFooddao.findAllByPid(pid));
       }
        return ResultVo.setERROR();
    }
}
