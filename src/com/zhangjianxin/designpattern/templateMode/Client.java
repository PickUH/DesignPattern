package com.zhangjianxin.designpattern.templateMode;

/**
 * @Author: zhangjianxin
 * @Create: 2019-10-20 19:33
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) {
        //制作红豆豆浆
        System.out.println("---制作红豆都将-----");
        SoyaMilk soyaMilk = new RedBeanSoyaMilk();
        soyaMilk.make();


    }
}
