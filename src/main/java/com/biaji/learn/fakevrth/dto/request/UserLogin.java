package com.biaji.learn.fakevrth.dto.request;

import lombok.Data;

/**
 * 用户登录请求实体类
 */
@Data
public class UserLogin {

    /**
     * id
     */
    int id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;
}
