package com.qf.serviceImpl;

import com.qf.dao.StageMapper;
import com.qf.entity.Stage;
import com.qf.service.StageFoodService;
import com.qf.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StageServiceImpl implements StageFoodService {

    @Autowired
    private StageMapper stagedao;


    @Override
    public ResultVo insertSelective(Stage record) {
        if (record!=null){
            return ResultVo.setOK(stagedao.insertSelective(record));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findBypId(Integer pid) {
        if (pid!=null){
            return ResultVo.setOK(stagedao.findBypId(pid));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findAll() {
        try {
            return ResultVo.setOK(stagedao.findAll());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResultVo.setERROR();
    }
}
