package com.zhangjianxin.designpattern.factorypattern.abstractfactory.order;

import com.zhangjianxin.designpattern.factorypattern.abstractfactory.factory.AbsFactory;
import com.zhangjianxin.designpattern.factorypattern.abstractfactory.pizza.Pizza;

/**
 * @Author: zhangjianxin
 * @Create: 2019-07-20 17:25
 * @Version V1.0
 **/
public class OrderPizza {
    AbsFactory absFactory;
    Pizza pizza = null;

    public OrderPizza(AbsFactory absFactory) {
        this.absFactory = absFactory;
        setAbsFactory(this.absFactory);
    }

    /**
     * 参数是接口类型，传入是哪个子类就是哪个子类的cratePizza方法
     * @param absFactory
     */
    private void setAbsFactory(AbsFactory absFactory) {
        String pizzaType = "greek";
        pizza = this.absFactory.createPizza(pizzaType);
    }


}
