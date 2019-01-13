package com.qf.serviceImpl;


import com.qf.dao.UsersMapper;
import com.qf.service.UserService;
import com.qf.entity.Users;
import com.qf.utils.EncryptUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qf.utils.JsonBean;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper userdao;

    private  JsonBean bean = new JsonBean();

    @Override
    public JsonBean login(String username, String password) {
          if (username == null || username.equals("")){
              throw new RuntimeException("用户名为空");
          }
          if (password == null ||password.equals("")) {
              throw new RuntimeException("密码为空");

          }
          Users user = userdao.findByUsername(username);
          if (user == null){
              throw new RuntimeException("用户不存在");
          }
        if(!Objects.equals(user.getPassword(), EncryptUtil.md5Enc(password))) {
            throw new RuntimeException("密碼錯誤");
    }else {
            bean.setCode(0);
            bean.setInfo(user.getUserid());
        }
        return bean;
    }

    @Override
    public JsonBean resign(Users users) {

        if (users.getPassword().equals("")||users.getPassword()==null){
            throw new RuntimeException("密码为空，请输入注册密码");
        }
        if (users.getUsername().equals("")||users.getUsername() == null){
            throw new RuntimeException("用户名为空，请输入注册用户名");
        }
        String name = users.getUsername();
        Users user = userdao.findByUsername(name);
        if (user != null){
            throw new RuntimeException("该用户已经存在，无法注册");
        } else{
            try {
                users.setPassword(EncryptUtil.md5Enc(users.getPassword()));
                users.setUserflag(1);
                bean.setCode(0);
                userdao.insertSelective(users);
            }catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                bean.setCode(1);
            }
        }

        return bean;
    }
}
