package com.zhangjianxin.designpattern.adapter.classadapter;

/**
 * 被适配的类src类
 * @Author: zhangjianxin
 * @Create: 2019-08-04 15:38
 * @Version V1.0
 **/
public class Voltage220V {

    public Integer output220V(){
        int src = 220;
        System.out.println("电压="+ src + "V");
        return src;
    }
}
