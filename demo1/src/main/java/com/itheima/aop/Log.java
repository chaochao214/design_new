package com.itheima.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.framework.DefaultAopProxyFactory;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.aop.Log
 ****/
public class Log {

    public void before(JoinPoint jp){
        System.out.println("执行对象："+jp.getSignature().getName());
        System.out.println("前置通知记录日志！");
    }
}
