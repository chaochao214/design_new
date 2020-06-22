package com.itheima.shop.service.impl;

import com.itheima.shop.dao.OrderDao;
import com.itheima.shop.domain.Order;
import com.itheima.shop.factory.PayChannel;
import com.itheima.shop.factory.PayFactory;
import com.itheima.shop.service.PayService;
import com.itheima.shop.state.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.service.impl.PayServiceImpl
 ****/
@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private PayFactory payFactory;
    @Autowired
    private State sendMsgBehavior;
    /***
     * 支付
     * @param type
     * @param id
     */
    @Override
    public void pay(String type, String id) {
        //查询订单
        Order order = orderDao.findById(id);

        //通过工厂创建支付通道实例
        PayChannel payChannel = payFactory.createChannel(type);
        //执行支付
        payChannel.pay(order.getPaymoney());

        //修改订单状态 0未支付，1已支付
        orderDao.modifyStatus(id,1);

        //更改订单状态
        sendMsgBehavior.doAction(order);
        //执行行为
        order.getState().execute();
    }
}
