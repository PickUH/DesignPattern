package com.zhangjianxin.designpattern.templateMode;

/**
 * @Author: zhangjianxin
 * @Create: 2019-10-20 19:25
 * @Version V1.0
 **/
public abstract class SoyaMilk {

    /**
     * 模板方法，一般做成final，不让子类去覆盖
     */
    final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }

    /**
     * 选材料
     */
    void select(){
        System.out.println("第一步，选择好的新鲜黄豆");
    }

    /**
     * 添加不同的配料
     */
    abstract void addCondiments();

    /**
     * 浸泡
     */
    void soak(){
        System.out.println("第三步：黄豆与配料进行浸泡");
    }

    /**
     * 打豆浆
     */
    void beat(){
        System.out.println("第四步：黄豆与配料放到豆浆机打碎");
    }
}
