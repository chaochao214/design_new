package com.itheima.tenet.four;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.four.DemoTest
 ****/
public class DemoTest {

    public static void main(String[] args) {
        ApplicationContext act = new ClassPathXmlApplicationContext("spring.xml");
        ChartDisplay chartDisplay = (ChartDisplay) act.getBean("chartDisplay");
        chartDisplay.showChart();
    }
}
