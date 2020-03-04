package com.zhangjianxin.designpattern.builder;

/**
 * 建造者模式，又叫生成器模式，是一种对象构建模式（创造者模式）它可以将复杂对象的建造过程抽象出来，
 * 使这个抽象过程的不同实现方法可以构造出不同表现（属性）的对象
 *
 * 核心是一步一步构建复杂对象，允许用户只通过指定复杂对象的类型和内容就可以构建他们，无需知道内部的具体细节
 *
 * 核心角色：1.Product（产品角色）一个具体的产品对象
 *          2.Builder（抽象建造者），创建Product的各个部件的接口\抽象类
 *          3.ConcreteBuilder（具体建造者）实现接口，构建和装配各个部件
 *          4.Director（指挥者）构建一个使用Builder接口的对象，主要用于创建复杂对象
 *
 * @Author: zhangjianxin
 * @Create: 2019-08-04 13:08
 * @Version V1.0
 **/
public class BuilderMode {

}
