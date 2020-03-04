package com.zhangjianxin.designpattern.builder.builderimprove;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-04 14:08
 * @Version V1.0
 **/
public class HouseDirector {
    private AbsHouseBuilder houseBuilder = null;

    //1.通过构造器传入houseBUilder

    public HouseDirector(AbsHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //2.可以通过setter方法传入houseBuilder
    public void setHouseBuilder(AbsHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //建造房子交给指挥者

    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
