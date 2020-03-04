package com.zhangjianxin.designpattern.facademode.mode;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 14:06
 * @Version V1.0
 **/
public class DVDPlayer {

    /**
     * 单例模式
     */
    private static DVDPlayer dvdPlayer = new DVDPlayer();

    private DVDPlayer() {
    }

    public static DVDPlayer getInstance() {
        return dvdPlayer;
    }

    public void on() {
        System.out.println("zaibofang");
    }

    public void off() {
        System.out.println("guanbi");
    }

    public void play() {
        System.out.println("playing");
    }

    public void pause(){
        System.out.println("pausing");
    }
}
