package com.zhangjianxin.designpattern.factorypattern.simplefactory.pizzastore.order;

import com.zhangjianxin.designpattern.factorypattern.simplefactory.pizzastore.SimpleFactory;
import com.zhangjianxin.designpattern.factorypattern.simplefactory.pizzastore.pizza.CheessPizza;
import com.zhangjianxin.designpattern.factorypattern.simplefactory.pizzastore.pizza.GreekPizza;
import com.zhangjianxin.designpattern.factorypattern.simplefactory.pizzastore.pizza.Pizza;

/**
 * 如果有多个类似orderPizza的类，新加一种pizza的种类，所有类构造方法是需要增加if，太多的if判断,
 *
 * 可以考虑将这些if提出来，放在简单工厂模式里去创建pizza种类
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-20 15:20
 * @Version V1.0
 **/
public class OrderPizza {

//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;
//        do {
//            orderType = "greek";
//            if (orderType.equals("greek")){
//                pizza = new BJGreekPizza();
//            }else if(orderType.equals("cheese")){
//                pizza = new BJCheessPizza();
//            }else {
//                break;
//            }
//        }while (true);
//    }

    private SimpleFactory simpleFactory;

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = getType();
        Pizza pizza = simpleFactory.createPizza(orderType);
        pizza.setName(orderType);
        pizza.perpare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    public OrderPizza(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        setSimpleFactory(this.simpleFactory);
    }

    private String getType(){

        return "greek";
    }
}
