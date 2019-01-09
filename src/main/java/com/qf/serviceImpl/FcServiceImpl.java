package com.qf.serviceImpl;

import com.qf.dao.FcMapper;
import com.qf.entity.Fc;
import com.qf.service.FcService;
import com.qf.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FcServiceImpl implements FcService {

    @Autowired
    private FcMapper fc;

    @Override
    public ResultVo deleteByPrimaryKey(Integer id) {
        if (id != null){
            return ResultVo.setOK(fc.deleteByPrimaryKey(id));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo insertSelective(Fc record) {
        if (record != null){
            return ResultVo.setOK(fc.insertSelective(record));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo selectByPrimaryKey(Integer id) {
        if (id!=null){
            return ResultVo.setOK(fc.selectByPrimaryKey(id));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo updateByPrimaryKeySelective(Fc record) {
        if (record!=null){
            return ResultVo.setOK(fc.updateByPrimaryKeySelective(record));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findAll() {

        return ResultVo.setOK(fc.findAll());
    }
}
