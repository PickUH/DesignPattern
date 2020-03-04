package com.zhangjianxin.designpattern.singlepattern.type7;

/**
 * 静态内部类形式的单例模式
 * 懒加载，线程安全
 * 静态内部类特点，1.外部类装载时，内部类不会立即装载。2.内部类在装载时是线程安全的
 *
 * 推荐使用
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-20 14:47
 * @Version V1.0
 **/
public class Singleton7 {

}

class Singleton{
    private Singleton() {}

    private static final class Sin{
        private static final Singleton singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return Sin.singleton;
    }
}
