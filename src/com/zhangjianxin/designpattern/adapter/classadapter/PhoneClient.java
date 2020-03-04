package com.zhangjianxin.designpattern.adapter.classadapter;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-04 15:44
 * @Version V1.0
 **/
public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
