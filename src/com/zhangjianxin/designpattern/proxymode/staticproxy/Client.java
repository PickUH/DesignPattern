package com.zhangjianxin.designpattern.proxymode.staticproxy;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 17:16
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy proxy = new TeacherDaoProxy(teacherDao);
        proxy.teach();
    }
}
