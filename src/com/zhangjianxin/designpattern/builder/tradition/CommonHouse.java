package com.zhangjianxin.designpattern.builder.tradition;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-04 09:40
 * @Version V1.0
 **/
public class CommonHouse extends AbsHouse{
    public void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    public void buildWalls() {
        System.out.println("给普通房子砌墙");
    }

    public void roofed() {
        System.out.println("给普通房子盖房子");
    }
}
