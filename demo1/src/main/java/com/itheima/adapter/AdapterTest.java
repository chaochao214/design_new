package com.itheima.adapter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.adapter.AdapterTest
 ****/
public class AdapterTest {

    public static void main(String[] args) {
        ApplicationContext act = new ClassPathXmlApplicationContext("spring-adapter.xml");
        UserCardService userCardService = (UserCardService) act.getBean("proxyBean");
        userCardService.card("王五");
    }
}
