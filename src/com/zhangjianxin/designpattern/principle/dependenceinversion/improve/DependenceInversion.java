package com.zhangjianxin.designpattern.principle.dependenceinversion.improve;

/**
 * 依赖倒转原则
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-14 16:01
 * @Version V1.0
 **/
public class DependenceInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiChat());
    }
}

interface IReceiver{
    String getInfo();
}

class WeiChat implements IReceiver{

    public String getInfo() {
        return "微信";
    }
}

class Email implements IReceiver{
    public String getInfo() {
        return "hello world";
    }
}

//完成一个Person接受消息的功能
//如果获取的对象是微信，短信等，则得新增类，person类也需要重载方法receive方法
//可以使用接口代替receive方法中的具象的参数email，使用接口对象作为参数
class Person {
    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}
