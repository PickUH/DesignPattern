package com.zhangjianxin.designpattern.bridge.brandimpl;

import com.zhangjianxin.designpattern.bridge.Brand;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-04 18:17
 * @Version V1.0
 **/
public class Vivo implements Brand {
    public void call() {
        System.out.println("Vivo打电话");
    }

    public void open() {
        System.out.println("Vivo开机");
    }

    public void close() {
        System.out.println("Vivo关机");
    }
}
