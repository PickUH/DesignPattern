package com.zhangjianxin.designpattern.builder.tradition.client;

import com.zhangjianxin.designpattern.builder.tradition.AbsHouse;
import com.zhangjianxin.designpattern.builder.tradition.CommonHouse;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-04 09:48
 * @Version V1.0
 **/
public class ClientFactory {
    public static AbsHouse createFactory(String type){
        if(type.equals("1")){
            return new CommonHouse();
        }else if(type.equals("2")){
            return null;
        }
        return null;
    }

}
