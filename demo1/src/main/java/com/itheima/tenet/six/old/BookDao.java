package com.itheima.tenet.six.old;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.six.old.BookDao
 ****/
public class BookDao extends MySQLUtil {

    //查询
    public ResultSet query() throws Exception{
        //获得数据库链接
        Connection conn = super.getConn();
        PreparedStatement ps = conn.prepareStatement("select * from table");
        return ps.executeQuery();
    }
}
