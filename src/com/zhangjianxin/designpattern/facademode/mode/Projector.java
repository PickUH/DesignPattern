package com.zhangjianxin.designpattern.facademode.mode;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 14:13
 * @Version V1.0
 **/
public class Projector {

    private static Projector projector = new Projector();

    private Projector() {
    }

    public static Projector getInstance(){
        return projector;
    }

    public void on() {
        System.out.println("projector on");
    }

    public void off() {
        System.out.println("projector off");
    }

    public void pop() {
        System.out.println("projector");
    }

}
