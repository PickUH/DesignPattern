package com.zhangjianxin.designpattern.decoratormode.mode.impl;

import com.zhangjianxin.designpattern.decoratormode.mode.Drink;

/**
 * 装饰者的抽象类，组合了被装饰者
 * @Author: zhangjianxin
 * @Create: 2019-08-19 20:57
 * @Version V1.0
 **/
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    public Float cost() {
        return getPrice() + obj.cost();
    }

    @Override
    public String getDescribe() {
        return describe + "=="+ getPrice() +"&&"+  obj.getDescribe();
    }
}
