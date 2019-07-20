package com.zhangjianxin.designpattern.singlepattern.type1;

/**
 * 饿汉式（静态变量）单例线程安全
 * 优点：写法简单，类加载时完成对象实例化，避免线程同步问题
 * 缺点：没有懒加载，有可能内存浪费
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-18 16:08
 * @Version V1.0
 **/
public class Singleton1 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton1);
    }

}

class Singleton{

    //2.提供静态常量
    private final static Singleton singleton = new Singleton();

    //1.构造私有化，外部不能创建
    private Singleton() {

    }

    //3.提供getInstance()方法
    public static Singleton getInstance(){
        return singleton;
    }
}