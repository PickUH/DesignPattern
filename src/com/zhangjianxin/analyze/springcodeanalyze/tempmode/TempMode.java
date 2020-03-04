package com.zhangjianxin.analyze.springcodeanalyze.tempmode;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模板方法在spring中的应用
 * @Author: zhangjianxin
 * @Create: 2019-10-20 19:51
 * @Version V1.0
 **/
public class TempMode {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext();
        //ConfigurableApplicationContext该类的refresh方法就是一个模板方法 postProcessBeanFactory是钩子方法
    }
}
