package com.itheima.shop.decorator;

import com.itheima.shop.dao.ItemDao;
import com.itheima.shop.domain.Item;
import com.itheima.shop.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.decorator.PayMoneyOperation
 * ①最先计算商品订单金额
 ****/
@Component
public class OrderPayMoneyOperation implements MoneyOperation {

    @Autowired
    private ItemDao itemDao;

    /***
     * 订单金额计算
     */
    @Override
    public Integer operation(Order order) {
        //根据ID查询商品
        Item item = itemDao.findById(order.getItemId());
        //计算订单金额
        return item.getPrice()*order.getNum();
    }
}
