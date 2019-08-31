package com.zhangjianxin.designpattern.facademode.mode;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 14:32
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacate homeTheaterFacate = new HomeTheaterFacate();
        homeTheaterFacate.ready();
        homeTheaterFacate.player();
    }
}
