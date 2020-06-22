package com.itheima.shop.factory;

import org.springframework.stereotype.Component;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.factory.AlibabaPay
 ****/
@Component("aliPay")
public class AliPay implements PayChannel {

    @Override
    public void pay(Integer money) {
        System.out.println("支付宝支付成功！支付金额："+money);
    }
}
