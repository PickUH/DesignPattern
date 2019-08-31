package com.zhangjianxin.analyze.springcodeanalyze.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zhangjianxin
 * @Create: 2019-07-20 19:22
 * @Version V1.0
 **/
public class ProtoType {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Object id01 = applicationContext.getBean("id01");//这里面用到了原型模式
        System.out.println(id01);

        Object id011 = applicationContext.getBean("id01");
        System.out.println(id011);
    }
}
