package com.itheima.decorator;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.decorator.CoconutDecoratorTea
 ****/
public class CoconutDecoratorTea extends DecoratorTea {

    @Override
    public void making() {
        super.making();
        //扩展功能
        addCoconut();
    }

    /***
     * 添加椰汁
     */
    public void addCoconut(){
        System.out.println("再添加点椰汁！");
    }
}
