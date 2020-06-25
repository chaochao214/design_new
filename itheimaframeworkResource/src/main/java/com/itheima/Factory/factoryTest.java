package com.itheima.Factory;

import com.itheima.service.AccountService;

/**
 * @Author: twc
 * @Date 2020/6/25 16:29
 **/
public class factoryTest {
    public static void main(String[] args) throws Exception {

        BeanFactory beanFactory= new XmlBeanFactory("spring.xml");
        AccountService accountService = (AccountService) beanFactory.getBean("accountService");
        System.out.println(accountService);
    }
}
