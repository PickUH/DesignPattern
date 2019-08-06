package com.zhangjianxin.designpattern.builder.builderimprove;

/**
 * 产品，对应product
 *
 * @Author: zhangjianxin
 * @Create: 2019-08-04 13:58
 * @Version V1.0
 **/
public class House {
    private String basic;
    private String wall;
    private String roofed;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
