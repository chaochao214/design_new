package com.itheima.singleton;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.singleton.SingleModel
 * 饿汉式
 ****/
public class SingleModel {

    //1.只能有一个实例
    private static SingleModel singleModel = new SingleModel();

    //2.只能是自己创建自己的实例
    private SingleModel() {
    }

    //3.对外提供一个方法用于获取唯一实例
    public static SingleModel getSingleModel(){
        return singleModel;
    }
}
