package com.itheima.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.proxy.jdk.QFang
 * 代理的过程实现
 ****/
public class QFang implements InvocationHandler{

    private Object instance;

    public QFang(Object instance) {
        this.instance = instance;
    }

    //整个代理过程
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //修改，增强
        args[0]="Q房网替用户"+args[0]+"交钱";
        return method.invoke(instance,args);
    }
}
