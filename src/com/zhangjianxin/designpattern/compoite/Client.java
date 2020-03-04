package com.zhangjianxin.designpattern.compoite;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-25 16:18
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        OrganizationComponet university = new University("清华大学", "顶级大学");
        OrganizationComponet college = new College("计算机学院","计算机学院");
        OrganizationComponet college1 = new College("信息工程学院","信息工程学院");

        college.add(new Department("软件工程","软工不错"));
        college.add(new Department("网络工程","网络工程不错"));
        college.add(new Department("计算机科学与技术","老牌专业"));

        college1.add(new Department("通信工程","通信工程不好学"));
        college1.add(new Department("信息工程","信息工程好学"));

        university.add(college);
        university.add(college1);

        university.print();

    }
}
