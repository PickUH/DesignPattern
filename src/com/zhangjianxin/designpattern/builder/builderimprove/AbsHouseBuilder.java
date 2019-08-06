package com.zhangjianxin.designpattern.builder.builderimprove;

/**
 * 抽象的建造者
 * @Author: zhangjianxin
 * @Create: 2019-08-04 14:00
 * @Version V1.0
 **/
public abstract class AbsHouseBuilder {
    private House house = new House();

    //将建造的流程写好

    public abstract void buildBasic();

    public abstract void buildWall();

    public abstract void roofed();

    public House buildHouse(){
        return house;
    }
}
