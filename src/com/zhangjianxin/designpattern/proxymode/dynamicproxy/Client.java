package com.zhangjianxin.designpattern.proxymode.dynamicproxy;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 17:40
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ITeacherDao dao = new TeacherDao();

        //给目标对象创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(dao).getProxyInstance();

        //内存中动态生成了代理对象
        Class<? extends ITeacherDao> aClass = proxyInstance.getClass();
        System.out.println(aClass);

        proxyInstance.teach();
    }
}
