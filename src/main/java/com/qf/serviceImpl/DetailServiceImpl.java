package com.qf.serviceImpl;

import com.qf.dao.DetailsMapper;
import com.qf.entity.Details;
import com.qf.service.DetailsService;
import com.qf.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailServiceImpl implements DetailsService {

    @Autowired
    private DetailsMapper detailsMapper;

    @Override
    public ResultVo deleteByPrimaryKey(Integer id) {
        if (id != null){
             return ResultVo.setOK(detailsMapper.deleteByPrimaryKey(id));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo insertSelective(Details record) {
        if (record!=null){
          return ResultVo.setOK(detailsMapper.insertSelective(record));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo selectByPrimaryFoodId(Integer id) {
        if ( id!= null){
            return ResultVo.setOK(detailsMapper.selectByPrimaryFoodId(id));
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo updateByPrimaryKeySelective(Details record) {
        if (record!=null){
            return ResultVo.setOK(detailsMapper.updateByPrimaryKeySelective(record));
        }
        return ResultVo.setERROR();
    }
}
