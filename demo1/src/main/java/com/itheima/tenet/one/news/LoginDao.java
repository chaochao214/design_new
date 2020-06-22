package com.itheima.tenet.one.news;

import org.springframework.beans.factory.annotation.Autowired;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.one.news.LoginDao
 ****/
public class LoginDao {

    @Autowired
    private DBUtil dbUtil;

    //查询数据库
    public Object query() {
        return dbUtil.getConn();
    }
}
