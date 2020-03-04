package com.zhangjianxin.designpattern.facademode.mode;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 14:14
 * @Version V1.0
 **/
public class Screen {

    private static Screen screen = new Screen();

    private Screen() {
    }

    public static Screen getInstance(){
        return screen;
    }

    public void up(){
        System.out.println("screen up");
    }
    public void down(){
        System.out.println("screen down");
    }
}
