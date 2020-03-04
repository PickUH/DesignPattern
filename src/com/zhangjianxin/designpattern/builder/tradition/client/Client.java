package com.zhangjianxin.designpattern.builder.tradition.client;

import com.zhangjianxin.designpattern.builder.tradition.AbsHouse;
import com.zhangjianxin.designpattern.builder.tradition.CommonHouse;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-04 09:43
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) {
        AbsHouse factory = ClientFactory.createFactory("1");
        factory.build();
    }
}


