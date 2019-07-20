package com.zhangjianxin.designpattern.factorypattern.simplefactory.pizzastore.order;

import com.zhangjianxin.designpattern.factorypattern.simplefactory.pizzastore.SimpleFactory;
import com.zhangjianxin.designpattern.factorypattern.simplefactory.pizzastore.pizza.Pizza;

/**
 * 多个订单类
 * @Author: zhangjianxin
 * @Create: 2019-07-20 16:02
 * @Version V1.0
 **/
public class OrderPizza2 {


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

    public OrderPizza2(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        setSimpleFactory(this.simpleFactory);
    }

    private String getType(){
        return "greek";
    }
}
