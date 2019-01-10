package com.qf.serviceImpl;

import com.qf.dao.FoodMapper;
import com.qf.entity.Food;
import com.qf.service.FoodService;

import com.qf.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodMapper fooddao;


    @Override
    public ResultVo deleteByPrimaryKey(Integer id) {
        try {
            return ResultVo.setOK(fooddao.deleteByPrimaryKey(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo insertSelective(Food record) {
        try {
            return ResultVo.setOK(fooddao.insertSelective(record));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo selectByPrimaryKey(Integer id) {

        try {
            return ResultVo.setOK(fooddao.selectByPrimaryKey(id));
        } catch (Exception e) {
            e.printStackTrace();

        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo updateByPrimaryKeySelective(Food record) {
        try {
            return ResultVo.setOK(fooddao.updateByPrimaryKeySelective(record));
        } catch (Exception e) {
            e.printStackTrace();

        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findAll() {

        try {
            return ResultVo.setOK(fooddao.findAll());
        } catch (Exception e) {
            e.printStackTrace();

        }
        return ResultVo.setERROR();
    }
}
