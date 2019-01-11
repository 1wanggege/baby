package com.qf.serviceImpl;

import com.qf.dao.GrowthrecordMapper;
import com.qf.entity.Growthrecord;
import com.qf.service.GrowthrecordService;
import com.qf.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrowthrecordServiceImpl implements GrowthrecordService {

    @Autowired
    private GrowthrecordMapper growthrecordMapper;


    @Override
    public ResultVo findByBid(Integer bid) {
        if (bid!=null){
            return ResultVo.setOK(growthrecordMapper.findByBid(bid));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo insertSelective(Growthrecord record) {
        try {
            return ResultVo.setOK(growthrecordMapper.insertSelective(record));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResultVo.setERROR();
    }
}
