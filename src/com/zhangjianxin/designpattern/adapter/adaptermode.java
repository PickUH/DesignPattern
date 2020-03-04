package com.zhangjianxin.designpattern.adapter;

/**
 * 适配器模式，将一个类的接口转换成另一个接口，让原本接口不兼容的类可以兼容（本质是做一个中转）
 *
 * 类适配器
 * java是单继承机制，所以类适配器需要继承src类是一个缺点，因为要求dst必须是接口，有一定局限性
 *
 * src类的方法在适配器类中都会暴露出来，增加了使用成本
 *
 * 由于继承了src类，所以可以根据需求重写src类的方法，使得适配器类更灵活
 *
 * 对象适配器
 * 不是继承src类，而是持有src类的实例，实现dst接口
 *
 * 接口适配器
 * 核心：当不需要全部实现接口提供的方法，可以先设计一个抽象类实现接口，并为该接口中的每个方法提供一个默认实现（空方法）
 * 继承时可以有选择的重写接口内的方法
 *
 * @Author: zhangjianxin
 * @Create: 2019-08-04 15:29
 * @Version V1.0
 **/
public class adaptermode {
}
