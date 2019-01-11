package com.qf.service;

import com.qf.entity.Focus;
import com.qf.utils.ResultVo1;
import com.qf.utils.VFocus;

import java.util.List;

public interface FocusService {
    List<VFocus> selectByFocusId(Integer userid);

    ResultVo1 insertFocus(Focus focus);
}
