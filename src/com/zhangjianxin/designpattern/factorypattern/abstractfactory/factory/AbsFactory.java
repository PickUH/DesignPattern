package com.zhangjianxin.designpattern.factorypattern.abstractfactory.factory;

import com.zhangjianxin.designpattern.factorypattern.abstractfactory.pizza.Pizza;

/**
 * 是一个抽象工厂模式的抽象层
 * @author: zhangjianxin
 * @create: 2019-07-20 17:21
 * @Version V1.0
 **/
public interface AbsFactory {
    public Pizza createPizza(String pizzaType);
}
