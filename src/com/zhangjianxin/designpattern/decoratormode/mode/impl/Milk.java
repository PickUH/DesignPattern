package com.zhangjianxin.designpattern.decoratormode.mode.impl;

import com.zhangjianxin.designpattern.decoratormode.mode.Drink;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-19 21:03
 * @Version V1.0
 **/
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDescribe("牛奶");
        setPrice(2.0f);
    }
}
