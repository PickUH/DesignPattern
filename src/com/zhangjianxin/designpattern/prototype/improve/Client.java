package com.zhangjianxin.designpattern.prototype.improve;


/**
 * 浅拷贝：对于数据类型是基本数据类型的成员变量，会直接进行值传递，
 *        对于数据类型是引用数据类型的成员变量，会进行引用传递
 *  浅拷贝使用默认的clone()方法。
 * <p>
 * 深拷贝：复制所有基本数据类型的成员变量值
 *        为所有引用数据类型的成员变量申请存储空间，并复制每个引用数据类型成员变量所引用的对象，直到该对象可达的所有对象，深拷贝是完全拷贝
 * 实现方式：1.重写clone方法实现，2.通过对象序列化实现
 * <p>
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-20 18:30
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.setFriend(new Sheep("mali",1,"红色"));
        Sheep sheep1 = (Sheep) sheep.clone();
        System.out.println(sheep.toString());
        System.out.println(sheep1.toString());
        System.out.println(sheep.hashCode());//两个对象属性一样 hashcode不同
        System.out.println(sheep1.hashCode());
        System.out.println(sheep1.getFriend().hashCode());//对象类型的成员变量并没有被真正复制一份，引用还指的是原对象的属性，hashcode一致
        System.out.println(sheep.getFriend().hashCode());
        System.out.println(sheep.getName().hashCode());
        System.out.println(sheep1.getName().hashCode());
    }
}
