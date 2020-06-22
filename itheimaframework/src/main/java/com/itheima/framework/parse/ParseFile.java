package com.itheima.framework.parse;

import java.io.InputStream;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.framework.parse.ParseFile
 ****/
public abstract class ParseFile {

    //加载指定文件
    public abstract void load(InputStream is) throws Exception;
}
