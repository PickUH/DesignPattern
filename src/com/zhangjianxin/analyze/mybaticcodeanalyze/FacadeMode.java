package com.zhangjianxin.analyze.mybaticcodeanalyze;

import org.apache.ibatis.session.Configuration;

/**
 * configuration基本可以认为是一个外观类，在该类里的ObjectFactory，ObjectFactory，MapperRegistry，该类里的newMetaObject用来处理这些类
 *
 * @Author: zhangjianxin
 * @Create: 2019-08-31 14:38
 * @Version V1.0
 **/
public class FacadeMode {
    public static void main(String[] args) {
        Configuration configuration  = new Configuration();
    }
}
