package com.zhangjianxin.designpattern.proxymode.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 18:05
 * @Version V1.0
 **/
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        //1.创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(target.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建子类对象，即代理对象
        return enhancer.create();
    }

    /**
     * 重写方法，会调用目标对象的方法
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理模式开始。。。。。");
        Object invoke = method.invoke(target, objects);
        System.out.println("cglib代理提交。。。。。");
        return invoke;
    }
}
