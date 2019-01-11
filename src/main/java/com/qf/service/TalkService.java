package com.qf.service;

import com.qf.utils.VTalk;

import java.util.List;

public interface TalkService {
    List<VTalk> selectTalk(Integer userid);
}
