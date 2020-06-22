package com.itheima.aop;

import com.itheima.aop.service.UserService;
import com.itheima.aop.service.UserServiceImpl;
import org.springframework.aop.framework.DefaultAopProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.aop.AopTest
 ****/
public class AopTest {

    public static void main(String[] args) {
        ApplicationContext act = new ClassPathXmlApplicationContext("spring-aop.xml");
        UserService userService = (UserService) act.getBean("userService");
        userService.add();

    }
}
