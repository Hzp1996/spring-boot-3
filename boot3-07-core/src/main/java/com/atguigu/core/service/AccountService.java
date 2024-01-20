package com.atguigu.core.service;

import com.atguigu.core.entity.UserEntity;
import com.atguigu.core.event.LoginSuccessEvent;
import org.apache.catalina.User;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements ApplicationListener<LoginSuccessEvent> {

    @EventListener
    public void addAccountScore(String username){
        System.out.println(username + "加了1分");
    }

    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        System.out.println("onApplicationEvent 收到事件=====");
        UserEntity user = (UserEntity) event.getSource();
        addAccountScore(user.getUserName());
    }
}
