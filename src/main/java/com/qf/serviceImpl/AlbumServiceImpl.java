package com.qf.serviceImpl;

import com.qf.dao.AlbumMapper;
import com.qf.entity.Album;
import com.qf.service.AlbumService;
import com.qf.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumMapper albumdao;

    @Override
    public ResultVo insertSelective(Album record) {
        if (record!=null){
            return ResultVo.setOK(albumdao.insertSelective(record));
        }

        return ResultVo.setERROR();
    }

    @Override
    public ResultVo updateByPrimaryKeySelective(Album record) {
        if (record!=null){
            return ResultVo.setOK(albumdao.updateByPrimaryKeySelective(record));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findAll() {
        try {
            return ResultVo.setOK(albumdao.findAll());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResultVo.setERROR();
    }
}
