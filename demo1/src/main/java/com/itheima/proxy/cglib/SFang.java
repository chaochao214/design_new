package com.itheima.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.proxy.cglib.SFang
 * 代理过程实现
 ****/
public class SFang implements MethodInterceptor{

    private Object instance;

    public SFang(Object instance) {
        this.instance = instance;
    }

    //代理的过程
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        objects[0]="S房网替租户"+objects[0]+"交钱！";
        return method.invoke(instance,objects);
    }
}
