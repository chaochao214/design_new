package com.itheima.singledemo;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.singledemo.SingleModel
 ****/
public class SingleModel {

    //整个应用程序中只有1个实例
    private static SingleModel singleModel = new SingleModel();

    //只有自己能创建自己的实例
    private SingleModel() {
    }

    //对外提供获取该实例的方法
    public static SingleModel getInstance(){
        return singleModel;
    }

    public void message(){
        System.out.println("hello!");
    }
}
