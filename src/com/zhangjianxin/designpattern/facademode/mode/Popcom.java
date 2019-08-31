package com.zhangjianxin.designpattern.facademode.mode;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 14:10
 * @Version V1.0
 **/
public class Popcom {

    private static Popcom popcom = new Popcom();

    private Popcom() {
    }

    public static Popcom getInstance(){
        return popcom;
    }

    public void on() {
        System.out.println("popcom on");
    }

    public void off() {
        System.out.println("popcom off");
    }

    public void pop() {
        System.out.println("zaipop");
    }
}
