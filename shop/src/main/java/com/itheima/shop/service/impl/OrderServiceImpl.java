package com.itheima.shop.service.impl;

import com.itheima.shop.dao.OrderDao;
import com.itheima.shop.decorator.CouponsMoneyOperation;
import com.itheima.shop.decorator.GoldMoneyOperation;
import com.itheima.shop.decorator.OrderPayMoneyOperation;
import com.itheima.shop.domain.Order;
import com.itheima.shop.log.LogComponent;
import com.itheima.shop.log.ThreadUserLog;
import com.itheima.shop.service.ItemService;
import com.itheima.shop.service.OrderService;
import com.itheima.shop.state.State;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.service.impl.OrderServiceImpl
 ****/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ItemService itemService;

    @Autowired
    private ThreadUserLog threadUserLog;

    @Autowired
    private State resetStoreBehavior;

    /***
     * 取消订单
     * @param id
     */
    @Override
    public void cancelOrder(String id) {
        //修改订单状态
        Order order = orderDao.findById(id);
        orderDao.modifyStatus(id,2);

        //库存回滚+退款
        resetStoreBehavior.doAction(order);
        order.getState().execute();
    }

    //====================装饰者模式所需对象============================
    @Autowired
    private OrderPayMoneyOperation orderPayMoneyOperation;
    @Autowired
    private CouponsMoneyOperation couponsMoneyOperation;
    @Autowired
    private GoldMoneyOperation goldMoneyOperation;
    //====================装饰者模式所需对象============================

    /***
     * 添加订单
     * @param order
     */
    @Override
    public int add(Order order) {
        //①设置用户名-从共享对象中获取
        order.setUsername(threadUserLog.get().getUsername());

        //装饰者模式计算金额
        //①订单金额计算
        Integer money = orderPayMoneyOperation.operation(order);
        order.setMoney(money);
        //②优惠券金额计算
        couponsMoneyOperation.setMoneyOperation(orderPayMoneyOperation);
        //③使用金币金额计算
        goldMoneyOperation.setMoneyOperation(couponsMoneyOperation);
        Integer payMoney = goldMoneyOperation.operation(order);
        order.setPaymoney(payMoney);

        //修改库存
        int mCount = itemService.modify(order.getNum(), order.getItemId());
        //添加订单
        int addCount = orderDao.add(order);
        return addCount;
    }


}
