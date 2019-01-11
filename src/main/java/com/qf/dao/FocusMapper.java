package com.qf.dao;

import com.qf.entity.Focus;
import com.qf.utils.VFocus;

import java.util.List;

public interface FocusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Focus record);

    int insertSelective(Focus record);

    Focus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Focus record);

    int updateByPrimaryKey(Focus record);

    List<VFocus> selectByFocusId(Integer userid);

    public void insertFocus(Focus focus);
}