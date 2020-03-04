package com.zhangjianxin.designpattern.decoratormode.mode.impl;

import com.zhangjianxin.designpattern.decoratormode.mode.Drink;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-19 21:03
 * @Version V1.0
 **/
public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDescribe("豆浆");
        setPrice(1.5F);
    }
}
