package com.itheima.decorator;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.decorator.DecoratorTea
 ****/
public class DecoratorTea implements Tea {

    private Tea tea;

    public void setTea(Tea tea) {
        this.tea = tea;
    }

    /***
     * 制作奶茶
     */
    @Override
    public void making() {
        tea.making();
    }
}
