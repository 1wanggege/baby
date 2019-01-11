package com.qf.service;
import com.qf.entity.Album;
import com.qf.utils.ResultVo;

import java.util.List;

public interface AlbumService {

    //添加相册
    ResultVo insertSelective(Album record);
    //修改相册状态
    ResultVo updateByPrimaryKeySelective(Album record);
    //展示所有的相册
    ResultVo findAll();

}
