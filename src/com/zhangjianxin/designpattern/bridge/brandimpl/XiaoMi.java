package com.zhangjianxin.designpattern.bridge.brandimpl;

import com.zhangjianxin.designpattern.bridge.Brand;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-04 18:17
 * @Version V1.0
 **/
public class XiaoMi implements Brand {
    public void call() {
        System.out.println("小米打电话");
    }

    public void open() {
        System.out.println("小米开机");
    }

    public void close() {
        System.out.println("小米关机");
    }
}
