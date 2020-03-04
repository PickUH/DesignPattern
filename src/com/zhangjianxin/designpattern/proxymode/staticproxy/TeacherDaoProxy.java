package com.zhangjianxin.designpattern.proxymode.staticproxy;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 17:10
 * @Version V1.0
 **/
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    public void teach() {
        System.out.println("代理开始了");
        target.teach();
        System.out.println("代理结束了");
    }
}
