package com.itheima.tenet.seven.news;

import com.itheima.tenet.seven.old.GoodsDao;
import com.itheima.tenet.seven.old.LogDao;
import com.itheima.tenet.seven.old.OrderDao;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.seven.news.OrderService
 ****/
public class OrderService {

    private OrderDao orderDao;
    private LogDao logDao;

    public void add(){
        orderDao.add();
        logDao.recode();
    }
}
