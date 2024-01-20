package com.atguigu.core.controller;

import com.atguigu.core.entity.UserEntity;
import com.atguigu.core.event.EventPublisher;
import com.atguigu.core.event.LoginSuccessEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    EventPublisher eventPublisher;

    @GetMapping("/login")
    public String login(@RequestParam("username") String userName, @RequestParam("passwd") String passwd) {

        System.out.println("业务处理登录完成");


        eventPublisher.sendEvent(new LoginSuccessEvent(new UserEntity(userName, passwd)));

        return userName + "登录成功";

    }

}
