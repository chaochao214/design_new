package com.itheima.tenet.seven.news;

import com.itheima.tenet.seven.old.GoodsDao;
import com.itheima.tenet.seven.old.OrderDao;
import com.itheima.tenet.seven.old.UserDao;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.seven.news.GoodsService
 ****/
public class GoodsService {
    private GoodsDao goodsDao;
    private OrderDao orderDao;

    public void modify(){
        goodsDao.modify();
        orderDao.add();
    }
}
