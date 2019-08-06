package com.zhangjianxin.designpattern.builder.tradition;

/**
 * 传统方法实现盖房子问题
 * @Author: zhangjianxin
 * @Create: 2019-08-04 09:38
 * @Version V1.0
 **/
public abstract class AbsHouse {

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
