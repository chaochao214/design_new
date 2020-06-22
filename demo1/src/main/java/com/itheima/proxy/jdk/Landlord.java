package com.itheima.proxy.jdk;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.proxy.jdk.Landlord
 * 房东
 ****/
public class Landlord implements LandlordService{

    //收房租
    @Override
    public void pay(String name){
        System.out.println(name);
    }
}
