package com.zhangjianxin.designpattern.proxymode.dynamicproxy;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 17:31
 * @Version V1.0
 **/
public class TeacherDao implements ITeacherDao {

    public void teach() {
        System.out.println("老师在授课");
    }
}
