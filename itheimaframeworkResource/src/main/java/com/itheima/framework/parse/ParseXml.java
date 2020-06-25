package com.itheima.framework.parse;

import com.itheima.framework.util.XmlBean;

import java.io.InputStream;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.framework.parse.ParseXml
 ****/
public class ParseXml extends ParseFile{
    @Override
    public void load(InputStream is) throws Exception {
        System.out.println("加载XML文件");
        XmlBean.load(is);
    }
}
