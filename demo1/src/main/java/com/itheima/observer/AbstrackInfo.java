package com.itheima.observer;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.observer.AbstrackInfo
 ****/
public abstract class AbstrackInfo {

   //观察者模式 耦合，建立了一套触发机制，实现级联更新

    //被监听的对象
    private Clock clock;

    abstract  void message();
}
