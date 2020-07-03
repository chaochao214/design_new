package com.itheima.shop.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.proxy.FileUploadProxy
 * 代理对象
 ****/
@Component
public class FileUploadProxy {

    @Autowired
    private FileUpload aliyunOSSFileUpload;

    @Autowired
    private FileUpload fastdfsFileUpoad;

    @Value("${aliyun.oss.ossPrefix}")
    private List<String> ossPrefix;

    @Value("${fastdfs.fdfsPrefix}")
    private List<String> fdfsPrefix;

    /***
     * 文件上传代理方法
     * @return
     */
    //这特么叫代理模式？ 过于easy 了吧，只是嵌套了一层
    public String upload(byte[] buffers , String extName){
        //上传至云OSS
        for (String prefix : ossPrefix) {
            if(extName.equals(prefix)){
                return aliyunOSSFileUpload.upload(buffers,extName);
            }
        }

        //FastDFS
        for (String prefix : fdfsPrefix) {
            if(extName.equals(prefix)){
                return fastdfsFileUpoad.upload(buffers,extName);
            }
        }
        //默认传 FastDFS
        return fastdfsFileUpoad.upload(buffers,extName);
    }
}
