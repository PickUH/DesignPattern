package com.zhangjianxin.designpattern.facademode.mode;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 14:20
 * @Version V1.0
 **/
public class TheaterLight {

    private static TheaterLight theaterLight = new TheaterLight();

    private TheaterLight() {
    }

    public static TheaterLight getInstance(){
        return theaterLight;
    }

    public void on(){
        System.out.println("theaterLight on");
    }

    public void up(){
        System.out.println("theaterLight up");
    }

    public void dim(){
        System.out.println("theaterLight dim");
    }
}
