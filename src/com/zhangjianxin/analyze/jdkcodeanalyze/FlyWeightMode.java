package com.zhangjianxin.analyze.jdkcodeanalyze;

/**
 * @Author: zhangjianxin
 * @Create: 2019-08-31 16:32
 * @Version V1.0
 **/
public class FlyWeightMode {
    public static void main(String[] args) {
        //如果 Integer.valueOf(x) x 在  -128 --- 127 直接，就是使用享元模式返回,如果不在范围类，则仍然 new

        //小结:
        //1. 在valueOf 方法中，先判断值是否在 IntegerCache 中，如果不在，就创建新的Integer(new), 否则，就直接从 缓存池返回
        //2. valueOf 方法，就使用到享元模式
        //3. 如果使用valueOf 方法得到一个Integer 实例，范围在 -128 - 127 ，执行速度比 new 快

        Integer x = Integer.valueOf(127);
        Integer y = new Integer(127);
        Integer z = Integer.valueOf(127);
        Integer w = new Integer(127);

        System.out.println(x.equals(y));
        System.out.println(x == y );
        System.out.println(x == z );
        System.out.println(w == x );
        System.out.println(w == y );


        Integer x1 = Integer.valueOf(200);
        Integer x2 = Integer.valueOf(200);
        System.out.println("x1==x2" + (x1 == x2));
    }
}
