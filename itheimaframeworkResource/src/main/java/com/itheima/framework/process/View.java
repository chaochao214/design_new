package com.itheima.framework.process;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.framework.process.View
 *
 * 决策使用何种渲染方式
 ****/
public interface View {

    //渲染方法
    void render(HttpServletRequest request, HttpServletResponse response, Object result);

}
