package com.itheima.singledemo;

import com.carrotsearch.sizeof.RamUsageEstimator;

import java.util.ArrayList;
import java.util.List;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.singledemo.DemoTest
 ****/
public class DemoTest {

    public static void main1(String[] args) {
        //所有不同对象存储的集合
        List<SingleModel> array = new ArrayList<SingleModel>();
        //获取单利实例
        SingleModel instance1 = SingleModel.getInstance();
        array.add(instance1);

        for (int i = 0; i <100000 ; i++) {
            SingleModel instance2 = SingleModel.getInstance();
            if(instance1!=instance2){
                array.add(instance2);
            }
        }

        System.out.println(RamUsageEstimator.sizeOf(array));
    }


    public static void main(String[] args) {
        //所有不同对象存储的集合
        List<Cat> array = new ArrayList<Cat>();
        //获取单利实例
        Cat cat = new Cat();
        array.add(cat);

        for (int i = 0; i <100000 ; i++) {
            Cat cat1 = new Cat();
            if(cat!=cat1){
                array.add(cat1);
            }
        }

        System.out.println(RamUsageEstimator.sizeOf(array));
    }
}
