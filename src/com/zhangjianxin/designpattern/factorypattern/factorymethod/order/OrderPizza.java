package com.zhangjianxin.designpattern.factorypattern.factorymethod.order;

import com.zhangjianxin.designpattern.factorypattern.factorymethod.pizza.BJCheessPizza;
import com.zhangjianxin.designpattern.factorypattern.factorymethod.pizza.BJGreekPizza;
import com.zhangjianxin.designpattern.factorypattern.simplefactory.pizzastore.pizza.Pizza;

/**
 * 工厂方法模式，
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-20 15:20
 * @Version V1.0
 **/
public abstract class OrderPizza {


    abstract Pizza createPizza(String pizzaType);

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = "greek";
            pizza = createPizza(orderType);
            pizza.perpare();
        }while (true);
    }

    private String getType(){

        return "greek";
    }
}
