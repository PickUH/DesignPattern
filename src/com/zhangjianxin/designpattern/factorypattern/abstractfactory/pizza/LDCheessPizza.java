package com.zhangjianxin.designpattern.factorypattern.abstractfactory.pizza;

/**
 * @Author: zhangjianxin
 * @Create: 2019-07-20 15:13
 * @Version V1.0
 **/
public class LDCheessPizza extends Pizza {

    public void perpare() {
        setName("ldcheess");
        System.out.println("ldcheesspizza在准备");
    }
}
