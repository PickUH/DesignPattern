package com.zhangjianxin.designpattern.principle.interfacesegregation;

/**
 * 接口隔离原则
 * <p>
 * 客户端不应该依赖他不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上
 * 在该类中是A类通过接口Interface1依赖类B，但A类方法只用到了接口中的的1，2，3方法，B是多实现了接口中的无用方法
 *
 * 隔离做的是事情就是将大的接口拆分为多个接口，分别实现，详情看InterfaceSegregation2类
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-14 15:02
 * @Version V1.0
 **/
public class InterfaceSegregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());// A对B的依赖通过new B();体现
        a.depend2(new B());
        a.depend3(new B());
    }
}

interface Interface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements Interface1 {

    public void operation1() {
        System.out.println("B 实现了1");
    }

    public void operation2() {
        System.out.println("B 实现了2");
    }

    public void operation3() {
        System.out.println("B 实现了3");
    }

    public void operation4() {
        System.out.println("B 实现了4");
    }

    public void operation5() {
        System.out.println("B 实现了5");
    }
}

class D implements Interface1 {
    public void operation1() {
        System.out.println("D 实现了1");
    }

    public void operation2() {
        System.out.println("D 实现了2");

    }

    public void operation3() {
        System.out.println("D 实现了3");

    }

    public void operation4() {
        System.out.println("D 实现了4");

    }

    public void operation5() {
        System.out.println("D 实现了5");

    }
}

class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface1 i) {
        i.operation2();
    }

    public void depend3(Interface1 i) {
        i.operation3();
    }
}

class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface1 i) {
        i.operation4();
    }

    public void depend3(Interface1 i) {
        i.operation5();
    }
}