package com.itheima.aop.service;

import org.springframework.aop.framework.DefaultAopProxyFactory;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.aop.service.UserServiceImpl
 ****/
//public class UserServiceImpl implements UserService{
public class UserServiceImpl{

    //@Override
    public void add(){
        System.out.println("增加用户！");
    }
}
