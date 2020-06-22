package com.itheima.shop.decorator;

import com.itheima.shop.dao.CouponsDao;
import com.itheima.shop.dao.UserDao;
import com.itheima.shop.domain.Coupons;
import com.itheima.shop.domain.Order;
import com.itheima.shop.domain.User;
import com.itheima.shop.log.LogComponent;
import com.itheima.shop.log.ThreadUserLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.decorator.CouponsMoneyOperation
 * ③计算优惠券金额
 ****/
@Component
public class CouponsMoneyOperation extends Decorator {

    @Autowired
    private ThreadUserLog threadUserLog;

    @Autowired
    private CouponsDao couponsDao;

    /***
     * 功能扩展，增加优惠券折扣计算
     */
    @Override
    public Integer operation(Order order) {
        //订单金额计算
        Integer payMoney = super.operation(order);
        //优惠券金额优惠后金额计算
        payMoney = couponsMoney(payMoney,order.getCouponsId());
        return payMoney>0? payMoney:0;
    }


    /***
     * 优惠券折扣计算
     */
    public Integer couponsMoney(Integer payMoney,String couponsId) {
        if(payMoney<=0){
            return 0;
        }

        //获取用户username->结合了享元模式
        LogComponent logComponent = threadUserLog.get();
        //查询优惠券
        Coupons coupons = couponsDao.findByIdAndUserName(couponsId,logComponent.getUsername());
        if(coupons==null){
            return payMoney;
        }

        //价格计算
        payMoney = payMoney-coupons.getMoney();
        //标记优惠券
        couponsDao.modifyCouponsStatus(couponsId);
        return payMoney>0? payMoney:0;
    }
}
