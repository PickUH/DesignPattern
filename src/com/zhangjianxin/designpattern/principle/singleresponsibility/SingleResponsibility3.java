package com.zhangjianxin.designpattern.principle.singleresponsibility;

/**
 * 将职责分为一个类的多个单一方法，在类层面是违反了单一指责原则的
 *
 * 通常只有逻辑足够简单可以在代码级违反单一职责原则，类中方法足够少，可以在方法级保持单一职责原则
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-14 14:37
 * @Version V1.0
 **/
public class SingleResponsibility3 {
    public static void main(String[] args) {

    }
}

class Vehiler{
    public void runRoad() {

    }
    public void runAir() {

    }
    public void runWater() {

    }
}
