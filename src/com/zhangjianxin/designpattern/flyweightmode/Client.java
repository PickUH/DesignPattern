package com.zhangjianxin.designpattern.flyweightmode;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 16:20
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) {

        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite webSite = webSiteFactory.getWebSiteCategory("新闻");
        User user = new User();
        user.setName("aaa");
        webSite.use(user);

        webSite = webSiteFactory.getWebSiteCategory("博客");
        user.setName("bbb");
        webSite.use(user);

        webSite = webSiteFactory.getWebSiteCategory("博客");
        user.setName("ccc");
        webSite.use(user);

        int webSiteCount = webSiteFactory.getWebSiteCount();
        System.out.println(webSiteCount);
    }
}
