package com.itheima.frameworkResource.process;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2020/6/25 15:19
 **/
public class ViewAdapter implements  View {
    private ViewHandler viewHandler;

    @Override
    public void render(HttpServletRequest request, HttpServletResponse response, Object result) throws ServletException, IOException {
        if (result instanceof  String) {
                viewHandler = new ForwardViewHandler();
                viewHandler.forward(request,response,result);
        }else {
             viewHandler=  new PrintViewHandler();
             // print
             viewHandler.print(response,result);

        }
    }
}
