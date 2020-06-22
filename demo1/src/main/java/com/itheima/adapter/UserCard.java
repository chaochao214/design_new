package com.itheima.adapter;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.adapter.UserCard
 ****/
public class UserCard implements UserCardService {

    @Override
    public void card(String name){
        System.out.println(name+"打卡成功！");
    }
}
