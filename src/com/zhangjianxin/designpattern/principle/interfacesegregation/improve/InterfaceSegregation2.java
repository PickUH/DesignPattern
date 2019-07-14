package com.zhangjianxin.designpattern.principle.interfacesegregation.improve;

/**
 * @Author: zhangjianxin
 * @Create: 2019-07-14 15:30
 * @Version V1.0
 **/
public class InterfaceSegregation2 {

}

interface Interface1{
    void operation1();
}
interface Interface2{
    void operation2();
    void operation3();
}
interface Interface3{
    void operation4();
    void operation5();
}

class B implements Interface1,Interface2{
    public void operation1() {
        System.out.println("B shixian 1");
    }

    public void operation2() {
        System.out.println("Bshixian2");
    }

    public void operation3() {
        System.out.println("Bshixian3");
    }
}

class D implements Interface1,Interface3{
    public void operation1() {
        System.out.println("Dshixian1");
    }

    public void operation4() {
        System.out.println("Dshixian2");
    }

    public void operation5() {
        System.out.println("Dshixian3");
    }
}

class A {
    public void depend1(Interface1 i){
        i.operation1();
    }

    public void depend2(Interface2 i){
        i.operation2();
    }

    public void depend3(Interface2 i){
        i.operation3();
    }
}

class C {
    public void depend1(Interface1 i){
        i.operation1();
    }

    public void depend2(Interface3 i){
        i.operation4();
    }

    public void depend3(Interface3 i){
        i.operation5();
    }
}
