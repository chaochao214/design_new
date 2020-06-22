package com.itheima.shop.decorator;

import com.itheima.shop.domain.Order;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.decorator.MoneyOperation
 ****/
public interface MoneyOperation {

    /***
     * 订单金额计算
     * @return
     */
    Integer operation(Order order);
}
