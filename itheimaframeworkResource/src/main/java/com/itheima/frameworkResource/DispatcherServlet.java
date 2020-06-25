package com.itheima.frameworkResource;

import com.itheima.frameworkResource.process.View;
import com.itheima.frameworkResource.process.ViewAdapter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: twc
 * @Date 2020/6/25 11:26
 **/
public class DispatcherServlet  extends  BaseInit{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取uri
        String uri = req.getRequestURI();

        // 响应结果给用户
        try {
            Object result = invoke(uri);
            if (result!=null) {
                 // 响应结果给用户

                // 执行渲染
                View view  = new ViewAdapter();
                view.render(req,resp,result);

            }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }

    public Object invoke(String url) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Method method = methods.get(url);
        if (method!=null) {
            // 获取方法所在的类
            Class<?> clazz = method.getDeclaringClass();
            return method.invoke(clazz.newInstance());
        }
        return null;
    }

}
