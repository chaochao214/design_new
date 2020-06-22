package com.itheima.singledemo;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.singledemo.SingleModel
 ****/
public class SingleModel2 {

    //整个应用程序中只有1个实例
    private static SingleModel2 singleModel;

    //只有自己能创建自己的实例
    private SingleModel2() {
    }

    //对外提供获取该实例的方法
    public static SingleModel2 getInstance(){
        //当singleModel==null，才去实例化
        if(singleModel==null){
            synchronized (SingleModel2.class){
                if(singleModel==null){
                    singleModel = new SingleModel2();
                }
            }
        }
        return singleModel;
    }

    public void message(){
        System.out.println("hello!");
    }
}
