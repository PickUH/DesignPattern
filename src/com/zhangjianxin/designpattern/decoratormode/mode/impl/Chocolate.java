package com.zhangjianxin.designpattern.decoratormode.mode.impl;

import com.zhangjianxin.designpattern.decoratormode.mode.Drink;

/**
 * 具体的装饰者，就是调料
 * @Author: zhangjianxin
 * @Create: 2019-08-19 21:01
 * @Version V1.0
 **/
public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDescribe("巧克力");
        setPrice(3.0f);
    }
}
