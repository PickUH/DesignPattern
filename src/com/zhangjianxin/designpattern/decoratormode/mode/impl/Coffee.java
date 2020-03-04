package com.zhangjianxin.designpattern.decoratormode.mode.impl;

import com.zhangjianxin.designpattern.decoratormode.mode.Drink;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-19 20:03
 * @Version V1.0
 **/
public class Coffee extends Drink {
    public Float cost() {
        return super.getPrice();
    }
}
