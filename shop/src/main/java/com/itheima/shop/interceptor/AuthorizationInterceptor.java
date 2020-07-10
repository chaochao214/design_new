package com.itheima.shop.interceptor;

import com.itheima.shop.log.LogComponent;
import com.itheima.shop.log.SupplementSource;
import com.itheima.shop.log.ThreadUserLog;
import com.itheima.shop.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.interceptor.AuthorizationInterceptor
 ****/
@Component
public class AuthorizationInterceptor implements HandlerInterceptor {

    @Autowired
    private ThreadUserLog threadUserLog;

    /****
     * 将用户会话存储到ThreadLocal中
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        try {
            //获取令牌
            String authorization = request.getHeader("Authorization");

            //解析令牌
            if(!StringUtils.isEmpty(authorization)){
                Map<String, Object> tokenMap = JwtTokenUtil.parseToken(authorization);
                //将用户数据存入到ThreadLocal中
                LogComponent logComponent = new SupplementSource(
                        tokenMap.get("username").toString()/*,
                        tokenMap.get("sex").toString(),
                        tokenMap.get("role").toString()*/);
                //添加当前线程用户信息记录
                threadUserLog.add(logComponent);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //输出令牌校验失败
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().print("身份校验失败!");
        response.getWriter().close();
        return false;
    }

    /**
     * 移除会话信息
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        threadUserLog.remove();
    }
}
