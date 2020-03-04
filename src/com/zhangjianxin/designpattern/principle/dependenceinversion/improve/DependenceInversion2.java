package com.zhangjianxin.designpattern.principle.dependenceinversion.improve;

/**
 * 依赖方式传递的三种方式
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-14 16:27
 * @Version V1.0
 **/
public class DependenceInversion2 {
    public static void main(String[] args) {

    }
}

class ChongHong implements Itv{

    public void play() {
        System.out.println("changgongdaying");
    }
}
//方式1
//interface IOPenAndClose{
//    void open(Itv tv);
//    void close(Itv tv);
//}
//
//interface Itv{
//    void play();
//}
//
//class OpenAndClose implements IOPenAndClose{
//    public void open(Itv tv) {
//        tv.play();
//    }
//
//    public void close(Itv tv) {
//
//    }
//}

//方式2 构造器方法
//interface IOPenAndClose{
//    void open();
//}
//
//interface Itv{
//    void play();
//}
//
//class OpenAndClose implements IOPenAndClose{
//    private Itv tv;
//
//    public OpenAndClose(Itv tv) {
//        this.tv = tv;
//    }
//
//    public void open() {
//        tv.play();
//    }
//}

//方式3 Setter方法
interface IOPenAndClose{
    void open();
}

interface Itv{
    void play();
}

class OpenAndClose implements IOPenAndClose{

    private Itv tv;

    public void setTv(Itv tv) {
        this.tv = tv;
    }

    public void open() {
        this.tv.play();
    }
}


