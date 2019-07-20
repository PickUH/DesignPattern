package com.zhangjianxin.designpattern.singlepattern;

/**
 * 单例模式：指的是采取一定的方法，使得在整个软件系统中，某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法(静态方法)
 * 饿汉式（静态常量，线程安全）****
 * 饿汉式（静态代码块）****
 * 懒汉式（线程不安全）
 * 懒汉式（线程安全，同步方法）
 * 懒汉式（线程不安全，同步代码块）
 * 双重检查**** 推荐使用
 * 静态内部类**** 推荐使用
 * 枚举**** 推荐使用
 *
 * 单例模式核心是将构造方法私有化，外部不能创建对象，只能通过提供的静态方法获取对象实例
 *
 * jdk中的RunTime类使用了饿汉式静态变量的方式实现单例
 *
 * 使用场景：需要频繁的进行创建和销毁的对象，创建对象耗时过多或耗费资源过多（重量级对象）工具类对象，访问数据库或文件的对象
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-18 15:51
 * @Version V1.0
 **/
public class SingletonMode {
    public static void main(String[] args) {

    }
}
