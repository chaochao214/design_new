package com.itheima.frameworkResource.process;

import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: twc
 * @Date 2020/6/25 15:10
 **/
public class PrintViewHandler implements  ViewHandler{
     // 输出渲染

    @Override
    public void print(HttpServletResponse response, Object result) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.write(JSON.toJSONString(result));
        writer.close();

    }
}
