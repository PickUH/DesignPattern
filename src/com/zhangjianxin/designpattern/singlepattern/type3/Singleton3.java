package com.zhangjianxin.designpattern.singlepattern.type3;

/**
 * 懒汉式（线程不安全）
 * @Author: zhangjianxin
 * @Create: 2019-07-18 17:00
 * @Version V1.0
 **/
public class Singleton3 {
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

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
