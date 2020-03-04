package com.zhangjianxin.designpattern.facademode;

/**
 * 外观模式：1.外观类（Facade）为调用端提供统一的调用接口，其知道那些子系统负责处理请求的，从而将调用端的请求代理，给适当的子系统对象
 *          2.调研者：是外观接口的调用者
 *          3.子系统的集合：指模块或者子系统，处理Facade对象指派的任务是功能的具体实现者
 * 主要是解决多个复杂端口带来的使用困难，起到简化用户操作的作用，将客户需要调用的多个接口转化为只需要调用一个接口即可
 * 在mybatis中的configuration中用到了外观模式
 * configuration基本可以认为是一个外观类，在该类里的ObjectFactory，ObjectFactory，MapperRegistry，该类里的newMetaObject用来处理这些类
 *
 * 外观模式对外屏蔽了子系统的细节。降低了客户端对子系统使用的复杂性
 * 可以让子系统内部的模块更容易维护和扩展
 * 通过合理的使用外观模式，可以帮助我们更好的划分访问的层次
 *
 * 系统需要进行分层设计时可以考虑使用外观模式
 *
 * 不能过多使用外观模式，要以系统有层次，利于维护为目的
 *
 * 维护遗留大型系统时，可以考虑外观模式
 *
 * @Author: zhangjianxin
 * @Create: 2019-08-31 13:55
 * @Version V1.0
 **/
public class FacadeMode {
    public static void main(String[] args) {
    }

}
