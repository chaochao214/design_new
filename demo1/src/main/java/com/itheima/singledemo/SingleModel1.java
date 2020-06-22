package com.itheima.singledemo;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.singledemo.SingleModel
 ****/
public class SingleModel1 {

    //整个应用程序中只有1个实例
    private static SingleModel1 singleModel;

    //只有自己能创建自己的实例
    private SingleModel1() {
    }

    //对外提供获取该实例的方法
    public static synchronized SingleModel1 getInstance(){
        //当singleModel==null，才去实例化
        if(singleModel==null){
            singleModel = new SingleModel1();
        }
        return singleModel;
    }

    public void message(){
        System.out.println("hello!");
    }
}
