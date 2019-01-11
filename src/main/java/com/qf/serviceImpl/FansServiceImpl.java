package com.qf.serviceImpl;

import com.qf.dao.FansMapper;
import com.qf.service.FansService;
import com.qf.utils.ResultVo1;
import com.qf.utils.VFans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FansServiceImpl implements FansService {
    private ResultVo1 rv;
    @Autowired
    private FansMapper fans;
    @Override
    public List<VFans> selectByFansId(Integer userid) {
        List<VFans> vFans = null;
        try {
            vFans = fans.selectByFansId(userid);
            rv = ResultVo1.setOK(vFans);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo1.setERROR(null);
        }
        return vFans;
    }
}
