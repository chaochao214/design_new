package com.itheima.tenet.one.news;

import org.springframework.beans.factory.annotation.Autowired;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.one.news.LoginService
 ****/
public class LoginService {

    @Autowired
    private LoginDao loginDao;

    public Object findUser(String username, String password) {
        return loginDao.query();
    }
}
