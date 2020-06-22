package com.itheima.singleton;

import com.carrotsearch.sizeof.RamUsageEstimator;

import java.util.ArrayList;
import java.util.List;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.singleton.DemoTest
 ****/
public class DemoTest {

    //单例模式创建对象-创建10万个对象
    public static void main1(String[] args) {
        //存储所有新建的对象
        List<SingleModel> array = new ArrayList<SingleModel>();
        //创建第1个对象
        SingleModel singleModel = SingleModel.getSingleModel();
        array.add(singleModel);

        //创建10万个其他对象
        for (int i = 0; i <1000000 ; i++) {
            SingleModel singleModel1 = SingleModel.getSingleModel();
            //如果singleModel1!=singleModel，加入到array
            if(singleModel1!=singleModel){
                array.add(singleModel1);
            }
        }

        System.out.println("单利模式占内存："+RamUsageEstimator.sizeOf(array));
    }

    //非单例模式创建对象-创建10万个对象
    public static void main(String[] args) {
        //存储所有新建的对象
        List<Cat> array = new ArrayList<Cat>();
        //创建第1个对象
        Cat cat = new Cat();
        array.add(cat);

        //创建10万个其他对象
        for (int i = 0; i <1000000 ; i++) {
            Cat cat1 = new Cat();
            //如果cat1!=cat，加入到array
            if(cat1!=cat){
                array.add(cat1);
            }
        }

        System.out.println("非单利模式占内存："+RamUsageEstimator.sizeOf(array));
    }
}
