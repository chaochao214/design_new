package com.itheima.shop.state;

import com.itheima.shop.domain.Order;
import org.springframework.stereotype.Component;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.state.ResetStoreBehavior
 ****/
@Component("resetStoreBehavior")
public class ResetStoreBehavior implements State {
    @Override
    public void doAction(Order order) {
        System.out.println("订单取消");
        order.setState(this);
    }

    @Override
    public void execute(){
        System.out.println("订单取消，执行库存回滚！");
        System.out.println("订单取消，执行退款！");
    }
}
