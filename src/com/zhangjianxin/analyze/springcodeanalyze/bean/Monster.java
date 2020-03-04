package com.zhangjianxin.analyze.springcodeanalyze.bean;

/**
 * @Author: zhangjianxin
 * @Create: 2019-07-20 18:57
 * @Version V1.0
 **/
public class Monster {
    private Integer id=10;
    private String nickName = "牛魔王";
    private String skill = "芭蕉扇";

    public Monster() {
        System.out.println("monstor被创建。。。");
    }

    public Monster(Integer id, String nickName, String skill) {
        this.id = id;
        this.nickName = nickName;
        this.skill = skill;
    }


}
