package com.zhangjianxin.designpattern.factorypattern.factorymethod.pizza;

/**
 * @Author: zhangjianxin
 * @Create: 2019-07-20 15:13
 * @Version V1.0
 **/
public class BJCheessPizza extends Pizza {

    public void perpare() {
        setName("beijingcheess");
        System.out.println("beijingcheesspizza在准备");
    }
}
