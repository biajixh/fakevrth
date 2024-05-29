package com.biaji.learn.fakevrth.service;

import com.biaji.learn.fakevrth.dao.NavItemDao;
import com.biaji.learn.fakevrth.pojo.NavItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 导航条菜单Service
 */
@Service
public class NavItemService {

    /**
     * NavItemDao注入
     */
    @Autowired
    NavItemDao navItemDao;

    /**
     * 导航条查询
     * @return List<NavItem> 导航条列表
     */
    public List<NavItem> findAll(){
        return navItemDao.findAll();
    }

    /**
     * 添加或者修改导航条项
     * @param navItem
     * @return
     */
    public NavItem save(NavItem navItem){
        return navItemDao.save(navItem);
    }

    /**
     * 删除导航条项
     * @param ids
     */
    public void deleteAllByIdInBatch(List<Integer> ids){
        navItemDao.deleteAllByIdInBatch(ids);
    }
}
