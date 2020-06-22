package com.itheima.decorator;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.decorator.lemonDecoratorTea
 ****/
public class LemonDecoratorTea extends DecoratorTea {

    @Override
    public void making() {
        super.making();
        //功能扩展
        addLemon();
    }

    /***
     * 添加柠檬
     */
    public void addLemon(){
        System.out.println("再添加点柠檬！");
    }
}
