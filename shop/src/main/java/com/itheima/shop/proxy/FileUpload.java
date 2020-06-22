package com.itheima.shop.proxy;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.proxy.FileUpload
 ****/
public interface FileUpload {

    /***
     * 文件上传
     * @param buffers：文件字节数组
     * @param extName：后缀名
     * @return
     */
    String upload(byte[] buffers,String extName);
}
