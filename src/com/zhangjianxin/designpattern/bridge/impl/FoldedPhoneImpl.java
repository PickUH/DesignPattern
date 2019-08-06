package com.zhangjianxin.designpattern.bridge.impl;

import com.zhangjianxin.designpattern.bridge.Brand;
import com.zhangjianxin.designpattern.bridge.Phone;

/**
 * 折叠式手机的具体实现类
 * @Author: zhangjianxin
 * @Create: 2019-08-04 18:18
 * @Version V1.0
 **/
public class FoldedPhoneImpl extends Phone {

    //构造器
    public FoldedPhoneImpl(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("折叠手机");
    }

    public void close(){
        super.close();
        System.out.println("折叠手机");
    }

    public void call(){
        super.call();
        System.out.println("折叠手机");
    }

}
