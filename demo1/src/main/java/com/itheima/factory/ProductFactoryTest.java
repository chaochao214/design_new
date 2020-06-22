package com.itheima.factory;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.factory.ProductFactoryTest
 ****/
public class ProductFactoryTest {

    public static void main(String[] args) {
        Product mobile = ProductFactory.getBean("mobile");
        Product car = ProductFactory.getBean("car");

        mobile.show();
        car.show();
    }
}
