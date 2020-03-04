package com.zhangjianxin.designpattern.principle.singleresponsibility;

/**
 * 单一职责原则
 * @Author: zhangjianxin
 * @Create: 2019-07-14 14:07
 * @Version V1.0
 **/
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

/**
 * run方法违反了单一职责原则
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行。。。。");
    }
}
