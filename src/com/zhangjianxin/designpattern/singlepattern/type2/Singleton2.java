package com.zhangjianxin.designpattern.singlepattern.type2;

/**
 * 饿汉式(静态代码块)单例
 * 优点：写法简单，类加载时完成对象实例化，避免线程同步问题
 * 缺点：没有懒加载，有可能内存浪费
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-18 16:08
 * @Version V1.0
 **/
public class Singleton2 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton1);
    }

}

class Singleton{

    //2.提供静态变量
    private static Singleton singleton;

    //在静态代码块，创建单例对象
    static {
        singleton = new Singleton();
    }

    //1.构造私有化，外部不能创建
    private Singleton() {

    }

    //3.提供getInstance()方法
    public static Singleton getInstance(){
        return singleton;
    }
}