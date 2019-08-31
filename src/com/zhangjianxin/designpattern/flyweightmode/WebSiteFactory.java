package com.zhangjianxin.designpattern.flyweightmode;

import java.util.HashMap;

/**
 *
 * 网站工厂类
 * @Author: zhangjianxin
 * @Create: 2019-08-31 16:14
 * @Version V1.0
 **/
public class WebSiteFactory {
    /**
     * 集合，充当池
     */
    private HashMap<String,ConcreateWebSite> pool = new HashMap<String, ConcreateWebSite>();

    public WebSite getWebSiteCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreateWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    public int getWebSiteCount(){
        return pool.size();
    }
}
