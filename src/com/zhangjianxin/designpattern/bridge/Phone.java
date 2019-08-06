package com.zhangjianxin.designpattern.bridge;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-04 18:17
 * @Version V1.0
 **/
public abstract class Phone {

    //组合品牌
    private Brand brand = null;

    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open(){
        this.brand.open();
    }

    protected void close(){
        this.brand.close();
    }

    protected void call(){
        this.brand.call();
    }
}
