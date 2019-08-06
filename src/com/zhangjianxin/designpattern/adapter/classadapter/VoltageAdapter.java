package com.zhangjianxin.designpattern.adapter.classadapter;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-04 15:40
 * @Version V1.0
 **/
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    public Integer output5V() {
        Integer integer = output220V();
        Integer dstV = integer / 44;
        return dstV;
    }
}
