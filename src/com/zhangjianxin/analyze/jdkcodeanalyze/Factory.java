package com.zhangjianxin.analyze.jdkcodeanalyze;

import java.util.Calendar;

/**
 * @Author: zhangjianxin
 * @Create: 2019-07-20 17:40
 * @Version V1.0
 **/
public class Factory {
    public static void main(String[] args) {

        //calendar的getInstance方法里用到了简单工厂模式
        Calendar cal = Calendar.getInstance();
        System.out.println("年：" + cal.get(Calendar.YEAR));
        System.out.println("月：" + cal.get(Calendar.MONTH));
        System.out.println("日：" + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("时：" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分：" + cal.get(Calendar.MINUTE));
        System.out.println("秒：" + cal.get(Calendar.SECOND));
    }
}
