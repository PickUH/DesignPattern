package com.zhangjianxin.designpattern.proxymode;

/**
 * 代理模式：为一个对象提供一个替身，以控制对这个对象的访问，即通过代理对象访问目标对象，
 *
 * 好处是：可以在目标对象实现的基础上，增强额外的功能操作，即扩展目标对象的功能
 *
 * 代理模式三种：静态代理，动态代理（jdk代理，接口代理），cglib代理（可以在内存中动态创建对象，而不需要实现接口，属于动态代理）
 *
 * 静态代理：
 *
 * 动态代理：不需要实现接口，但是目标对象需要实现使劲儿，否则不能用动态代理，是利用jdk的api，动态的在内存中构建代理对象
 *
 * cglib代理：也叫做子类代理，基于拦截器的代理，底层通过字节码处理框架ASM来转换字节码并生成新的类
 *            final类不能被代理，final/static方法不会被代理
 *
 * @Author: zhangjianxin
 * @Create: 2019-08-31 17:01
 * @Version V1.0
 **/
public class Mode {

}