package com.itheima.tenet.five.old;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.five.old.DataRead
 ****/
public interface DataRead {

    //增删改查
    void query();
    void insert();
    void delete();
    void update();

    //定时任务执行
    void queryTask();
    void createTask();

    //报表
    void reportExcel();
}
