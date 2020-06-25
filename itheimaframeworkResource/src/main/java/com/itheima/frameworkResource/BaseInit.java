package com.itheima.frameworkResource;



import com.itheima.frameworkResource.util.ParseAnnotation;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @Author: twc
 * @Date 2020/6/25 11:25
 **/
public class BaseInit extends HttpServlet {

    public static Map<String, Method> methods;

    @Override
    public void init(ServletConfig config) throws ServletException {
        /*// config.getInitParameter 获取web.xml中的配置参数
        // ? 这里具体怎么实现的方法调用？getInitParameter 是接口方法
        String conf = config.getInitParameter("contextLocation");

        if (conf!=null) {
            InputStream is = BaseInit.class.getClassLoader().getResourceAsStream(conf);
        }*/

//        解析requestMapping注解
        try {
            methods = ParseAnnotation.parseRequestMapping();
            System.out.println(methods);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
