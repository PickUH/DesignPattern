package com.zhangjianxin.designpattern.builder.builderimprove.houseImpl;

import com.zhangjianxin.designpattern.builder.builderimprove.AbsHouseBuilder;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-04 14:06
 * @Version V1.0
 **/
public class HighHouse extends AbsHouseBuilder {
    public void buildBasic() {
        System.out.println("高楼地基");
    }

    public void buildWall() {
        System.out.println("高楼的墙");
    }

    public void roofed() {
        System.out.println("高楼的屋顶");
    }
}
