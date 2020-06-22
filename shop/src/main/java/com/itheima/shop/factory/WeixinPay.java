package com.itheima.shop.factory;

import org.springframework.stereotype.Component;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.factory.WeixinPay
 ****/
@Component("weixinPay")
public class WeixinPay implements PayChannel {

    @Override
    public void pay(Integer money) {
        System.out.println("微信支付成功！支付金额："+money);
    }
}
