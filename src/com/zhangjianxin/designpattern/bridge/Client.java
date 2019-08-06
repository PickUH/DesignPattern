package com.zhangjianxin.designpattern.bridge;

import com.zhangjianxin.designpattern.bridge.brandimpl.XiaoMi;
import com.zhangjianxin.designpattern.bridge.impl.FoldedPhoneImpl;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-04 18:21
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) {
        //获取折叠式手机
        Phone foldedPhone = new FoldedPhoneImpl(new XiaoMi());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();
    }
}
