package com.itheima.adapter;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.adapter.UserCard
 ****/
public class UserCard implements UserCardService {
    // 适配器模式，不通类型之间的适配
    @Override
    public void card(String name){
        System.out.println(name+"打卡成功！");
    }
}
