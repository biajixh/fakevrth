package com.biaji.learn.fakevrth.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.annotation.processing.Generated;
import javax.persistence.*;

/**
 * 用户登录请求实体类
 */
@Data
@Table(name = "user")
@Entity
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class User {

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
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
