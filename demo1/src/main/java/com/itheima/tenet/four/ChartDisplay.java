package com.itheima.tenet.four;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.two.old.ChartDisplay
 ****/
public class ChartDisplay {

    private AbstractChart abstractChart;

    //展示报表
    public void showChart(){
        abstractChart.display();
    }

    //Setter注入
    public void setAbstractChart(AbstractChart abstractChart) {
        this.abstractChart = abstractChart;
    }
}
