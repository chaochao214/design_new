package com.itheima.decorator;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.decorator.DecoratorTest
 ****/
public class DecoratorTest {

    public static void main(String[] args) {
        //制作奶茶
        Tea iceTea = new IceTea();
        //添加柠檬
        LemonDecoratorTea lemonDecoratorTea = new LemonDecoratorTea();
        lemonDecoratorTea.setTea(iceTea);
        //添加椰汁
        CoconutDecoratorTea coconutDecoratorTea = new CoconutDecoratorTea();
        coconutDecoratorTea.setTea(lemonDecoratorTea);
        //开始制作
        coconutDecoratorTea.making();
    }
}
