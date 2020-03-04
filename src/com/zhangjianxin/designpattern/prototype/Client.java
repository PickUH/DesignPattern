package com.zhangjianxin.designpattern.prototype;

/**
 * 传统方式解决克隆羊的问题（有一只羊，需要克隆出和这只羊属性一模一样的十只羊）
 *
 * 优点：好理解，简单易操作
 *
 * 缺点：创建新对象时，总是需要重新获取原对象的属性，对象较复杂时不适用，效率低
 *
 * 总是需要重新初始化对象，不是动态获取对象运行时的状态，不够灵活
 *
 * 改进方法：java中Object是所有类的跟类，提供了一个clone的方法，可以将java对象复制一份，
 * 但是需要实现clone的类必须实现一个接口cloneable，该接口表示类能复制且具有复制的能力
 *
 * 这时候就用到了原型模式
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-20 18:30
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep6 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep7 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep8 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
    }
}
