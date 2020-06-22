package com.itheima.factory;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.factory.ProductFactory
 ****/
public class ProductFactory {

    /***
     * 根据用户的需求创建不同的产品
     * @return
     */
    public static Product getBean(String name){
        if(name.equals("mobile")){
            return new Mobile();
        }else if(name.equals("car")){
            return new Car();
        }
        return null;
    }
}
