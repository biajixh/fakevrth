package com.biaji.learn.fakevrth.controller;

import com.biaji.learn.fakevrth.dto.response.Result;
import com.biaji.learn.fakevrth.pojo.NavItem;
import com.biaji.learn.fakevrth.service.NavItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 导航条Controller类
 */
@RestController
public class NavItemController {

    /**
     * 导航条表Service注入
     */
    @Autowired
    NavItemService navItemService;

    Logger logger = LoggerFactory.getLogger(NavItemController.class);

    /**
     * 导航条信息
     * @return Result 统一返回信息
     */
    @GetMapping(value = "api/navItem/findAll")
    @CrossOrigin
    public Result findAll(){

        List<NavItem> navItems = navItemService.findAll();
        logger.debug("navItems:{}",navItems);
        Result result = new Result<List> (400);

        if(!CollectionUtils.isEmpty(navItems)){
            result.setCode(200);
            result.setData(navItems);
        }
        return result;
    }

    /**
     * 添加或修改导航条
     * @param data 请求body
     * @return Result 统一返回信息
     */
    @PostMapping(value = "api/navItem/save")
    @CrossOrigin
    public Result save(@RequestBody NavItem data){

        NavItem res = navItemService.save(data);

        Result result = new Result<>(400);
        if(!ObjectUtils.isEmpty(res)){
            result.setCode(200);
        }
        return result;
    }

    /**
     * 删除导航条内容
     * @param ids 导航条id
     * @return 统一返回信息
     */
    @PostMapping(value = "api/navItem/deleteByIds")
    @CrossOrigin
    public Result deleteByIds(@RequestBody List<Integer> ids){
        Result result = new Result<>(400);
        try{
            navItemService.deleteAllByIdInBatch(ids);
            result.setCode(200);
            return result;
        }catch (Exception e){
            logger.error(e.getMessage());
            return result;
        }
    }
}