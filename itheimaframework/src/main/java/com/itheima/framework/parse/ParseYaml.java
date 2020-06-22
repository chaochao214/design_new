package com.itheima.framework.parse;

import java.io.InputStream;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.framework.parse.ParseYaml
 ****/
public class ParseYaml extends ParseFile {
    @Override
    public void load(InputStream is) throws Exception {
        System.out.println("加载yaml文件");
    }
}
