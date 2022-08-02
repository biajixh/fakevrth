package com.biaji.learn.fakevrth.dto.request;

import lombok.Data;

/**
 * 用户登录请求实体类
 */
@Data
public class UserLogin {

    int id;

    private String username;

    private String password;
}
