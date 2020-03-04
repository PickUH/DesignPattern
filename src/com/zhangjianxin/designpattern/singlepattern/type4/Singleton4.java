package com.zhangjianxin.designpattern.singlepattern.type4;

/**
 * 懒汉式（线程安全）
 * 方法同步效率太低
 * 实际开发不用
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-18 17:00
 * @Version V1.0
 **/
public class Singleton4 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.toString().hashCode() + "=======" + singleton2.toString().hashCode());
    }
}

class Singleton{
    private Singleton(){}
    private static Singleton instance;

    //懒汉式，加入了同步处理synchronized，解决线程安全问题
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    //懒汉式加载错误,解决不了多线程安全问题，不能用
    public static Singleton getInstance2(){
        if(instance == null){
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}
