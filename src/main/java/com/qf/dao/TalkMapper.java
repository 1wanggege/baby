package com.qf.dao;

import com.qf.entity.Talk;
import com.qf.utils.VTalk;

import java.util.List;

public interface TalkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Talk record);

    int insertSelective(Talk record);

    Talk selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Talk record);

    int updateByPrimaryKey(Talk record);

    List<VTalk> selectTalk(Integer userid);
}