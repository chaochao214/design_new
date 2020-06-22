package com.itheima.tenet.seven.news;

import com.itheima.tenet.seven.old.GoodsDao;
import com.itheima.tenet.seven.old.LogDao;
import com.itheima.tenet.seven.old.UserDao;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.seven.news.UserService
 ****/
public class UserService {

    private UserDao userDao;
    private LogDao logDao;

    public void modify(){
        userDao.modify();
        logDao.recode();
    }
}
