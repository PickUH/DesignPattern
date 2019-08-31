package com.zhangjianxin.designpattern.flyweightmode;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 16:11
 * @Version V1.0
 **/
public class ConcreateWebSite extends WebSite {

    /**
     * 网站发布类型
     */
    private String type = "";

    public ConcreateWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User userName) {
        System.out.println("网站发布形式为：" + type + "===" + userName.getName() + "在使用");
    }
}
