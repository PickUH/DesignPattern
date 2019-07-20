package com.zhangjianxin.designpattern.singlepattern.type6;

/**
 * 懒汉式线程安全
 * 采用双重检查，是多线程开发中经常使用到的，实例化代码只会执行一次，后面在访问时，instance已不为空，直接return
 * 实际开发推荐使用
 * @Author: zhangjianxin
 * @Create: 2019-07-20 14:40
 * @Version V1.0
 **/
public class Singleton6 {
    public static void main(String[] args) {

    }
}

class Singleton{

    private static volatile Singleton instance;

    private Singleton() { }

    /**
     * 采用双重检查，是多线程开发中经常使用到的，实例化代码只会执行一次，后面在访问时，instance已不为空，直接return
     * @return
     */
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
