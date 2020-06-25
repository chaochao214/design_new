package com.itheima.Factory;

import com.itheima.frameworkResource.util.XmlBean;

import java.io.InputStream;
import java.util.Map;

/**
 * @Author: twc
 * @Date 2020/6/25 16:21
 **/
public class XmlBeanFactory implements  BeanFactory{

    private  static Map<String,Object> beans;


    public XmlBeanFactory() {
        initBeans();
    }

    // 构造器initbean
    private void initBeans() {
        beans = XmlBean.initBeans();


    }


    public XmlBeanFactory(String config) throws Exception {
        InputStream is = XmlBeanFactory.class.getClassLoader().getResourceAsStream(config);
        XmlBean.load(is);
        initBeans();
    }


    @Override
    public Object getBean(String id) throws Exception {
        return beans.get(id);
    }

    @Override
    public Object getUrlBean(String url) throws Exception {
        return null;
    }
}
