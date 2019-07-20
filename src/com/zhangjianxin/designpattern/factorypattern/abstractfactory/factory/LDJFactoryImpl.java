package com.zhangjianxin.designpattern.factorypattern.abstractfactory.factory;

import com.zhangjianxin.designpattern.factorypattern.abstractfactory.pizza.*;

/**
 * 这是一个工厂子类
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-20 17:22
 * @Version V1.0
 **/
public class LDJFactoryImpl implements AbsFactory {
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("cheese")) {
            pizza = new LDCheessPizza();
        }else if(pizzaType.equals("greek")){
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
