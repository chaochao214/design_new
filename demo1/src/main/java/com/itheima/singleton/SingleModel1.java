package com.itheima.singleton;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.singleton.SingleModel
 * 懒汉式
 ****/
public class SingleModel1 {

    //1.只能有一个实例
    private static SingleModel1 singleModel;

    //2.只能是自己创建自己的实例
    private SingleModel1() {
    }

    //3.对外提供一个方法用于获取唯一实例
    //性能瓶颈
    public static synchronized SingleModel1 getSingleModel(){
        if(singleModel==null){
            singleModel =  new SingleModel1();
        }
        return singleModel;
    }
}
