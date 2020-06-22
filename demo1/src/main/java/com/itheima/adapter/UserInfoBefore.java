package com.itheima.adapter;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.adapter.UserInfoBefore
 ****/
public class UserInfoBefore implements MethodBeforeAdvice {

    //MethodBeforeAdvice:前置通知
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(args[0]+"身份识别通过！");
    }
}
