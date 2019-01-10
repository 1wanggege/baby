package com.qf.serviceImpl;

import com.qf.dao.GoodsTypeMapper;
import com.qf.entity.GoodsType;
import com.qf.service.GoodsTypeService;

import com.qf.utils.ResultVo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
   @Autowired
   private GoodsTypeMapper gt;

   private ResultVo1 rv;

    @Override
    public List<GoodsType> selectAll() {
        List<GoodsType> list = null;
        try {
            list = gt.selectAll();
            rv = ResultVo1.setOK(list);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo1.setERROR(null);
        }
        return list;
    }
}
