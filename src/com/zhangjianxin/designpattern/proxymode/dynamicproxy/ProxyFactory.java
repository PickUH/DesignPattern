package com.zhangjianxin.designpattern.proxymode.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 17:31
 * @Version V1.0
 **/
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 给目标对象生成一个代理对象
     */
    public Object getProxyInstance() {
        //loader:制定当前目标对象使用的类加载器，获取加载器的方法固定
        //interfaces：目标对象实现的接口类型，使用泛型方法确认类型
        //InvocationHandler h: 事件处理，执行目标对象的方法时，会触发事情处理器的方法，会把当前执行的目标对象方法作为参数传入
        Object proxyInstance = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("jdk代理开始");
                //反射机制调用目标对象的方法
                Object invoke = method.invoke(target, args);
                return invoke;
            }
        });
        return proxyInstance;
    }
}
