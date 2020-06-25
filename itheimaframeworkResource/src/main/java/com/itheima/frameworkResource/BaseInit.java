package com.itheima.frameworkResource;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.InputStream;

/**
 * @Author: twc
 * @Date 2020/6/25 11:25
 **/
public class BaseInit extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {

        String conf = config.getInitParameter("contextLocation");

        if (conf!=null) {
            InputStream resourceAsStream = BaseInit.class.getClassLoader().getResourceAsStream(conf);

        }


    }
}
