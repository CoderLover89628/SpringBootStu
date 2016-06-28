package com.zs.springboot.service;

import com.zs.springboot.mapper.UserMapper;
import com.zs.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangsheng1 on 2016/6/27.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(){
        User user=userMapper.findUserInfo();
        //User user=null;
        return user;
    }

}
