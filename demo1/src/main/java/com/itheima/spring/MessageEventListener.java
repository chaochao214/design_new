package com.itheima.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.spring.ApplicationEventListener
 ****/
public class MessageEventListener implements ApplicationListener {

    //监听触发执行
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("监听到了对应事件！");
    }
}
