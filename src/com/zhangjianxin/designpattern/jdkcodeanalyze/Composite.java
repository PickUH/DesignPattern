package com.zhangjianxin.designpattern.jdkcodeanalyze;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-25 16:28
 * @Version V1.0
 **/
public class Composite {
    public static void main(String[] args) {

        //1.Map是一个抽象的构建（类似Componet）
        //2.HashMap是一个中间的构建（Composite）实现继承了相关方法
        //3.Node时HashMap的静态内部类，类使leaf叶子节点，没有put，putAll
        Map<Integer,String> hashMap = new HashMap<Integer, String>(16);

    }
}
