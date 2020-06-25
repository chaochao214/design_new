package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.framework.util.RequestMapping;
import com.itheima.service.AccountService;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.controller.AccountController
 ****/
public class AccountController {

    private AccountService accountService;

    /***
     * 查询一条记录
     */
    @RequestMapping(value = "/account/one")
    public String one(){
        System.out.println("执行了one!");
        String result = null;//accountService.one();
        return "/WEB-INF/pages/one.jsp";
    }

    /***
     * 查询一条记录
     */
    @RequestMapping(value = "/account/info")
    public User info(){
        User user = new User();
        user.setName("王五");
        user.setAddress("深圳");
        return user;
    }
}
