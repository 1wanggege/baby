package com.qf.serviceImpl;

import com.qf.dao.UserphotosMapper;
import com.qf.entity.Userphotos;
import com.qf.service.UserPhotosService;
import com.qf.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPhotosServiceImpl implements UserPhotosService {

    @Autowired
    private UserphotosMapper userphotosMapper;

    @Override
    public ResultVo insertSelective(Userphotos record) {
        if (record!=null){
            return ResultVo.setOK(userphotosMapper.insertSelective(record));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findByBid(Integer bid) {
        if (bid!=null){
            return ResultVo.setOK(userphotosMapper.findByBid(bid));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo selectByPrimaryKey(Integer id) {
        if(id!=null){
            return ResultVo.setOK(userphotosMapper.selectByPrimaryKey(id));
        }
        return ResultVo.setERROR();
    }
}
