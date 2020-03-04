package com.zhangjianxin.designpattern.compoite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-25 15:50
 * @Version V1.0
 **/
public class University extends OrganizationComponet {

    List<OrganizationComponet> organizationComponets = new ArrayList<OrganizationComponet>();

    public University(String name, String descript) {
        super(name, descript);
    }

    @Override
    protected void print() {
        System.out.println("---------" + getName() + "----------");
        for (OrganizationComponet componet: organizationComponets){
            componet.print();
        }
    }

    @Override
    protected void add(OrganizationComponet organizationComponet) {
        organizationComponets.add(organizationComponet);
    }

    @Override
    protected void remove(OrganizationComponet organizationComponet) {
        organizationComponets.remove(organizationComponet);
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
