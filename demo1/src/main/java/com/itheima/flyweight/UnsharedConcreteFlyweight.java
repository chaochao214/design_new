package com.itheima.flyweight;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.flyweight.UnsharedConcreteFlyweight
 ****/
public class UnsharedConcreteFlyweight extends Flyweight {

    //接受外部状态
    public UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    //根据外部状态进行逻辑处理
    @Override
    public void operate(int extrinsic) {
        System.out.println("不共享的具体Flyweight:"+extrinsic);
    }
}
