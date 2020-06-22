package com.itheima.factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.factory.BeanFactoryTest
 ****/
public class BeanFactoryTest {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("spring-factory.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Product car = (Product) beanFactory.getBean("car");
        car.show();
    }
}
