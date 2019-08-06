package com.zhangjianxin.designpattern.builder.builderimprove.houseImpl;

import com.zhangjianxin.designpattern.builder.builderimprove.AbsHouseBuilder;
import com.zhangjianxin.designpattern.builder.builderimprove.House;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-04 14:14
 * @Version V1.0
 **/
public class HouseImplFactory {
    public static AbsHouseBuilder houseFactory(String type){
        if (type.equals("1")) {
            return new CommonHouse();
        }else if (type.equals("2")){
            return new HighHouse();
        }
        return null;
    }
}
