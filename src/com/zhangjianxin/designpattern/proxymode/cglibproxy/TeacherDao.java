package com.zhangjianxin.designpattern.proxymode.cglibproxy;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 18:04
 * @Version V1.0
 **/
public class TeacherDao {

    public void teach(){
        System.out.println("老师授课中。。。是cglib代理，不需要实现接口");
    }
}
