package com.zhangjianxin.designpattern.factorypattern.abstractfactory.pizza;

/**
 * @Author: zhangjianxin
 * @Create: 2019-07-20 15:13
 * @Version V1.0
 **/
public class LDGreekPizza extends Pizza {

    public void perpare() {
        setName("ldgreek");
        System.out.println("ldgreek在准备");
    }
}
