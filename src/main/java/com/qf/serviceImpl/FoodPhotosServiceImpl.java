package com.qf.serviceImpl;

import com.qf.dao.FoodPhotosMapper;
import com.qf.entity.FoodPhotos;
import com.qf.service.FoodPhotosService;
import com.qf.utils.ResultVo;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodPhotosServiceImpl implements FoodPhotosService {

    @Autowired
    private FoodPhotosMapper fooddao;

    @Override
    public ResultVo deleteByPrimaryKey(Integer id) {
        if (id!= null){
            return ResultVo.setOK(fooddao.deleteByPrimaryKey(id));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo insertSelective(FoodPhotos record) {
        if (record!=null){
            return ResultVo.setOK(fooddao.insertSelective(record));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo selectByPrimaryKey(Integer id) {
        if (id!=null){
            return ResultVo.setOK(fooddao.selectByPrimaryKey(id));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo updateByPrimaryKeySelective(FoodPhotos record) {
        if (record!=null){
            return ResultVo.setOK(fooddao.updateByPrimaryKeySelective(record));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findByFid(Integer fid) {
        if (fid!=null){
            return ResultVo.setOK(fooddao.findByFid(fid));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findByCid(Integer cid) {
        if (cid!=null){
            return ResultVo.setOK(fooddao.findByCid(cid));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findBySid(Integer sid) {
        if (sid!=null){
            return ResultVo.setOK(fooddao.findBySid(sid));
        }
        return ResultVo.setERROR();
    }
}
