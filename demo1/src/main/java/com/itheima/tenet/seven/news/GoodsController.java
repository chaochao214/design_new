package com.itheima.tenet.seven.news;

import com.itheima.tenet.seven.old.GoodsDao;
import com.itheima.tenet.seven.old.OrderDao;
import com.itheima.tenet.seven.old.UserDao;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.seven.old.GoodsController
 ****/
public class GoodsController {

    private GoodsService goodsService;

    public void modify(){
        goodsService.modify();
    }
}
