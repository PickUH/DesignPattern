package com.zhangjianxin.designpattern.templateMode.improve;

/**
 * 制作纯豆浆
 * @Author: zhangjianxin
 * @Create: 2019-10-20 19:41
 * @Version V1.0
 **/
public class PureSoyaMilk extends SoyaMilk{

    @Override
    void addCondiments() {

    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
