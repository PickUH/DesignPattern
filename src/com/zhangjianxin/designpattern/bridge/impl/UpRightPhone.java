package com.zhangjianxin.designpattern.bridge.impl;

import com.zhangjianxin.designpattern.bridge.Brand;
import com.zhangjianxin.designpattern.bridge.Phone;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-04 18:20
 * @Version V1.0
 **/
public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }
}
