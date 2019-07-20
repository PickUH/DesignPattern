package com.zhangjianxin.designpattern.singlepattern.type8;

/**
 * 枚举实现，防止反序列化重新创建对象
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-20 14:53
 * @Version V1.0
 **/
public class Singleton8 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;

        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.toString().hashCode());
        System.out.println(singleton2.toString().hashCode());
    }
}

enum Singleton{
    INSTANCE;
    public void sayOk(){
        System.out.println("ok~~");
    }
}
