package com.atguigu.core.robot.service;

import com.atguigu.core.robot.properties.RobotProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RobotService {

    @Autowired
    RobotProperties robotProperties;

    public String sayHello() {
        return "你好:" + robotProperties.getName() + ";" + "年龄：" + robotProperties.getAge();
    }

}
