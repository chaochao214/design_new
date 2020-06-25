package com.itheima.frameworkResource.process;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2020/6/25 15:15
 **/
public interface View {

      /*
      * 视图渲染
      * */
      void render(HttpServletRequest request, HttpServletResponse response, Object result) throws ServletException, IOException;

}
