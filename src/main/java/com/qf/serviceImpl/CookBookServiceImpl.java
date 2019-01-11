package com.qf.serviceImpl;

import com.qf.dao.CookBookMapper;
import com.qf.entity.CookBook;
import com.qf.service.CookBookService;
import com.qf.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CookBookServiceImpl implements CookBookService {

    @Autowired
    private CookBookMapper cookbookdao;

    @Override
    public ResultVo deleteByPrimaryKey(Integer id) {
        if (id!=null){
            return ResultVo.setOK(cookbookdao.deleteByPrimaryKey(id));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo insertSelective(CookBook record) {
        if (record!=null){
            return ResultVo.setOK(cookbookdao.insertSelective(record));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo selectByPrimaryKey(Integer id) {
        if (id!=null){
            return ResultVo.setOK(cookbookdao.selectByPrimaryKey(id));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo updateByPrimaryKeySelective(CookBook record) {
        if (record!=null){
            return ResultVo.setOK(cookbookdao.updateByPrimaryKeySelective(record));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findByPid(Integer pid) {
        if (pid!=null){
            return ResultVo.setOK(cookbookdao.findByPid(pid));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findByFid(Integer fid) {
        if (fid!=null){
            return ResultVo.setOK(cookbookdao.findByFid(fid));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findAll() {
        try {
            return ResultVo.setOK(cookbookdao.findAll());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResultVo.setERROR();
    }
}
