package com.atguigu.core.event;

import com.atguigu.core.entity.UserEntity;
import org.springframework.context.ApplicationEvent;

/**
 * 登录成功事件
 */
public class LoginSuccessEvent extends ApplicationEvent {

    /**
     *
     * @param source 代表谁登录成功了
     */
    public LoginSuccessEvent(UserEntity source) {
        super(source);
    }

}
