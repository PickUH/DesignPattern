package com.zhangjianxin.designpattern.facademode.mode;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 14:17
 * @Version V1.0
 **/
public class Stereo {

    private static Stereo stereo = new Stereo();

    private Stereo() {
    }

    public static Stereo getInstance(){
        return stereo;
    }

    public void on(){
        System.out.println("stereo on");
    }

    public void up(){
        System.out.println("stereo voice up");
    }

    public void off() {
        System.out.println("stereo voice off");
    }
}
