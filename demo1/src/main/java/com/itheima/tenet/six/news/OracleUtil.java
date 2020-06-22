package com.itheima.tenet.six.news;

import java.sql.Connection;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.six.old.OracleUtil
 ****/
public class OracleUtil extends MySQLUtil {

    //获得Oracle链接
    @Override
    public Connection getConn(){
        System.out.println("链接Oracle");
        return null;
    }
}
