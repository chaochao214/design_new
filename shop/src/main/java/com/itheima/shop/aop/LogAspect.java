package com.itheima.shop.aop;

import com.itheima.shop.log.ThreadUserLog;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Stream;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.aop.LogAspect
 ****/
@Component
@Aspect
@Slf4j
public class LogAspect {

    @Autowired
    private ThreadUserLog threadUserLog;

    /***
     * 记录日志
     */
    @SneakyThrows
    @Before("execution(java.lang.Integer com.itheima.shop.service.impl.*.*(..))")
    public void logRecode(JoinPoint joinPoint){
        //获取方法名字和参数
        String methodName = joinPoint.getTarget().getClass().getName()+"."+joinPoint.getSignature().getName();
        //记录日志
        //todo
        log.info(threadUserLog.reload(methodName,args(joinPoint.getArgs())));
    }

    /****
     * 参数获取
     */
    public String args(Object[] args){
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i <args.length ; i++) {
            buffer.append("  args("+i+"):"+args[i].toString());
        }
        return buffer.toString();
    }
}
