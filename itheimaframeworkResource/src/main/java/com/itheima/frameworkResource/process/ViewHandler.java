package com.itheima.frameworkResource.process;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2020/6/25 15:02
 **/
public interface ViewHandler {
    // 输出字符串
    default void print(HttpServletResponse response, Object result) throws IOException { };

    default  void  forward(HttpServletRequest request,HttpServletResponse response,Object object) throws ServletException, IOException {};
}
