package com.qf.serviceImpl;

import com.qf.dao.VuserMapper;
import com.qf.entity.Vuser;
import com.qf.service.VuserService;
import com.qf.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VuserServiceImpl implements VuserService {

    @Autowired
    private VuserMapper vuserMapper;
    @Override
    public ResultVo selectByPrimaryKey(Integer uid) {
        if (uid!=null){
            return ResultVo.setOK(vuserMapper.selectByPrimaryKey(uid));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo updateByPrimaryKeySelective(Vuser record) {
        if (record!=null){
            return ResultVo.setOK(vuserMapper.updateByPrimaryKeySelective(record));
        }
        return ResultVo.setERROR();
    }
}
