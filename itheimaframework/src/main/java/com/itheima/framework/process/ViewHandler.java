package com.itheima.framework.process;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.framework.process.ViewHandler
 *
 * 定义不同渲染（响应）方式
 ****/
public interface ViewHandler {

    //json输出
    default void print(HttpServletResponse response,Object result){};

    //转发
    default void forward(HttpServletRequest request,HttpServletResponse response,Object result){}
}
