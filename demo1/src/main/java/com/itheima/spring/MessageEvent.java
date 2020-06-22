package com.itheima.spring;

import org.springframework.context.ApplicationEvent;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.spring.MessageEvent
 ****/
public class MessageEvent extends ApplicationEvent {

    /***
     * 可以用于传递数据
     */
    public MessageEvent(Object source) {
        super(source);
    }
}
