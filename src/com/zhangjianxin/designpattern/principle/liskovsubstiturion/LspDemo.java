package com.zhangjianxin.designpattern.principle.liskovsubstiturion;

/**
 * 里氏替换原则，所有引用基类的地方必须可以透明的使用其子类，如果不行，就是违反了里氏替换原则
 * <p>
 * 在使用继承时，遵循里氏替换原则，在子类中尽量不要重写父类的方法
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-14 17:00
 * @Version V1.0
 **/
public class LspDemo {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("父类A的方法" + a.func1(9, 8));

        B b = new B();
        //因为B继承了A，调用者认为b也有func1方法,结果没注意到B类中已经将Func1方法重写了，会造成逻辑的混乱，违反了里氏替换
        //如果有不得已的理由需要重写父类的方法，建议将两个类的继承关系去掉。用组合，聚合等方式完成，遵循里氏替换原则
        System.out.println("B" + b.func1(9, 8));
    }
}

class A {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends A {

    /**
     * 既然父类定义了func1方法，子类又去重写该方法，那要父类的意义何在，有父类本来就是为了解决代码的重用性，结果还是重写了
     * @param num1
     * @param num2
     * @return
     */
    @Override
    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}
