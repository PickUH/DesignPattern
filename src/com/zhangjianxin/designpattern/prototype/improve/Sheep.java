package com.zhangjianxin.designpattern.prototype.improve;

/**
 * @Author: zhangjianxin
 * @Create: 2019-07-20 18:29
 * @Version V1.0
 **/
public class Sheep implements Cloneable{
    private String name;
    private Integer age;
    private String color;
    private Sheep friend;//属性是对象时，克隆原则

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", friend=" + friend +
                '}';
    }

    //克隆该实例，使用默认的clone方法来完成
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (Exception e) {
            System.out.println(11111);
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
