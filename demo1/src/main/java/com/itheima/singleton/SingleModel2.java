package com.itheima.singleton;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.singleton.SingleModel
 * 双重锁校验
 ****/
public class SingleModel2 {

    //1.只能有一个实例
    private static SingleModel2 singleModel;

    //2.只能是自己创建自己的实例
    private SingleModel2() {
    }

    //3.对外提供一个方法用于获取唯一实例
    public static SingleModel2 getSingleModel(){
        if(singleModel==null){
            synchronized (SingleModel2.class){
                if(singleModel==null){
                    singleModel =  new SingleModel2();
                }
            }
        }
        return singleModel;
    }
}
