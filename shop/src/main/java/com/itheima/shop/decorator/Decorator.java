package com.itheima.shop.decorator;

import com.itheima.shop.domain.Order;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.decorator.PayMoneyDecorator
 * ②创建装饰者对象,抽象对象，不能直接使用，让子类进行扩展
 ****/
public abstract class Decorator implements MoneyOperation {

    private MoneyOperation moneyOperation;

    public void setMoneyOperation(MoneyOperation moneyOperation) {
        this.moneyOperation = moneyOperation;
    }

    /***
     * 订单金额计算
     */
    @Override
    public Integer operation(Order order) {
        return moneyOperation.operation(order);
    }
}
