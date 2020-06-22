package com.itheima.shop.state;

import com.itheima.shop.domain.Order;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.state.State
 ****/
public interface State {
    /***
     * 变更状态
     * @param order
     */
    void doAction(Order order);

    /***
     * 执行行为
     */
    void execute();
}
