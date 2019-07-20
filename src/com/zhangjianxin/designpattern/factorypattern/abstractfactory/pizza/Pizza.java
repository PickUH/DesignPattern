package com.zhangjianxin.designpattern.factorypattern.abstractfactory.pizza;

/**
 * @Author: zhangjianxin
 * @Create: 2019-07-20 15:13
 * @Version V1.0
 **/
public abstract class Pizza {
    protected String name;

    /**
     * 认为原材料每种pizza都不一样，所以做成抽象方法，子类实现
     */
    public abstract void perpare();

    public void bake() {
        System.out.println(name + "baking...");
    }

    public void cut(){
        System.out.println(name + "cuting...");
    }

    public void box(){
        System.out.println(name + "boxing...");
    }

    public void setName(String name) {
        this.name = name;
    }
}
