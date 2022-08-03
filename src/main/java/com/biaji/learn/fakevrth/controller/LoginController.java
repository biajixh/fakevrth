package com.biaji.learn.fakevrth.controller;

import com.biaji.learn.fakevrth.dto.request.UserLogin;
import com.biaji.learn.fakevrth.dto.response.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录controller类
 */
@RestController
@Slf4j
public class LoginController {

    /**
     * 登录api
     * @param userLogin 用户信息请求
     * @return Result 统一返回信息
     */
    @PostMapping(value = "api/login")
    @CrossOrigin
    public Result login(@RequestBody UserLogin userLogin){
        return new Result(200);
    }
}
