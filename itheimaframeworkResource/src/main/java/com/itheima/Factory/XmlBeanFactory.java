package com.itheima.Factory;

import com.itheima.frameworkResource.util.ParseAnnotation;
import com.itheima.frameworkResource.util.XmlBean;
import org.apache.commons.lang3.StringUtils;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @Author: twc
 * @Date 2020/6/25 16:21
 **/
public class XmlBeanFactory implements  BeanFactory{

    private  static Map<String,Object> beans;


    // 存储所有请求路径和对应的方法
    private  static  Map<String, Method> methods;

    //uri- id的映射关
     private static  Map<String,String> urIIDmap;


    public XmlBeanFactory() throws Exception {
        initBeans();
    }

    // 构造器initbean
    private void initBeans() throws Exception {
        beans = XmlBean.initBeans();
        // 解析所有controller 里面有@Requestmapping 注解的对象， 并存档到map
         methods= ParseAnnotation.parseRequestMapping();
         urIIDmap= ParseAnnotation.parseUrlMappingInstance(methods,beans);

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
         String id= urIIDmap.get(url);
         // 根据id获取位置值
        if (StringUtils.isNotEmpty(id)) {
             return getBean(id);
        }


        return null;
    }

    public static Map<String, Method> getMethods() {
        return methods;
    }


}
