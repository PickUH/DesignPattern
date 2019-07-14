package com.zhangjianxin.designpattern.principle.dependenceinversion;

/**
 * 依赖倒转原则
 *
 * 注意事项和细节
 *
 * 1.底层模块尽量都有抽象类或接口，或者两者都有，程序稳定性更好
 *
 * 2.变量的声明尽量是接口或抽象类，这样变量引用和实际对象之间，就存在一个缓冲层，利于程序扩展和优化
 *
 * 3.继承时遵循里氏替换原则
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-14 16:01
 * @Version V1.0
 **/
public class DependenceInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "hello world";
    }
}

//完成一个Person接受消息的功能
//如果获取的对象是微信，短信等，则得新增类，person类也需要重载方法receive方法
//可以使用接口代替receive方法中的具象的参数email，使用接口对象作为参数
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
