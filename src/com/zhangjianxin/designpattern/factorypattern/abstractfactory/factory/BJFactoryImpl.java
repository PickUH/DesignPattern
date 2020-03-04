package com.zhangjianxin.designpattern.factorypattern.abstractfactory.factory;

import com.zhangjianxin.designpattern.factorypattern.abstractfactory.pizza.BJCheessPizza;
import com.zhangjianxin.designpattern.factorypattern.abstractfactory.pizza.BJGreekPizza;
import com.zhangjianxin.designpattern.factorypattern.abstractfactory.pizza.Pizza;

/**
 * 这是一个工厂子类
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-20 17:22
 * @Version V1.0
 **/
public class BJFactoryImpl implements AbsFactory {
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("cheese")) {
            pizza = new BJCheessPizza();
        }else if(pizzaType.equals("greek")){
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
