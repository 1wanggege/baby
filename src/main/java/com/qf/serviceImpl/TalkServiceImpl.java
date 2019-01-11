package com.qf.serviceImpl;

import com.qf.dao.TalkMapper;
import com.qf.service.TalkService;
import com.qf.utils.ResultVo1;
import com.qf.utils.VTalk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TalkServiceImpl implements TalkService {
    private ResultVo1 rv;
    @Autowired
    private TalkMapper tm;
    @Override
    public List<VTalk> selectTalk(Integer userid) {
        List<VTalk> vTalks = null;
        try {
            vTalks = tm.selectTalk(userid);
            rv = ResultVo1.setOK(vTalks);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo1.setERROR(null);
        }
        return vTalks;
    }
}
