package com.itheima.ParseFile;

import com.itheima.frameworkResource.BaseInit;

import java.io.InputStream;

/**
 * @Author: twc
 * @Date 2020/6/25 16:05
 **/
public abstract class ParseFile {
     private BaseInit baseInit;
     public  abstract  void load(InputStream in);
}
