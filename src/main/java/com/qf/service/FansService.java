package com.qf.service;

import com.qf.utils.VFans;

import java.util.List;

public interface FansService {
    List<VFans> selectByFansId(Integer userid);
}
