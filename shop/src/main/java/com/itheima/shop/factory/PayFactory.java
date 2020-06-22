package com.itheima.shop.factory;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.factory.PayFactory
 * 工厂对象
 ****/
@Data
@Component
@ConfigurationProperties(prefix = "pay")
public class PayFactory implements ApplicationContextAware{

    //Spring容器
    private static ApplicationContext applicationContext;

    //支付键值对信息
    private Map<String,String> paymap;

    /***
     * 创建支付通道，从paymap中获取对应通道的实例名字，从applicationContext获取通道实例
     */
    public PayChannel createChannel(String key){
        return applicationContext.getBean(paymap.get(key),PayChannel.class);
    }

    /***
     * 获取容器
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        PayFactory.applicationContext = applicationContext;
    }
}
