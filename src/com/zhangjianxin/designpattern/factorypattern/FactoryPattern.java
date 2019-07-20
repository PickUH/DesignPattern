package com.zhangjianxin.designpattern.factorypattern;

/**
 * 工厂模式的意义
 * 将实例化对象的代码提取出来，放在一个类中统一管理与维护。达到和主项的依赖关系的解耦合，提高项目的扩展与维护性
 * 三种工厂模式（简单工厂，工厂方法，抽象工厂）
 *
 * 创建对象实例时，不要直接new，new的动作放在工厂类中，变量不要直接持有具体类的引用
 *
 * 不要让类继承具体类，继承接口或抽象类
 *
 * 不要覆盖基类中的方法（里氏替换原则）
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-20 17:56
 * @Version V1.0
 **/
public class FactoryPattern {

}
