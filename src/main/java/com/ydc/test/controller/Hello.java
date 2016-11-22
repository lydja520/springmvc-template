package com.ydc.test.controller;

import com.ydc.test.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by ydc on 16-11-22.
 */
@Controller
@RequestMapping(value = "/admin")
public class Hello {

    @RequestMapping(value = "/login")
    public String hello(){
        return "login";
    }

    @RequestMapping(value = "/userInfo")
    @ResponseBody
    public User getUserInfo(){
        User user = new User("李明",18,"昆明",true);
        return user;
    }

}
