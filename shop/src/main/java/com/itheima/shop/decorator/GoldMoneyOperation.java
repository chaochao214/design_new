package com.itheima.shop.decorator;

import com.itheima.shop.dao.UserDao;
import com.itheima.shop.domain.Order;
import com.itheima.shop.domain.User;
import com.itheima.shop.log.LogComponent;
import com.itheima.shop.log.ThreadUserLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.decorator.GoldMoneyOperation
 ****/
@Component
public class GoldMoneyOperation extends Decorator{

    @Autowired
    private ThreadUserLog threadUserLog;

    @Autowired
    private UserDao userDao;

    /***
     * 扩展功能：金币优惠后计算
     */
    @Override
    public Integer operation(Order order) {
        //订单基本金额计算
        Integer payMoney = super.operation(order);

        //金币优惠
        payMoney = gold(payMoney);
        return payMoney;
    }

    /***
     * 金币优惠计算
     */
    public Integer gold(Integer payMoney) {
        if(payMoney<=0){
            return 0;
        }
        //获取当前用户的会话->结合了享元模式
        LogComponent logComponent = threadUserLog.get();
        User user = userDao.findByUserName(logComponent.getUsername());
        if(user.getGold()<=0){
            return payMoney;
        }

        //剩余金币
        int remaining = 0;

        //金币比payMoney小
        if(payMoney>=user.getGold()){
            payMoney = payMoney-user.getGold();
        }else{
            remaining = user.getGold()-payMoney;
            payMoney = 0;
        }
        //更新用户剩余金币
        userDao.modifyGold(logComponent.getUsername(),remaining);
        return payMoney;
    }
}
