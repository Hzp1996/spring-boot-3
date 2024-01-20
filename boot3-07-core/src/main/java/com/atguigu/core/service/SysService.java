package com.atguigu.core.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class SysService {

    @EventListener
    public void recordLog(String userName) {
        System.out.println(userName + "登录信息已被记录");
    }

}
