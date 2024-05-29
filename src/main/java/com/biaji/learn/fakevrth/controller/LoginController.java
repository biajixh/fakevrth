package com.biaji.learn.fakevrth.controller;

import com.biaji.learn.fakevrth.pojo.User;
import com.biaji.learn.fakevrth.dto.response.Result;
import com.biaji.learn.fakevrth.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

/**
 * 登录controller类
 */
@RestController
@Slf4j
public class LoginController {

    @Autowired
    UserService userService;

    Logger logger = LoggerFactory.getLogger(LoginController.class);

    /**
     * 登录api
     * @param userLogin 用户信息请求
     * @return Result 统一返回信息
     */
    @PostMapping(value = "api/login")
    @CrossOrigin
    public Result login(@RequestBody User userLogin){
        String username = userLogin.getUsername();
        username = HtmlUtils.htmlEscape(username);

        User user = userService.get(username,userLogin.getPassword());
        logger.debug("user:{}",user);
        if(null == user){
            return new Result(400);
        }else {
            return new Result(200);
        }
    }
}
