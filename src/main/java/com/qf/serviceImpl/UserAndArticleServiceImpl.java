package com.qf.serviceImpl;

import com.qf.dao.UserAndArticleMapper;
import com.qf.service.UserAndArticleService;
import com.qf.service.UserService;
import com.qf.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAndArticleServiceImpl implements UserAndArticleService {

    @Autowired
    private UserAndArticleMapper userAndArticleMapper;

    @Override
    public ResultVo findByuid(Integer uid) {
        if (uid!=null){
            return ResultVo.setOK(userAndArticleMapper.findByuid(uid));
        }
        return ResultVo.setERROR();
    }
}
