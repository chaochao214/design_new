package com.itheima.tenet.one.news;

import org.springframework.beans.factory.annotation.Autowired;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.one.news.LoginController
 ****/
public class LoginController {

    @Autowired
    private LoginService loginService;

    //①登录，用户请求该方法
    public String login(String username,String password){
        Boolean bo = validate(username,password);   //参数校验
        Object user = loginService.findUser(username, password); //查找用户
        if(user==null){
            return "登录失败";
        }
        return "SUCCESS";
    }


    //②参数校验
    public Boolean validate(String username,String password){
        return true;
    }
}
