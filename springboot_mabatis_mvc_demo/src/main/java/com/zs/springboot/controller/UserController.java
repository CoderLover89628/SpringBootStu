package com.zs.springboot.controller;

import com.wordnik.swagger.annotations.ApiOperation;
import com.zs.springboot.model.User;
import com.zs.springboot.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangsheng1 on 2016/6/27.
 *
 * 请求入口Controller部分提供三种接口样例：视图模板，Json，restful风格
 *
 * Json
 */
@Controller
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /**
     * 返回Json格式数据，多用于Ajax请求。
     *
     * @return
     */
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo() {
        User user = userService.getUserInfo();
        if(user!=null){
            System.out.println("user.getName():"+user.getName());
            logger.info("user.getAge():"+user.getAge());
        }
        return user;
    }
}
