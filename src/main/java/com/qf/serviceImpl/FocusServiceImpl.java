package com.qf.serviceImpl;

import com.qf.dao.FocusMapper;
import com.qf.entity.Focus;
import com.qf.service.FocusService;
import com.qf.utils.ResultVo1;
import com.qf.utils.VFocus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FocusServiceImpl implements FocusService {
    private ResultVo1 rv;
    @Autowired
    private FocusMapper focusMapper;
    @Override
    public List<VFocus> selectByFocusId(Integer userid) {
        List<VFocus> list = null;
        try {
            list = focusMapper.selectByFocusId(userid);
            rv = ResultVo1.setOK(list);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo1.setERROR(null);
        }
        return list;
    }

    @Override
    public ResultVo1 insertFocus(Focus focus) {
        try {
            focusMapper.insertFocus(focus);
            rv = ResultVo1.setOK(null);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo1.setERROR(null);
        }
        return rv;
    }
}
