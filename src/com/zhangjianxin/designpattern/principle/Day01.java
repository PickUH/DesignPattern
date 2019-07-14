package com.zhangjianxin.designpattern.principle;

/**
 * 设计模式常用七大原则
 *  1.单一职责原则（一个类或者一个方法只干一件事，再类层面或者方法层面职责要单一）
 *  2.接口隔离原则（接口最小原则，拆分接口）
 *  3.依赖倒转原则（类与类之间的关系尽量都是接口）
 *  4.里氏替换原则（子类尽量不要重写父类的方法）
 *  5.开闭原则（对扩展开放（提供方），对修改关闭（使用方尽量不要修改代码））
 *  6.迪米特原则（最少知道原则，直接朋友，类与类之间知道的越少越好，逻辑尽量封装在类内部完成，对外只提供public方法供调用）
 *  7.合成复用原则
 *
 * 代码设计原则核心思想
 *  1.可能需要变化的代码独立出来，不要和不需要变化的代码混在一起
 *  2.针对接口编程，不是针对实现编程
 *  3.为了松耦合设计而努力
 * @Author: zhangjianxin
 * @Create: 2019-07-14 13:31
 * @Version V1.0
 **/
public class Day01 {
    public static void main(String[] args) {
        String a = "111";
    }
}
