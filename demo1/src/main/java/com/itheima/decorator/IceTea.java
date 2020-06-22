package com.itheima.decorator;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.decorator.IceTea
 ****/
public class IceTea implements Tea {
    @Override
    public void making() {
        System.out.println("制作一杯奶茶，同时加点冰块！");
    }
}
