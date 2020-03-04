package com.zhangjianxin.designpattern.compoite;

/**
 * 这个类中的add跟remove方法都可以不要写了，因为他是叶子节点（下面没有子节点了）
 * @Author: zhangjianxin
 * @Create: 2019-08-25 15:49
 * @Version V1.0
 **/
public class Department extends OrganizationComponet {
    public Department(String name, String descript) {
        super(name, descript);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescript() {
        return super.getDescript();
    }
}
