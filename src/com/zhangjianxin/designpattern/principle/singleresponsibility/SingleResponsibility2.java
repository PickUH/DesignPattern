package com.zhangjianxin.designpattern.principle.singleresponsibility;

/**
 * 单一职责原则，将职责分为多个单一的类
 * @Author: zhangjianxin
 * @Create: 2019-07-14 14:18
 * @Version V1.0
 **/
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle vehicle = new RoadVehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}

class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路跑。。。");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在天上飞。。。");
    }
}
class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在水里跑。。。");
    }
}
