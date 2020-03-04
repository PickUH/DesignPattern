package com.zhangjianxin.designpattern.flyweightmode;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 16:10
 * @Version V1.0
 **/
public abstract class WebSite {

    /**
     * 抽象方法use
     * @param userName 使用者的名字
     */
    public abstract void use(User userName);
}
