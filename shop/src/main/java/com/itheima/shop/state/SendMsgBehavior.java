package com.itheima.shop.state;

import com.itheima.shop.domain.Order;
import org.springframework.stereotype.Component;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.state.SendMsgBehavior
 ****/
@Component("sendMsgBehavior")
public class SendMsgBehavior implements State {

    @Override
    public void doAction(Order order) {
        System.out.println("订单支付");
        order.setState(this);
    }

    @Override
    public void execute(){
        System.out.println("订单变更为已支付，需要通知商家发货！");
    }
}
