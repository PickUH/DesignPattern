package com.zhangjianxin.designpattern.factorypattern.simplefactory.pizzastore.order;

import com.zhangjianxin.designpattern.factorypattern.simplefactory.pizzastore.SimpleFactory;

/**
 *
 * 披萨客户端
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-20 15:25
 * @Version V1.0
 **/
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
    }
}
