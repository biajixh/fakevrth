package com.biaji.learn.fakevrth.service;

import com.biaji.learn.fakevrth.dao.UserDao;
import com.biaji.learn.fakevrth.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户Service
 */
@Service
public class UserService {
    /**
     * UserDao注入
     */
    @Autowired
    UserDao userDao;

    /**
     * 用户名是否存在判断
     * @param username 用户名
     * @return boolean 是否存在：true 是 false 否
     */
    public boolean existsUser(String username){
        User user = getByName(username);
        return null!=user;
    }

    /**
     * 根据用户名称查找用户信息
     * @param username 用户名
     * @return User 用户信息实体类
     */
    public User getByName(String username){
        return userDao.findByUsername(username);
    }

    /**
     * 根据用户和密码查找用户信息
     * @param username 用户名
     * @param password 密码
     * @return User 用户信息实体类
     */
    public User get(String username,String password){
        return userDao.getByUsernameAndPassword(username,password);
    }

    /**
     * 保存用户
     * @param user 用户实体类
     */
    public void add(User user){
        userDao.save(user);
    }
}
