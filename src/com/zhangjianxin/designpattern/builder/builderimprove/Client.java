package com.zhangjianxin.designpattern.builder.builderimprove;

import com.zhangjianxin.designpattern.builder.builderimprove.houseImpl.HouseImplFactory;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-04 14:13
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) {
        //盖普通房子工厂模式获取建的房子类型
        AbsHouseBuilder houseBuilder = HouseImplFactory.houseFactory("1");
        //准备建造房子的指挥者
        HouseDirector director = new HouseDirector(houseBuilder);
        //建造房子
        House house = director.constructHouse();

        //建高楼,修改建造房子的指挥者
        director.setHouseBuilder(HouseImplFactory.houseFactory("2"));
        director.constructHouse();
    }
}
