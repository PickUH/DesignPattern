package com.zhangjianxin.designpattern.proxymode.cglibproxy;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 18:12
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();

        TeacherDao proxyFactory = (TeacherDao) new ProxyFactory(teacherDao).getProxyInstance();

        proxyFactory.teach();
    }
}
