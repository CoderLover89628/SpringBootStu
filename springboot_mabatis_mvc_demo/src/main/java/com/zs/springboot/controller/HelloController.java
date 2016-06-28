package com.zs.springboot.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhangsheng1 on 2016/6/27.
 *
 * 请求入口Controller部分提供三种接口样例：视图模板，Json，restful风格
 *
 * 视图模板
 *
 */
@Controller
public class HelloController {
    private Logger logger = Logger.getLogger(HelloController.class);

    /**
     * http://localhost:8080/hello?name=cn.7player
     *
     * @param name
     * @param model
     * @return
     */
    @RequestMapping("/hello")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        logger.info("hello");
        model.addAttribute("name", name);
        return "hello";
    }
}
