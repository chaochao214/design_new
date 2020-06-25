package com.itheima.frameworkResource;



import com.itheima.ParseFile.ParseFile;
import com.itheima.ParseFile.ParseXml;
import com.itheima.frameworkResource.util.ParseAnnotation;
import org.apache.commons.lang3.StringUtils;

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
    private ParseFile parseFile=  new ParseXml();

    @Override
    public void init(ServletConfig config) throws ServletException {
        /*// config.getInitParameter 获取web.xml中的配置参数
        // ? 这里具体怎么实现的方法调用？getInitParameter 是接口方法
        String conf = config.getInitParameter("contextLocation");

        if (conf!=null) {
            InputStream is = BaseInit.class.getClassLoader().getResourceAsStream(conf);
        }*/


        try {
            methods = ParseAnnotation.parseRequestMapping();
            System.out.println(methods);

            //观察者 模式 -》 获取当前要解析的配置文件
            String conf = config.getInitParameter("contextLocation");
            if (!StringUtils.isEmpty(conf)) {
                InputStream is = BaseInit.class.getClassLoader().getResourceAsStream(conf);
                // 如果解析配置文件，则通知parsefile 进行解析
                parseFile.load(is);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
