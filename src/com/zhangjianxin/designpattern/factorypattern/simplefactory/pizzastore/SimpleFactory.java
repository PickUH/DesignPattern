package com.zhangjianxin.designpattern.factorypattern.simplefactory.pizzastore;

import com.zhangjianxin.designpattern.factorypattern.simplefactory.pizzastore.pizza.CheessPizza;
import com.zhangjianxin.designpattern.factorypattern.simplefactory.pizzastore.pizza.GreekPizza;
import com.zhangjianxin.designpattern.factorypattern.simplefactory.pizzastore.pizza.Pizza;

/**
 * 将这个工厂类与订单类聚合在一起，订单类里只需要实例化工厂类就可以了,扩展时只需要改这个工厂类就可以了，
 * @Author: zhangjianxin
 * @Create: 2019-07-20 15:38
 * @Version V1.0
 **/
public class SimpleFactory {
    public Pizza createPizza(String pizzaType){
        Pizza pizza = null;
        if (pizzaType.equals("greek")){
            pizza = new GreekPizza();
        }else if(pizzaType.equals("cheese")){
            pizza = new CheessPizza();
        }else {
            System.out.println("无此pizza");
            return null;
        }
        return pizza;
    }
}

