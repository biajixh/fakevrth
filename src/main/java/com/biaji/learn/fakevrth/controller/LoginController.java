package com.biaji.learn.fakevrth.controller;

import com.biaji.learn.fakevrth.dto.request.UserLogin;
import com.biaji.learn.fakevrth.dto.response.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

/**
 * 登录controller类
 */
@Controller
@Slf4j
public class LoginController {

    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@ReseponseBody UserLogin userLogin){

    }
}
