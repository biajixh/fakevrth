package com.biaji.learn.fakevrth.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "nav_item")
@Entity
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class NavItem {

    /**
     * nav_id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nav_id")
    int navId;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String navItem;
}
