package com.itheima.factory;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.factory.Mobile
 ****/
public class Mobile implements Product {
    //产品详情
    @Override
    public void show() {
        System.out.println("手机：HUAWEI P40 Pro +");
    }
}
