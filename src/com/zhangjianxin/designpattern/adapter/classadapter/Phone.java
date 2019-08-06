package com.zhangjianxin.designpattern.adapter.classadapter;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-04 15:42
 * @Version V1.0
 **/
public class Phone {
    public void charging(IVoltage5V voltage5V){
        if(voltage5V.output5V() == 5){
            System.out.println("电压为5V，充电");
        }else{
            System.out.println("电压过高，无法充电");
        }
    }
}
