package com.zhangjianxin.designpattern.proxymode.staticproxy;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 17:09
 * @Version V1.0
 **/
public class TeacherDao implements ITeacherDao {
    public void teach() {
        System.out.println("老师授课中");
    }
}
