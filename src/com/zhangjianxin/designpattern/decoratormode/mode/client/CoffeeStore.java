package com.zhangjianxin.designpattern.decoratormode.mode.client;

import com.zhangjianxin.designpattern.decoratormode.mode.Drink;
import com.zhangjianxin.designpattern.decoratormode.mode.impl.LongBlack;
import com.zhangjianxin.designpattern.decoratormode.mode.impl.Milk;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-19 21:05
 * @Version V1.0
 **/
public class CoffeeStore {
    public static void main(String[] args) {
        //装饰者模式下点一份咖啡加两份巧克力一份牛奶
        Drink order = new LongBlack();
        System.out.println(order.cost());
        System.out.println(order.getDescribe());

        order = new Milk(order);
        System.out.println(order.cost());
        System.out.println(order.getDescribe());
    }
}
