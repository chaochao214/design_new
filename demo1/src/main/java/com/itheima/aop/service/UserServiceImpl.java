package com.itheima.aop.service;

import org.springframework.aop.framework.DefaultAopProxyFactory;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.aop.service.UserServiceImpl
 ****/
//public class UserServiceImpl implements UserService{
public class UserServiceImpl /*implements UserService*/{

//    @Override
    public void add(){
        System.out.println("增加用户！");
    }
//     DefaultAopProxyFactory   aop 代理类

    // 类 没有实现接口，自动创建cglib 代理对象
    // jdk动态代理必须实现接口
}
