package com.qf.dao;

import com.qf.entity.Album;

import java.util.List;

public interface AlbumMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Album record);
    //添加相册
    int insertSelective(Album record);

    Album selectByPrimaryKey(Integer id);
    //修改相册状态
    int updateByPrimaryKeySelective(Album record);
    //展示所有的相册
    List<Album> findAll();

}