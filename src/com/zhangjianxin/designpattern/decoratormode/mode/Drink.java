package com.zhangjianxin.designpattern.decoratormode.mode;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-19 20:00
 * @Version V1.0
 **/
public abstract class Drink {

    public String describe;
    private Float price = 0.0f;

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public abstract Float cost();
}
