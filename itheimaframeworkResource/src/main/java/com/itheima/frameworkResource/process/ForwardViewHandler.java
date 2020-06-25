package com.itheima.frameworkResource.process;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2020/6/25 15:13
 **/
public class ForwardViewHandler implements  ViewHandler
{
    @Override
    public void forward(HttpServletRequest request, HttpServletResponse response, Object object) throws ServletException, IOException {

        request.getRequestDispatcher(object.toString()).forward(request,response);
    }
}
