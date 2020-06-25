package com.itheima.Factory;

/**
 * @Author: twc
 * @Date 2020/6/25 16:20
 **/
public interface BeanFactory {
    Object getBean(String id) throws Exception;

    Object getUrlBean(String url) throws  Exception;

}
