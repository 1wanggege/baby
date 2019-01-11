package com.qf.serviceImpl;

import com.qf.dao.GiftMapper;
import com.qf.entity.Gift;
import com.qf.service.GiftService;
import com.qf.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GiftServiceImpl implements GiftService {

    @Autowired
    private GiftMapper giftdao;

    @Override
    public ResultVo deleteByPrimaryKey(Integer id) {
        if (id!=null){
            return ResultVo.setOK(giftdao.deleteByPrimaryKey(id));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo insertSelective(Gift record) {
        if (record!=null){
            return ResultVo.setOK(giftdao.insertSelective(record));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo selectByPrimaryKey(Integer id) {
        if (id!=null){
            return ResultVo.setOK(giftdao.selectByPrimaryKey(id));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo updateByPrimaryKeySelective(Gift record) {
       if (record!=null){
           return ResultVo.setOK(giftdao.updateByPrimaryKeySelective(record));
       }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findByuid(Integer uid) {
        if (uid!=null){
            return ResultVo.setOK(giftdao.findByuid(uid));
        }
        return ResultVo.setERROR();
    }
}
