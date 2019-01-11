package com.qf.serviceImpl;

import com.qf.dao.BabysMapper;
import com.qf.service.BabysService;
import com.qf.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BabysServiceImpl implements BabysService {

    @Autowired
    private BabysMapper babydao;

    @Override
    public ResultVo findByUid(Integer uid) {
        if (uid!=null){
            return ResultVo.setOK(babydao.findByUid(uid));
        }
        return ResultVo.setERROR();
    }
}
