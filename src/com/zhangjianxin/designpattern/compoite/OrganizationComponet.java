package com.zhangjianxin.designpattern.compoite;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-25 15:49
 * @Version V1.0
 **/
public abstract class OrganizationComponet {
    private String name;
    private String descript;

    protected void add(OrganizationComponet organizationComponet){
        //默认实现
         throw new UnsupportedOperationException();
    };

    protected void remove(OrganizationComponet organizationComponet){
        throw new UnsupportedOperationException();
    }

    public OrganizationComponet(String name, String descript) {
        this.name = name;
        this.descript = descript;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    /**
     * 打印方法
     */
    protected abstract void print();
}
