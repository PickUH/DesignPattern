package com.zhangjianxin.designpattern.builder.builderimprove.houseImpl;

import com.zhangjianxin.designpattern.builder.builderimprove.AbsHouseBuilder;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-04 14:03
 * @Version V1.0
 **/
public class CommonHouse extends AbsHouseBuilder {
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    public void buildWall() {
        System.out.println("普通房子砌墙10米");
    }

    public void roofed() {
        System.out.println("普通房子盖屋顶");
    }
}
