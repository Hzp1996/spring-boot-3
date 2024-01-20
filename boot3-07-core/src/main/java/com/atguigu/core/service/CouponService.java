package com.atguigu.core.service;

import com.atguigu.core.entity.UserEntity;
import com.atguigu.core.event.LoginSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class CouponService {

    @EventListener
    public void onEvent(LoginSuccessEvent loginSuccessEvent){
        System.out.println("CouponService 收到事件=====");
        UserEntity user = (UserEntity) loginSuccessEvent.getSource();
        addCouponScore(user.getUserName());
    }


    public void addCouponScore(String username){
        System.out.println(username + "随机得到了一张优惠券");
    }

}
