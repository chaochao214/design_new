package com.itheima.tenet.three.old;

import java.util.Scanner;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.three.old.SendMessage
 ****/
public class SendMessage {

    public static void main(String[] args) {
        CommonCustomer commonCustomer = new CommonCustomer("王五","13670001111");
        VipCustomer vipCustomer= new VipCustomer("赵六","13670001133");

        send(vipCustomer);
        send(commonCustomer);
    }

    //给VIP客户发消息
    public static void send(VipCustomer vipCustomer){
        System.out.println(vipCustomer.sefInfo());
    }

    //给普通客户发消息
    public static void send(CommonCustomer commonCustomer){
        System.out.println(commonCustomer.sefInfo());
    }
}
